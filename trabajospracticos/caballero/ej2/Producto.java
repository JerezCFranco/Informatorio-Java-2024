package trabajospracticos.caballero.ej2;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(){}
    public Producto(int id,String nombre, double precio, int cantidadStock){
        setId(id);
        setNombre(nombre);
        setPrecio(precio);
        setCantidadStock(cantidadStock);
    }
    
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidadStock() {
        return cantidadStock;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
