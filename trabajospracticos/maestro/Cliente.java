package trabajospracticos.maestro;

import java.util.ArrayList;

public class Cliente {
    private String nombreCliente;
    private String direccion;
    private ArrayList<ProductoElectronico> listaCompra;

    public Cliente(){}
    public Cliente(String nombreCliente, String direccion){
        setNombreCliente(nombreCliente);
        setDireccion(direccion);
        this.listaCompra = new ArrayList<>();
    }

    public void agregarProductoComprado(ProductoElectronico producto){
        this.listaCompra.add(producto);
    }

    public void verCliente(){
        System.out.println("Nombre: " + getNombreCliente() + "\nDireccion: " + getDireccion() + "Lista de compra: " + getListaCompra() + "\n");
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public String getDireccion() {
        return direccion;
    }
    public ArrayList<ProductoElectronico> getListaCompra() {
        return listaCompra;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void agregarCompra(ProductoElectronico productoNombre) {
        this.listaCompra.add(productoNombre);
    }

}
