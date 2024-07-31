package trabajospracticos.iniciado.ej2;

import java.util.List;

import trabajospracticos.iniciado.ej1.Alumno;

public class Curso {
    
    private String nombre;
    private boolean habilitado;
    private String descripcion;
    private List<Alumno> alumnos;

    public Curso(){};

    public Curso(String nombre, boolean habilitado, String descripcion, List<Alumno> alumnos){
        setNombre(nombre);
        setHabilitado(habilitado);
        setDescripcion(descripcion);
        setAlumnos(alumnos);
    };
    
    public String getNombre() {
        return nombre;
    }
    public boolean getHabilitado(){
        return habilitado;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void verCurso(){
        System.out.println(" Curso: "+getNombre()+"\n Habilitado: "+getHabilitado()+"\n Descripcion: "+getDescripcion());
        System.out.println("Alumnos: ");
        for(Alumno alumno : alumnos){
            alumno.verAlumno();
        }
    }

    public void verCursoLista(){
        System.out.println("Curso: "+getNombre()+"\nHabilitado: "+getHabilitado()+"\nDescripcion: "+getDescripcion());
        System.out.println("Alumnos: ");
        for(Alumno alumno : alumnos){
            alumno.verAlumnoLista();
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
