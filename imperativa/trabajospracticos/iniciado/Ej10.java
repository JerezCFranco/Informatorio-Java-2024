package imperativa.trabajospracticos.iniciado;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        
        // Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
        // de quince multiplicaciones entre dos números enteros divididos por el número de la
        // multiplicación. Por ejemplo:
        // Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
        // El resultado mostrarlo por pantalla.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Debe ingresar dos números enteros, estos seran multiplicados 15 veces, y divididos por el número de la multiplicacion de estos.");

        System.out.println("Ingrese el primer entero: ");
        int ent1 = scanner.nextInt();

        System.out.println("Ingrese el segundo entero: ");
        int ent2 = scanner.nextInt();

        int total = 0;

        for(int i = 1; i <=15; i++){
            int multEnt = (ent1 * ent2)/i;
            System.out.println("("+ent1+"*"+ent2+")"+"/"+i+"="+multEnt);
            total+=multEnt;
        }
        System.out.println("El resultado de la suma de todas las multiplicaciónes es de: "+total);

        scanner.close();
    }
}
