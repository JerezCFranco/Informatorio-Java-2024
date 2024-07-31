package trabajospracticos.iniciado.ej4;

import java.util.Scanner;
import trabajospracticos.iniciado.ej1.Alumno;
import trabajospracticos.iniciado.ej2.Curso;

import java.util.ArrayList;
import java.util.List;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleccion = 10;
        boolean estaHabilitado = true;
        List<Curso> listaCursos = new ArrayList<>();

        while (eleccion != 0) {
            System.out.println("Bienvenido! que desea realizar?\n1- Agregar Curso\n2- Ver lista de Cursos\n0- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();
            int id = 1;
            if (eleccion == 1) {
                System.out.println("Ingrese el nombre del curso: ");
                String cursoNombre = scan.nextLine();

                System.out.println("El curso esta habilitado?\n1-Si\n2-No");
                int cursoHabilitado = scan.nextInt();
                scan.nextLine();
                if (cursoHabilitado == 1) {
                    estaHabilitado = true;
                } else if (cursoHabilitado == 2) {
                    estaHabilitado = false;
                } else {
                    System.out.println("Número ingresado invalido.");
                }

                System.out.println("Ingrese la descripción del curso: ");
                String cursoDescripcion = scan.nextLine();

                System.out.println("Cuantos alumnos tiene el curso?: ");
                int cantAlumnos = scan.nextInt();
                scan.nextLine();

                List<Alumno> listaAlumnos = new ArrayList<>();
                for (int i = 0; i < cantAlumnos; i++) {
                    System.out.println("Ingrese el nombre del alumno: ");
                    String nombre = scan.nextLine();

                    System.out.println("Ingrese el apellido del alumno: ");
                    String apellido = scan.nextLine();

                    System.out.println("Ingrese la edad del alumno: ");
                    int edad = scan.nextInt();
                    System.out.println();
                    scan.nextLine();
                    Alumno alumno = new Alumno(nombre, apellido, null, edad, id);
                    listaAlumnos.add(alumno);
                    id++;
                }
                Curso curso = new Curso(cursoNombre, estaHabilitado, cursoDescripcion, listaAlumnos);
                listaCursos.add(curso);
            } else if(eleccion == 2){
                for(Curso curso : listaCursos){
                    curso.verCursoLista();
                }
            } else if(eleccion != 1 && eleccion != 2 && eleccion != 0){
                System.out.println("Número ingresado invalido, intente nuevamente.\n");
            }
        }
        System.out.println("Programa finalizado, gracias por participar!.");

        scan.close();
    }
}
