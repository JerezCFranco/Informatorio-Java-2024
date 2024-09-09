package trabajospracticos.caballero.ej3;

public class Libro {
    private int id;
    private String titulo;
    private String genero;
    private Autor autor;

    public Libro(){}

    public Libro(int id,String titulo, String genero, Autor autor){
        setId(id);
        setTitulo(titulo);
        setGenero(genero);
        setAutor(autor);
    }

    public void verLibro(){
        System.out.println("Id: " + getId() + "\nTitulo: " + getTitulo() + "\nGenero: " + getGenero() + "\nAutor: " + getAutor().getNombreAutor() + "\n");
    }

    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }
    public Autor getAutor() {
        return autor;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
