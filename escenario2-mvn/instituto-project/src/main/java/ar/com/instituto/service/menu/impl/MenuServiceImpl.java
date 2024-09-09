package ar.com.instituto.service.menu.impl;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

import ar.com.instituto.service.curso.CursoService;
import ar.com.instituto.service.menu.MenuService;

public class MenuServiceImpl implements MenuService{

    private CursoService cursoService;

    public MenuServiceImpl(CursoService cursoService){
        this.cursoService = cursoService;
    }

    @Override
    public void mostrarMenu(Scanner scan) {
        int eleccion;
        do{
            System.out.println("Bienvenido al programa! Que desea realizar?: ");
            System.out.println("1- Crear Curso\n2- Registrar estudiante nuevo\n3- Registrar a un  curso a partir de un estudiante existente");
            System.out.println("4- Listar Cursos\n5- Listar Cursos y Estudiantes\n6- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();

            switch (eleccion) {
                case 1: // Crear curso
                    cursoService.crearCurso();
                    break;
                case 2: //Registrar estudiante nuevo
                    System.out.println("Ingrese el ID del curso: ");
                    String idCurso = scan.nextLine();
                    cursoService.inscribirEstudiante(UUID.fromString(idCurso));
                    break;
                case 3: //Registrar estudiante existente
                    System.out.println("Ingrese el ID del curso: ");
                    idCurso = scan.nextLine();
                    System.out.println("Ingrese el DNI del estudiante: ");
                    Long dniEstudiante = scan.nextLong();
                    scan.nextLine();
                    try {
                        cursoService.inscribirEstudianteACurso(UUID.fromString(idCurso), dniEstudiante);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case 4: //Listar curso
                    cursoService.listarCursos();
                    break;
                case 5: //Listar curso y estudiantes
                    cursoService.listarEstudiantesYCurso();
                    break;
                case 6: //Registrar estudiante nuevo
                    System.out.println("Programa Finalizado, gracias por participar!.");
                    break;
                default:
                    break;
            }

        }while(eleccion != 6);
    }
    
}
