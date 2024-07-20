package imperativa.trabajospracticos.iniciado;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        // Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la
        // información de: El nombre de su última mascota y nombre de la última película
        // vista. Por último mostrarlo por pantalla con el siguiente formato:
        // “Nombre de la próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su última mascota: ");
        String ultimaMascota = scanner.next();

        System.out.println("Ingrese el nombre de su última película vista: ");
        String ultimaPelicula = scanner.next();

        System.out.println();
        System.out.println("Nombre de la próxima bebida: " + ultimaMascota + " " + ultimaPelicula);

        scanner.close();
    }
}
