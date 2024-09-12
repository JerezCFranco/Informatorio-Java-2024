import java.util.function.BiPredicate;

public class BiPredicateInterface {
    
    public static void main(String[] args) {

        //Cuando el argumento es mas de 1, se lo debe encerrar entre ()
        //Boolean test(T t, U u);
        BiPredicate<String,Integer> biStr = (s, u) -> s.length() == u;

        System.out.println(biStr.test("Vacation City", 8));
    }
}
