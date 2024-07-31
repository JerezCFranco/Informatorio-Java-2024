package trabajospracticos.iniciado.ej1;

import java.time.LocalDate;

public class Ej1 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Ricardo", "Fort", LocalDate.of(1968,11,05), 45);
        Alumno alumno2 = new Alumno("Leonel", "Messi", LocalDate.of(1987,06,24), 37);
        Alumno alumno3 = new Alumno("Guido", "Kaczka", LocalDate.of(1987,02,02), 46);
    
        alumno1.verAlumno();
        alumno2.verAlumno();
        alumno3.verAlumno();
    }
}
