package escenario2.dominio;

import java.time.LocalDateTime;

public class Examen {
    private Curso curso;
    private Estudiante estudiante;
    private Double nota;
    private String descripcion;
    private LocalDateTime fechaExamen;

    public Examen(){}

    public Examen(Curso curso, Estudiante estudiante, Double nota, String descripcion, LocalDateTime fechaExamen){
        setCurso(curso);
        setEstudiante(estudiante);
        setNota(nota);
        setDescripcion(descripcion);
        setFechaExamen(fechaExamen);
    }


    public Curso getCurso() {
        return curso;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public Double getNota() {
        return nota;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public LocalDateTime getFechaExamen() {
        return fechaExamen;
    }


    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setFechaExamen(LocalDateTime fechaExamen) {
        this.fechaExamen = fechaExamen;
    }
}
