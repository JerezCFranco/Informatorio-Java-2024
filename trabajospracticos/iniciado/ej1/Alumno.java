package trabajospracticos.iniciado.ej1;

import java.time.LocalDate;

public class Alumno {

    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private int edad;
    private int id;

    public Alumno(){}

    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento, int edad){
        setNombre(nombre);
        setApellido(apellido);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEdad(edad);
    }
    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento, int edad, int id){
        setNombre(nombre);
        setApellido(apellido);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEdad(edad);
        setId(id);
    }

    public void verAlumno(){
        System.out.println("Nombre y Apellido : " + getNombre()+" "+getApellido()+"\nFecha de nacimiento: "+getFechaDeNacimiento()+"\nEdad: "+getEdad()+" años\n");
    }
    public void verAlumnoLista(){
        System.out.println("Id: " + getId() + "\nNombre y Apellido : " + getNombre()+" "+getApellido()+"\nEdad: "+getEdad()+" años\n");
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public int getEdad() {
        return edad;
    }
    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setId(int id) {
        this.id = id;
    }
}
