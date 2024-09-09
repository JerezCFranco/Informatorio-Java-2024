package ar.com.instituto.service.estudiante.impl;

import java.time.LocalDate;
import java.util.Scanner;
import ar.com.instituto.domain.Estudiante;
import ar.com.instituto.service.estudiante.EstudianteService;

public class EstudianteServiceImpl implements EstudianteService{
    

    @Override
    public Estudiante registrarEstudiante() {
        Estudiante estudianteNuevo = new Estudiante();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scan.nextLine();
        estudianteNuevo.setNombre(nombreEstudiante);

        System.out.println("Ingrese el DNI del estudiante: ");
        Long dni = scan.nextLong();
        scan.nextLine();
        estudianteNuevo.setDni(dni);
        
        System.out.println("Ingrese el año de nacimiento del estudiante: ");
        int anoDeNacimiento = scan.nextInt();
        scan.nextLine();

        System.out.println("Ingrese el mes de nacimiento del estudiante: ");
        int mesDeNacimiento = scan.nextInt();
        scan.nextLine();

        System.out.println("Ingrese el dia de nacimiento del estudiante: ");
        int diaDeNacimiento = scan.nextInt();
        scan.nextLine();
    
        LocalDate fechaDeNacimiento = LocalDate.of(anoDeNacimiento,mesDeNacimiento,diaDeNacimiento);
        estudianteNuevo.setFechaNacimiento(fechaDeNacimiento);

        return estudianteNuevo;
    }

    
}
