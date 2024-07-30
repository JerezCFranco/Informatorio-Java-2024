package actividadesrevision;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido! Escriba un número entero y se le mostrara el factorial de este: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("El factorial de " + number + " es: " + result);
        scanner.close();
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
