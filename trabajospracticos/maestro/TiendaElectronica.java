package trabajospracticos.maestro;

import java.util.ArrayList;
import java.util.HashMap;

public class TiendaElectronica {
    private String nombreTienda;
    private ArrayList<ProductoElectronico> listaProductos;
    private ArrayList<Cliente> listaClientes;
    private HashMap<String, ProductoElectronico> inventarioProductos;

    public TiendaElectronica(String nombreTienda){
        setNombreTienda(nombreTienda);
        this.listaProductos = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.inventarioProductos = new HashMap<>();
    }

    public void venderProducto(String nombreProducto, Cliente cliente){
        ProductoElectronico producto = inventarioProductos.get(nombreProducto);
        if(producto != null && producto.getCantidadStock() > 0){
            producto.setCantidadStock(producto.getCantidadStock()-1);
            cliente.agregarProductoComprado(producto);
        }else{
            System.out.println("Producto no disponible o fuera de stock.");
        }
    }

    public void verProductos(){
        for(ProductoElectronico producto : listaProductos) {
            producto.verProducto();
        }
    }

    public void verClientes(){
        for(Cliente cliente : listaClientes){
            cliente.verCliente();
        }
    }

    public void agregarProducto(ProductoElectronico producto){
        listaProductos.add(producto);
        inventarioProductos.put(producto.getNombreProducto(), producto);
    }

    public void registrarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }


    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
}
