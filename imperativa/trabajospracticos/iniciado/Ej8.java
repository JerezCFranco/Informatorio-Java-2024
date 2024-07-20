package imperativa.trabajospracticos.iniciado;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        // Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
        // y apellido, luego guarde su edad e imprimalos por pantalla.
        // El mensaje debe tener el siguiente formato:
        // “Mi nombre es “ {Nombre}
        // “Mi edad es” {Edad}

        Scanner scanner = new Scanner(System.in);

        System.out.println("Se le solicitara su nombre, apellido y edad para mostrar por pantalla.");

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.next();

        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.next();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Mi nombre es " + nombre + " " + apellido + ".");
        System.out.print("Mi edad es de" + edad + " años.");

        scanner.close();

    }
}
