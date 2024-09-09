package ar.com.instituto.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private List<Curso> cursos = new ArrayList<>();
    private String nombre;
    private LocalDate fechaNacimiento;
    private Long dni;

    public Estudiante(){}
    public Estudiante(String nombre, LocalDate fechaNacimiento, Long dni){
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setDni(dni);
        this.cursos = new ArrayList<>();
    }

    public void inscribirACurso(Curso curso){
        cursos.add(curso);
    }

    public void verDatosEstudiante(){
        System.out.println("Nombre: " + getNombre() + "\nFecha de Nacimiento: " + getFechaNacimiento() + "\nDNI: " + getDni() + "\nCursos: " + getCursos() + "\n");
    }


    public List<Curso> getCursos() {
        return cursos;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public Long getDni() {
        return dni;
    }


    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setDni(Long dni) {
        this.dni = dni;
    }
}
