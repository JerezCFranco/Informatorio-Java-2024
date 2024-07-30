package actividadesrevision;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        sumaDeValores();
    }

    public static void sumaDeValores(){
        int num1,num2,resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa realiza una suma de dos números enteros.");
        
        System.out.println("Ingrese el primer número entero: ");
        num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número entero: ");
        num2 = scanner.nextInt();
        resultado = Sumar(num1, num2);
        scanner.close();
        System.out.println("El valor de la suma es: " + resultado);
    }

    public static int Sumar(int num1, int num2){   
        return (num1 + num2);
    }
    
}
