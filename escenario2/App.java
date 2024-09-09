package escenario2;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

import escenario2.dominio.Institucion;

public class App {
    public static void main(String[] args) {
        Institucion institucion = new Institucion();
        int eleccion = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Bienvenido al programa! Que desea realizar?: ");
            System.out.println("1- Crear Curso\n2- Registrar estudiante nuevo\n3- Registrar a un  curso a partir de un estudiante existente");
            System.out.println("4- Listar Cursos\n5- Listar Cursos y Estudiantes\n6- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();

            switch (eleccion) {
                case 1: // Crear curso
                    institucion.crearCurso();
                    break;
                case 2: //Registrar estudiante nuevo
                    System.out.println("Ingrese el ID del curso: ");
                    String idCurso = scan.nextLine();
                    institucion.inscribirEstudiante(UUID.fromString(idCurso));
                    break;
                case 3: //Registrar estudiante existente
                    System.out.println("Ingrese el ID del curso: ");
                    idCurso = scan.nextLine();
                    System.out.println("Ingrese el DNI del estudiante: ");
                    Long dniEstudiante = scan.nextLong();
                    scan.nextLine();
                    try {
                        institucion.inscribirEstudianteACurso(UUID.fromString(idCurso), dniEstudiante);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case 4: //Listar curso
                    institucion.listarCursos();
                    break;
                case 5: //Listar curso y estudiantes
                    institucion.listarEstudiantesYCurso();
                    break;
                case 6: //Registrar estudiante nuevo
                    System.out.println("Programa Finalizado, gracias por participar!.");
                    break;
                default:
                    break;
            }

        }while(eleccion != 6);
        scan.close();
    }
}
