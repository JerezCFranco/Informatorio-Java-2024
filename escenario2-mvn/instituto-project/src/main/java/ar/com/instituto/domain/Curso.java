package ar.com.instituto.domain;

import ar.com.instituto.enumeration.ComplejidadEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;


public class Curso {
    private UUID id;
    private String nombre;
    private Integer cantidadHoras;
    private ComplejidadEnum complejidad;

    private Map<Long, Estudiante> estudiantes = new TreeMap<>();
    private List<Examen> examenes = new ArrayList<>();


    public void verDatosCurso(){
        System.out.println("Nombre: " + getNombre() + "\nCantidad de Horas: " + getCantidadHoras() + "\nComplejidad: " + getComplejidad() + "\nEstudiantes: " + estudiantes.values() + "\nExamenes: " + getExamenes() + "\n");
    }
    
    public void agregarEstudianteAlCurso(Estudiante estudiante){
        estudiantes.put(estudiante.getDni(), estudiante);
    }

    public void agregarExamenAlCurso(Examen examen){
        examenes.add(examen);
    }


    public UUID getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getCantidadHoras() {
        return cantidadHoras;
    }
    public ComplejidadEnum getComplejidad() {
        return complejidad;
    }
    public Map<Long, Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public List<Examen> getExamenes() {
        return examenes;
    }


    public void setId(UUID id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidadHoras(Integer cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    public void setComplejidad(ComplejidadEnum complejidad) {
        this.complejidad = complejidad;
    }
    public void setEstudiantes(Map<Long, Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }

    @Override
    public String toString(){
        //Patron builder
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("ID: ")
            .append(this.getId()).append("\n")
            .append("Nombre: ")
            .append(this.getNombre()).append("\n")
            .append("Cantidad de horas: ")
            .append(this.getCantidadHoras()).append("\n")
            .append("Complejidad: ")
            .append(this.getComplejidad()).append("\n")
            .append("---------------------------------------------------\n")
            .toString();
    }
    
}
