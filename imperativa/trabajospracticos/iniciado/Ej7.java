package imperativa.trabajospracticos.iniciado;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        // Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
        // guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
        // memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
        // real? ¿Por qué?
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Debera ingresar dos números reales para luego multiplicarlos");
        System.out.println("Ingrese el primer número real: ");
        double r1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número real: ");
        double r2 = scanner.nextDouble();
        double rm = r1 * r2;

        System.out.println("Debera ingresar dos números enteros para luego multiplicarlos");
        System.out.println("Ingrese el primer número entero: ");
        int e1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero: ");
        int e2 = scanner.nextInt();
        int em = e1 * e2;

        double sm = rm + em;

        System.out.println("La suma de las multiplaciones da como resultado: " + sm);

        System.out.println(( sm == (int) sm) 
        ? "El resultado es un número entero, ya que no hubo un real en la multiplicacion" 
        : "El resultado es un número real, ya que si hubo un real en la multiplicacion");

        // El resultado es un real, al realizar la conversión, se toma el tipo de dato con mayor
        // precision, en este caso el Double, asi no se produce una perdida de la información.

        scanner.close();

    }
}
