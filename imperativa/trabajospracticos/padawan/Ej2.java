package imperativa.trabajospracticos.padawan;

public class Ej2 {
    public static void main(String[] args) {
        // Descontador: Se le solicita que guarde un número en un espacio de memoria y
        // discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
        // usar para hacerlo?

        System.out.println("El operador para discrementar dicho número 20 veces sin asignación, es el operador de decremento(--).");
        int num = 0;

        System.out.println("Este es el número original: " + num);

        for(int i = 0; i < 20;i++){
            num--;
        }
        System.out.println("Este es el número original luego del decremento: " + num);

    }
}
