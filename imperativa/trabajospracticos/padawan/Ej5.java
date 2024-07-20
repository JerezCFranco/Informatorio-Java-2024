package imperativa.trabajospracticos.padawan;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        // Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
        // otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
        // una constante de los valores que no van a cambiar en esta conversión. Muestre el
        // resultado por pantalla.

        Scanner scanner = new Scanner(System.in);

        final double kilogramos = 0.453592;

        System.out.println("Ingrese la cantidad de libras que desa convertir a kilogramos: ");
        double libras = scanner.nextDouble();

        double totalKg = libras*kilogramos;
        String totalKgFormat = String.format("%.2f", totalKg);

        System.out.println("La cantidad de " + libras + " Libras, equivale a " + totalKgFormat + " Kilogramos.");

        scanner.close();
    }
}
