package trabajospracticos.caballero.ej3;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleccion = 10;
        int id = 0;
        Biblioteca biblioteca = new Biblioteca("Biblioteca de Libros");
        while(eleccion != 0){
            System.out.println("Bienvenido a Libros de Biblioteca! ¿Qué desea realizar?\n1- Agregar Libro\n2- Buscar Libro\n3- Ver Libros\n0- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();
            if(eleccion == 1){
                System.out.println("Ingrese el Titulo del libro: ");
                String titulo = scan.nextLine();

                System.out.println("Ingrese el Genero del libro: ");
                String genero = scan.nextLine();

                System.out.println("Ingrese al Autor del libro: ");
                String autorNombre = scan.nextLine();

                Autor autor = new Autor(autorNombre);

                Libro libro = new Libro(id, titulo, genero, autor);
                biblioteca.agregarLibro(libro);
                id++;
            }else if(eleccion == 2){
                System.out.println("Que filtro de busqueda desea?: \n1- Por Titulo\n2- Por Autor");
                int eleccionBusqueda = scan.nextInt();
                scan.nextLine();

                if(eleccionBusqueda == 1){
                    System.out.println("Ingrese el Titulo del libro: ");
                    String tituloBusqueda = scan.nextLine();
                    biblioteca.buscarLibroTitulo(tituloBusqueda);
                }else if(eleccionBusqueda == 2){
                    System.out.println("Ingrese el nombre del Autor: ");
                    String nombreAutor = scan.nextLine();
                    biblioteca.buscarLibroAutor(nombreAutor);
                }else{
                    System.out.println("Número ingresado invalido, intente nuevamente.");
                }
            }else if(eleccion == 3){
                biblioteca.verLibros();
            }else if(eleccion != 0 && eleccion != 1 && eleccion != 2 && eleccion != 3){
                System.out.println("Número ingresado invalido, intente nuevamente.");
            }
        }
        System.out.println("Programa finalizado, gracias por participar!.");
        scan.close();
    }
}
