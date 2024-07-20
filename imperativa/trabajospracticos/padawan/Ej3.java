package imperativa.trabajospracticos.padawan;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        // Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
        // en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
        // ¿Qué es unicode?

        Scanner scanner = new Scanner(System.in);

        char c1 = '\u0043'; // C
        char c2 = '\u0061'; // a
        char c3 = '\u0072'; // r
        char c4 = '\u006C'; // l
        char c5 = '\u006F'; // o
        char c6 = '\u0073'; // s

        System.out.println("El nombre en Unicode es: " + c1 + c2 + c3 + c4 + c5 + c6);
        //No se puede usar "" en char por que es un caracter literal, y este solo puede ser encerrado
        // en comillas simples, las "" encierran un literal String.
        // Unicode es un estándar de codificación de caracteres que permite representar caracteres
        //  de casi todos los sistemas de escritura del mundo en un solo conjunto de caracteres. 
        //  Unicode asigna un código único a cada carácter, lo que facilita la representación y 
        //  manipulación de texto en diferentes idiomas y sistemas.

        scanner.close();
    }
}
