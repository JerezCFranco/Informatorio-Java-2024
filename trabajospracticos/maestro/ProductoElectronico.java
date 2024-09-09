package trabajospracticos.maestro;

public class ProductoElectronico {
    private String nombreProducto;
    private String descripcion;
    private double precio;
    private int cantidadStock;

    public ProductoElectronico(){}
    public ProductoElectronico(String nombreProducto, String descripcion, double precio, int cantidadStock){
        setNombreProducto(nombreProducto);
        setDescripcion(descripcion);
        setPrecio(precio);
        setCantidadStock(cantidadStock);
    }

    public void verProducto(){
        System.out.println("Nombre: " + getNombreProducto() + "\nDescripcion: " + getDescripcion() + "\nPrecio: " + getPrecio() + "$\nCantidad en Stock: " + getCantidadStock() + "\n");
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
