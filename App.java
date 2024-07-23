import poo.dominio.Auto;
import poo.dominio.Persona;

public class App {
    public static void main(String[] args) {

        // Para instanciar
        // 2. Variable para guardar el objeto
        // 3. Instanciar objeto con new 'NombreDeClase();'
        Persona persona = new Persona();

        persona.setNombre("Carlos");
        persona.setApellido("Jerez");
        persona.setEdad(24);
        persona.setDni(123456789);

        Auto auto = new Auto();
        auto.setMarca("Chevrolet");
        auto.setCantidadDePuertas(4);
        auto.setModelo("Chevy");
        auto.setColor("Gris");
        auto.setPlaca("422HJJ");

        persona.setAuto(auto);

        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getDni());
        System.out.println(persona.getEdad());
        System.out.println(persona.getAuto().getMarca());

        Persona persona2 = new Persona("Lionel", "Messi", 123456789, 37);
        Persona persona3 = new Persona("Rodrigo");
    }
}
