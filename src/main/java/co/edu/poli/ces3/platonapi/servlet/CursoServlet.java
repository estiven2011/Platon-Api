package co.edu.poli.ces3.platonapi.servlet;
import co.edu.poli.ces3.platonapi.dao.Curso;
import co.edu.poli.ces3.platonapi.service.CursoService;
import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cursos")
public class CursoServlet extends HttpServlet {

    private CursoService cursoService = new CursoService();
    private Gson gson = new Gson();

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Iniciando CursoServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String linea;

        while ((linea = reader.readLine()) != null) {
            sb.append(linea);
        }

        Curso curso = gson.fromJson(sb.toString(), Curso.class);

        boolean agregado = cursoService.agregarCurso(curso);


        if (agregado) {
            out.println("curso agregado exitosamente");
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            out.println("nombre duplicado o cupo máximo inválido");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        // Trae el valor de nombre de la facultad
        String facultad = request.getParameter("nombre");

        List<Curso> cursos = new ArrayList<>();

        if (facultad != null) {
            cursos = cursoService.buscarCursosPorFacultad(facultad);

            if (cursos.isEmpty()) {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                out.println("No se encontraron cursos para esta facultad");
                return;
            }
        } else {
            cursos = cursoService.listarTodos();
        }

        out.println(gson.toJson(cursos));
    }
}
