package trabajospracticos.iniciado.ej2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import trabajospracticos.iniciado.ej1.Alumno;

public class Ej2 {
    public static void main(String[] args) {
        
        List<Alumno> listaDeAlumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Ricardo", "Fort", LocalDate.of(1968,11,05), 45);
        Alumno alumno2 = new Alumno("Leonel", "Messi", LocalDate.of(1987,06,24), 37);
        Alumno alumno3 = new Alumno("Guido", "Kaczka", LocalDate.of(1987,02,02), 46);
        listaDeAlumnos.add(alumno1);
        listaDeAlumnos.add(alumno2);
        listaDeAlumnos.add(alumno3);
        
        Curso curso = new Curso("Java", true, "Programación en Java", listaDeAlumnos);
        curso.verCurso();
        
    }
}
