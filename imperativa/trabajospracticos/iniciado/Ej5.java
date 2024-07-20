package imperativa.trabajospracticos.iniciado;

public class Ej5 {
    public static void main(String[] args) {


        // Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
        // triángulo de asteriscos en la consola.

        int x = 5;
        for(int i = 1; i <= x;i++){
            for(int j = 0; j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
