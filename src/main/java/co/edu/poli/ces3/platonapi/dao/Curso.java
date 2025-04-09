package co.edu.poli.ces3.platonapi.dao;

public class Curso {
    private Integer id;
    private String nombre;
    private String codigo;
    private  String profesor;
    private Integer cupoMaximo;
    private Integer estudiantesInscritos;
    private String facultad;

    public Curso(Integer id, String nombre, String codigo, String profesor, Integer cupoMaximo, Integer estudiantesInscritos, String facultad) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesor = profesor;
        this.cupoMaximo = cupoMaximo;
        this.estudiantesInscritos = estudiantesInscritos;
        this.facultad = facultad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public Integer getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(Integer estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
