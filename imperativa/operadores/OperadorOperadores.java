package imperativa.operadores;

public class OperadorOperadores {
    public static void main(String[] args) {
        int resultado = 5 + 3 * 2;

        int resultado2 = 20/4 * 2 + 3;

        //operador terniario
        // > < = => <=
        boolean resultado3 = (resultado2 > resultado)? true : false;
        System.out.println(resultado3);
        
        int value2;
        int value = 5;
        value2 = value++; //Asigna luego incrementa
        value2 = ++value; //Incrementa value luego asigna
        value2 = --value; //Decrementa value luego asigna
        System.out.println(value2);

    }
}
