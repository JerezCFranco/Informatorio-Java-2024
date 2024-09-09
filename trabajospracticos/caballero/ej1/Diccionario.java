package trabajospracticos.caballero.ej1;

import java.util.HashMap;

public class Diccionario {
    private String nombre;
    private HashMap<String, Palabra> palabras;

    public Diccionario(){}

    public Diccionario(String nombre){
        setNombre(nombre);
        this.palabras = new HashMap<>();
    }

    public Palabra buscarPalabra(String palabra) {
        return palabras.get(palabra);
    }
    public void agregarPalabras(Palabra palabra) {
        palabras.put(palabra.getPalabraString(), palabra);
    }

    public void verDefiniciones(){
        for(Palabra palabra : palabras.values()) {
            System.out.println("Palabra: " + palabra.getPalabraString() + "\nDefinicion: " + palabra.getDefinicionString() +"\n");
        }
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
