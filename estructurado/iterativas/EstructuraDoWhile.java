package estructurado.iterativas;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        int contador = 10;

        do {
            System.out.println("Hola soy el número: " + contador);
            contador--;
        } while(contador > 0);
    }
}
