package arreglos;

public class EjercicioEnClase {
    public static void main(String[] args) {
        /*
         Dado un arreglo de 4 posiciones crear un programa en java
         que permita tomar los dos valores del medio eliminando los extremos.
         Mostrar por pantalla el resultado
         {1,2,3,6} --> {2,3}
         */
        int[] array = {1,2,3,6};
        for(int i = 0; i < array.length; i++){
            if(i != 0 && i != array.length -1){
                System.out.println(array[i]);
            }
        }
        
    }
}
