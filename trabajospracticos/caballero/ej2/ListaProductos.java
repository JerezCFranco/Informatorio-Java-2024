package trabajospracticos.caballero.ej2;

import java.util.HashMap;

public class ListaProductos {
    private String nombre;
    private HashMap<String, Producto> productos;

    public ListaProductos(){}
    public ListaProductos(String nombre){
        setNombre(nombre);
        this.productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto){
        productos.put(producto.getNombre(), producto);
    }

    public void actualizarProducto(int id, String nombre, double precio, int cantidadStock){
        for(Producto producto : productos.values()){
            if(producto.getId() == id){
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setCantidadStock(cantidadStock);
                System.out.println("Producto actualizado.");
                return;
            }
        }
        System.out.println("No se encontro el producto, intente nuevamente.");
    }

    public void verProductos(){
        for(Producto producto : productos.values()){
            System.out.println("Id: "+ producto.getId() + "\nProducto: " + producto.getNombre() + "\nPrecio: " + producto.getPrecio() + "$\nCantidad en Stock: " + producto.getCantidadStock() + "\n");
        }
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
