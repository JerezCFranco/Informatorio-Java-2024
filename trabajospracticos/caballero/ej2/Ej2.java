package trabajospracticos.caballero.ej2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleccion = 10;
        int id = 0;
        ListaProductos listaDeProductos = new ListaProductos("Lista de Productos");
        while(eleccion !=0){
            System.out.println("Bienvenido a gestion de inventario! ¿Qué desea realizar?\n1- Agregar Producto\n2- Actualizar Producto\n3- Ver Productos\n0- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();
            if(eleccion == 1){
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = scan.nextLine();

                System.out.println("Ingrese el precio del producto: ");
                double precio = scan.nextDouble();
                scan.nextLine();

                System.out.println("Ingrese la cantidad en stock del producto: ");
                int cantidadStock = scan.nextInt();
                scan.nextLine();
                Producto nuevoProducto = new Producto(id, nombre, precio, cantidadStock);
                listaDeProductos.agregarProducto(nuevoProducto);
                id++;
            }else if(eleccion == 2){
                System.out.println("Ingrese la id del producto a actualizar: ");
                int idProducto = scan.nextInt();
                scan.nextLine();

                System.out.println("Ingrese el nombre del nuevo producto: ");
                String nombreActualizado = scan.nextLine();

                System.out.println("Ingrese el precio del producto: ");
                double precioActualizado = scan.nextDouble();
                scan.nextLine();

                System.out.println("Ingrese la cantidad en stock del producto: ");
                int cantidadStockActualizado = scan.nextInt();
                scan.nextLine();
                listaDeProductos.actualizarProducto(idProducto, nombreActualizado, precioActualizado, cantidadStockActualizado);
            }else if(eleccion == 3){
                listaDeProductos.verProductos();
            }else if(eleccion !=0 && eleccion !=1 && eleccion !=2 && eleccion !=3){
                System.out.println("Número ingresado invalido, intente nuevamente.");
            }
        }
        System.out.println("Programa finalizado, gracias por participar!.");
        scan.close();
    }
}
