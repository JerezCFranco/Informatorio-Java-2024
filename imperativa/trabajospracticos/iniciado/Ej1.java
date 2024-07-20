package imperativa.trabajospracticos.iniciado;
import java.util.Scanner;

public class Ej1 {
    // Suma de dos números: Se le solicita que guarden dos números enteros y los
    // sumen. El resultado mostrarlo por pantalla.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa sumara dos números ingresados");
        System.out.println("Ingrese el primer número: ");
        
        int x = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int y = scanner.nextInt();

        System.out.println("La suma de los números es: "+ (x + y));

        scanner.close();
    }
}
