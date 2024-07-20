package imperativa.trabajospracticos.iniciado;
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        
        // Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
        // luego haga la potencia de ese número al cuadrado y al cubo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número, se mostrara la potencia del número al cuadrado y al cubo");
        double num = scanner.nextDouble();

        System.out.println("El número es " + num + ", su cuadrado es " + (num*num) + " y su cubo es " + (num*num*num));

        scanner.close();
    }
}
