package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsStructure {
    public static void main(String[] args) {
        
        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Marisol");
        nombres.add("Antonio");
        nombres.add("Luis");
        nombres.add("Marcos");
        nombres.add("Fabiana");

        nombres.stream()
            .forEach(sout -> System.out.println(sout));
    }
}
