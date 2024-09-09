package trabajospracticos.padawan.ej3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calificacion {
    private int calificacion;
    private int promedioCalificacion;
    private LocalDate fechaDeCreacion;

    public Calificacion(){}

    public Calificacion(int calificacion, LocalDate fechaDeCreacion){
        setCalificacion(calificacion);
        setFechaDeCreacion(fechaDeCreacion);
    }

    public int getCalificacion() {
        return calificacion;
    }
    public int getPromedioCalificacion() {
        return promedioCalificacion;
    }
    public String getFechaDeCreacion() {
        DateTimeFormatter formatoDiaMesAnio = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaDeCreacion.format(formatoDiaMesAnio);
        return fechaFormateada;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

}
