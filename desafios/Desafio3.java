package desafios;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        // Inicializar variables para el primer y segundo mejor valor y sus posiciones
        int mejorValor1 = -9999;
        int mejorValor2 = -9999;
        int posicionMejor1 = -1;
        int posicionMejor2 = -1;

        // Encontrar el primer mejor valor y su posición
        for (int i = 0; i < n; i++) {
            if (arreglo[i] > mejorValor1) {
                mejorValor2 = mejorValor1;
                posicionMejor2 = posicionMejor1;
                mejorValor1 = arreglo[i];
                posicionMejor1 = i;
            } else if (arreglo[i] > mejorValor2 && arreglo[i] != mejorValor1) {
                mejorValor2 = arreglo[i];
                posicionMejor2 = i;
            }
        }

        System.out.println("Primer mejor valor: " + mejorValor1 + " en la posición " + posicionMejor1 + ".");
        System.out.println("Segundo mejor valor: " + mejorValor2 + " en la posición " + posicionMejor2 + ".");

        scanner.close();
    }
}