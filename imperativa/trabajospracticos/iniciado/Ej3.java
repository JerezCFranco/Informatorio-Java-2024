package imperativa.trabajospracticos.iniciado;

public class Ej3 {
    public static void main(String[] args) {
        // Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
        // y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
        char C = 'c';
        char A = 'a';
        char R = 'r';
        char L = 'l';
        char O = 'o';
        char S = 's';

        System.out.print(C);
        System.out.print(A);
        System.out.print(R);
        System.out.print(L);
        System.out.print(O);
        System.out.print(S);

        //No se puede usar "" en char por que es un caracter literal, y este solo puede ser encerrado
        // en comillas simples, las "" encierran un literal String.
    }
}
