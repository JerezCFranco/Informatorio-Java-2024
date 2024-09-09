package escenario2.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

import escenario2.enumeration.ComplejidadEnum;

public class Institucion {
    private List<Curso> cursos = new ArrayList<>();

    private Estudiante registrarEstudiante(){
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

    public void inscribirEstudiante(UUID idCurso){
        Estudiante estudiante = registrarEstudiante();
        boolean existeCurso = Boolean.FALSE;

        for(Curso curso : this.cursos){

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

    public Curso crearCurso(){
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

        this.cursos.add(nuevoCurso);
        System.out.println("Curso creado satisfactoriamente.");
        return nuevoCurso;
    }

    public void inscribirEstudianteACurso(UUID idCurso, Long dni){
        Estudiante estudiante = null;
        boolean existeElEstudiante = Boolean.FALSE;
        boolean esCursoEncontrado = Boolean.FALSE;

        for(Curso curso: this.cursos){
            if(curso.getEstudiantes().containsKey(dni)){
                estudiante = curso.getEstudiantes().get(dni);
                existeElEstudiante = Boolean.TRUE;
                break;
            }
        }
        if(!existeElEstudiante){
            throw new NoSuchElementException("No existe el estudiante.");
        }

        for(Curso curso: this.cursos){
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

    public void listarEstudiantesYCurso(){
        Set<Estudiante> listasEstudiantesSinRepetir = new HashSet<>();

        //Recorrer los cursos y agregar estudiantes al HashSet
        for(Curso curso : cursos){
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
    
    
    public List<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void listarCursos(){
        System.out.println("Lista de cursos disponibles");
        for(Curso curso : this.cursos){
            System.out.println(curso.toString());
        }
    }
}
