import java.util.ArrayList;
import java.util.List;

public class ZoologicoSaenzPeña implements ZoologicoInterface {
    private List<Animal> animales = new ArrayList<>();

    public ZoologicoSaenzPeña(List<Animal> animales){
        this.animales = animales;
    }
    @Override
    public void hacerSonidoAnimal(){
        System.out.println("Zoologico Saenz Peña");

        for(Animal animal : animales){
            System.out.println("Animal :");
            animal.hacerSonido();
        }
    }
}
