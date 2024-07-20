package imperativa.trabajospracticos.iniciado;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        // Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
        // sumen, determine si el primer número es divisible por el segundo número y muestre el resultado.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa sumara dos números ingresados y comparara si el primero es divisble por el segundo");
        System.out.println("Ingrese el primer número: ");
        
        int x = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int y = scanner.nextInt();
        int resultado = x + y;

        String divisible = (x % y == 0) ? "el primer número es divisible por el segundo" : "el primero número no es divisible por el segundo";

        System.out.println("El resultado de la suma es " + resultado + ", y " + divisible);

        scanner.close();


    }
}
