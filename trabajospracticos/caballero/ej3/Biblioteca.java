package trabajospracticos.caballero.ej3;

import java.util.HashMap;

public class Biblioteca {
    private String nombre;
    private HashMap<String, Libro> listaLibros;

    public Biblioteca(){}
    public Biblioteca(String nombre){
        setNombre(nombre);
        this.listaLibros = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.put(libro.getTitulo(), libro);
    }

    public void buscarLibroTitulo(String tituloLibro){
       Libro libro = listaLibros.get(tituloLibro);
       if(libro != null){
        libro.verLibro();
       }else{
        System.out.println("No se encontro libros con ese Titulo.");
       }
    }

    public void buscarLibroAutor(String autorNombre){
        boolean encontrado = false;
        for(Libro libro : listaLibros.values()){
            if (libro.getAutor().getNombreAutor().equalsIgnoreCase(autorNombre)) {
                libro.verLibro();
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro libros con ese Autor.");
        }
    }

    public void verLibros(){
        for(Libro libro : listaLibros.values()){
            libro.verLibro();
        }
    }

    public String getNombre() {
        return nombre;
    }
    public HashMap<String, Libro> getListaLibros() {
        return listaLibros;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
