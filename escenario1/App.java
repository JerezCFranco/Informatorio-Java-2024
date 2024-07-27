package escenario1;

import escenario1.dominio.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<ZoologicoInterface> ListaZoologico = new ArrayList<ZoologicoInterface>();

        List<Animal> animales = new ArrayList<>();

        Zoologico zoologico = new Zoologico();

        ZoologicoSaenzPeña zoologicoSaenzPeña = new ZoologicoSaenzPeña();
    }
}
