package imperativa.trabajospracticos.padawan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        // Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
        // edad y los nombres de esas personas, luego saque su promedio e imprima por
        // pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus edades.

        Scanner scanner = new Scanner(System.in);

        List<String> ListaPersonas = new ArrayList<>();
        List<Integer> ListaEdades = new ArrayList<>();

        System.out.println("Ingrese cuantas personas desea agregar: ");

        int cantPersonas = scanner.nextInt();
        int promedio = 0;

        for(int i = 0; i < cantPersonas; i++){
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = scanner.next();
            ListaPersonas.add(nombre);

            System.out.println("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();
            ListaEdades.add(edad);
            promedio+=edad;

            System.out.println();
        }
        for(int j = 0; j < cantPersonas; j++){
            System.out.println("Nombre: " + ListaPersonas.get(j));
            System.out.println("Edad: " + ListaEdades.get(j));
            System.out.println();
        }
        promedio/=cantPersonas;
        System.out.println("El promedio de edades es de: " + promedio);
        scanner.close();
    }
}
