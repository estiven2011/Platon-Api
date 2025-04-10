package co.edu.poli.ces3.platonapi.service;

import co.edu.poli.ces3.platonapi.dao.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoService {
    private static List<Curso> cursos = new ArrayList<>();

    public boolean agregarCurso(Curso nuevo) {
        // validacion curso diferente codigo
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(nuevo.getCodigo())) {
                return false;
            }
        }

        // validacion cupo maximo mayor a 0
        if (nuevo.getCupoMaximo() <= 0) {
            return false;
        }

        cursos.add(nuevo);
        return true;
    }

    public List<Curso> listarTodos() {
        return cursos;
    }

    public List<Curso> buscarCursosPorFacultad(String facultad) {
        List<Curso> resultado = new ArrayList<>();
        for (Curso c : cursos) {
            if (c.getFacultad().equalsIgnoreCase(facultad)) {
                resultado.add(c);
            }
        }
        return resultado;
    }
}
