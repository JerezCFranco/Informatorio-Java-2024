package arreglos;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};

        System.out.println("El tamaño del arreglo es: " + array.length);
        System.out.println("Acceder al valor de la posicion 3 es: " + array[2]);

        System.out.println("");

        int[] array2 = new int[6];
        System.out.println("Valor en la posicion 1 es: " + array2[0]);

        // Cambiar el valor de un elemento en una posicion
        array[0] = 100;
        System.out.println("Acceder al valor de la posicion 1 es: " + array[0]);
    
        for(int i = 0;i < array.length; i++){
            System.out.println("Elemento : " + i);
            System.out.println("Valor :" + array[i]);
        }

        for(int i = array.length -1;  i >= 0; i--){
            System.out.println("Elemento : " + i);
            System.out.println("Valor :" + array[i]);
        }
    }
}
