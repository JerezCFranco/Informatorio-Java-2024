package trabajospracticos.padawan.ej1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaDeVencimiento;

    public Tarea(){}
    public Tarea(int id,String titulo, String descripcion, LocalDate fechaDeVencimiento){
        setId(id);
        setTitulo(titulo);
        setDescripcion(descripcion);
        setFechaDeVencimiento(fechaDeVencimiento);
    }

    public void verTarea(){
        System.out.println("Id: " + getId()+"\nTitulo: " + getTitulo()+"\nDescripcion: " + getDescripcion() + "\nFecha de Vencimiento: " + getFechaDeVencimiento()+"\n");
    }

    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getFechaDeVencimiento() {
        DateTimeFormatter formatoDiaMesAnio = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaDeVencimiento.format(formatoDiaMesAnio);
        return fechaFormateada;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}
