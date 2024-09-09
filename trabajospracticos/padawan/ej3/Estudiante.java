package trabajospracticos.padawan.ej3;

import java.util.ArrayList;

public class Estudiante {
    private int id;
    private String nombre;
    private double promedioIndividual;
    private ArrayList<Calificacion> calificaciones;

    public Estudiante(){}

    public Estudiante(int id, String nombre, ArrayList<Calificacion> calificaciones, double promedioIndividual){
        setId(id);
        setNombre(nombre);
        setCalificaciones(calificaciones);
        setPromedioIndividual(promedioIndividual);
    }

    public void verEstudiante() {
        System.out.println("Id: " + getId() + "\nNombre: " + getNombre() + "\nPromedio: " + getPromedioIndividual());
    }

    public double calcularPromedio(double totalDeCalificaciones){
        int promedio = 0;
        for(Calificacion calificacion : calificaciones){
            promedio+= calificacion.getCalificacion();
        }
        return calificaciones.isEmpty() ? 0 :(double) promedio/totalDeCalificaciones;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Calificacion> getCalificacion() {
        return calificaciones;
    }
    public double getPromedioIndividual() {
        return promedioIndividual;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCalificaciones(ArrayList<Calificacion> calificacion) {
        this.calificaciones = calificacion;
    }
    public void setPromedioIndividual(double promedioIndividual) {
        this.promedioIndividual = promedioIndividual;
    }
}
