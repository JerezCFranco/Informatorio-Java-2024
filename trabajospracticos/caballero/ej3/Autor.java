package trabajospracticos.caballero.ej3;

public class Autor {
    private String nombreAutor;

    public Autor(){}
    public Autor(String nombreAutor){
        setNombreAutor(nombreAutor);
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
}
