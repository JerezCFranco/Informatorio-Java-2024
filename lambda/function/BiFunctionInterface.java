package function;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {
        

        //R apply(T t, U u);
        BiFunction<String, Integer, String> biFunction = (x,y) -> x + " " + y;
        System.out.println(biFunction.apply("Hola tengo", 23));
        System.out.println(biFunction.apply("Hola tengo", 28));
        System.out.println(biFunction.apply("Hola tengo", 33));
    
        ejemploMetodo(biFunction, "Hola tengo", 23);
    }

    private static void ejemploMetodo(BiFunction<String, Integer, String> biFunction, String mensaje, int edad){
        System.out.println(biFunction.apply(mensaje, edad));
    }
}
