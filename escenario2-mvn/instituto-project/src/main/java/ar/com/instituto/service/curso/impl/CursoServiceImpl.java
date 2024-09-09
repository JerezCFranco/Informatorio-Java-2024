package ar.com.instituto.service.curso.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import ar.com.instituto.domain.Curso;
import ar.com.instituto.domain.Estudiante;
import ar.com.instituto.enumeration.ComplejidadEnum;
import ar.com.instituto.service.curso.CursoService;
import ar.com.instituto.service.estudiante.EstudianteService;
import ar.com.instituto.service.institucion.InstitucionService;

public class CursoServiceImpl implements CursoService{

    private EstudianteService estudianteService;

    private InstitucionService institucionService;

    public CursoServiceImpl(EstudianteService estudianteService, InstitucionService institucionService){
        this.estudianteService = estudianteService;
        this.institucionService = institucionService;
    }

    @Override
    public void inscribirEstudiante(UUID idCurso) {
        Estudiante estudiante =estudianteService.registrarEstudiante();
        boolean existeCurso = Boolean.FALSE;

        for(Curso curso : institucionService.getCursos()){

            if(curso.getId().equals(idCurso)){
                estudiante.getCursos().add(curso);
                curso.getEstudiantes().put(estudiante.getDni(), estudiante);
                existeCurso = Boolean.TRUE;
                break;
            }
        }
        if(existeCurso){
            System.out.println("Estudiante asignado al curso.");
        }
    }

    @Override
    public Curso crearCurso() {
        Curso nuevoCurso = new Curso();
        Scanner scan = new Scanner(System.in);

        nuevoCurso.setId(UUID.randomUUID());

        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = scan.nextLine();
        nuevoCurso.setNombre(nombreCurso);

        System.out.println("Ingrese la complejidad del curso:\n1- Alta\n2- Media\n3- Baja");
        int complejidadCurso = scan.nextInt();
        scan.nextLine();
        
        nuevoCurso.setComplejidad(
            switch(complejidadCurso){
                case 1 -> ComplejidadEnum.ALTA;
                case 2 -> ComplejidadEnum.MEDIA;
                case 3 -> ComplejidadEnum.BAJA;
                default -> null;
            }
        );

        System.out.println("Ingrese cantidad de horas del curso: ");
        int horasCurso = scan.nextInt();
        scan.nextLine();
        nuevoCurso.setCantidadHoras(horasCurso);

        institucionService.getCursos().add(nuevoCurso);
        System.out.println("Curso creado satisfactoriamente.");
        return nuevoCurso;
    }

    @Override
    public void inscribirEstudianteACurso(UUID idCurso, Long dni) {
        Estudiante estudiante = null;
        boolean existeElEstudiante = Boolean.FALSE;
        boolean esCursoEncontrado = Boolean.FALSE;

        for(Curso curso: institucionService.getCursos()){
            if(curso.getEstudiantes().containsKey(dni)){
                estudiante = curso.getEstudiantes().get(dni);
                existeElEstudiante = Boolean.TRUE;
                break;
            }
        }
        if(!existeElEstudiante){
            throw new NoSuchElementException("No existe el estudiante.");
        }

        for(Curso curso: institucionService.getCursos()){
            if (curso.getId().equals(idCurso)){
                estudiante.getCursos().add(curso);
                curso.getEstudiantes().put(estudiante.getDni(), estudiante);
                esCursoEncontrado = Boolean.TRUE;
                break;
            }
        }

        if(!esCursoEncontrado){
            throw new NoSuchElementException("No existe el curso.");
        }else{
            System.out.println("Estudiante asignado al curso.");
        }
    }

    @Override
    public void listarCursos() {
        System.out.println("Lista de cursos disponibles");
        for(Curso curso : institucionService.getCursos()){
            System.out.println(curso.toString());
        }
    }

    @Override
    public void listarEstudiantesYCurso() {
        Set<Estudiante> listasEstudiantesSinRepetir = new HashSet<>();

        //Recorrer los cursos y agregar estudiantes al HashSet
        for(Curso curso : institucionService.getCursos()){
            listasEstudiantesSinRepetir.addAll(curso.getEstudiantes().values());
        }

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(listasEstudiantesSinRepetir);
        System.out.println("Estudiantes: ");
        for(Estudiante estudiante : listaEstudiantes){
            System.out.println(estudiante.toString());

            for(Curso curso : estudiante.getCursos()){
                System.out.println(curso.toString());
            }
        }
    }
    
    
}
