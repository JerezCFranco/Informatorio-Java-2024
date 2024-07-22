package desafios;
public class Desafio2 {
    public static void main(String[] args) {
        // Desafio 2 : Dado un arreglo 3x3, desarrollar un programa que sume los elementos
        //  en diagonal y por ultimo muestre la sumatotal de la suma

        // Crear un arreglo 3x3
        int[][] matriz = {
            {5, 0, 2},
            {39, -7, 16},
            {6, 4, 14}
        };

        // Variable para almacenar la suma
        int sumaDiagonal = 0;

        // Calcula la suma de los elementos en la diagonal
        for (int i = 0; i < 3; i++) {
            sumaDiagonal += matriz[i][i];
        }

        // Imprimir el resultado de la suma
        System.out.println("Suma de la diagonal: " + sumaDiagonal);
    }
}