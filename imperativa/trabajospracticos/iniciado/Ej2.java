package imperativa.trabajospracticos.iniciado;
import java.util.Scanner;

public class Ej2 {
    // Suma de dos números bis: Se les solicita que guarden dos números enteros y los
    // sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
    // indique si se trata de un número par o impar.
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa sumara dos números ingresados y comparara si es par o impar");
        System.out.println("Ingrese el primer número: ");
        
        int x = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int y = scanner.nextInt();
        int resultado = x + y;

        String paridad = (resultado % 2 == 0) ? "par" : "impar";

        System.out.println("El resultado de la suma es " + resultado + ", y es " + paridad);

        scanner.close();
    }
}