package trabajospracticos.caballero.ej1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Diccionario diccionario = new Diccionario("Diccionario de Palabras");
        int eleccion = 10;
    
        while(eleccion != 0){
            System.out.println("Bienvenido al Diccionario! ¿Qué desea realizar?\n1- Agregar Palabra\n2- Buscar Palabra\n3- Mostrar Definiciones\n0- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();
            if(eleccion == 1){
                System.out.println("Ingrese la palabra: ");
                String palabra = scan.nextLine();

                System.out.println("Ingrese la definicion de esa palabra: ");
                String definicion = scan.nextLine();

                Palabra nuevaPalabra = new Palabra(palabra, definicion);
                diccionario.agregarPalabras(nuevaPalabra);
            }else if(eleccion == 2){
                System.out.println("Ingrese la palabra que busca: ");
                String palabraBuscar = scan.nextLine();

                Palabra palabraEncontrar = diccionario.buscarPalabra(palabraBuscar);
                if(palabraEncontrar != null){
                    System.out.println("Palabra: " + palabraEncontrar.getPalabraString() + "\nDefinicion: "+ palabraEncontrar.getDefinicionString()+"\n");
                }else {
                    System.out.println("No se encontro la palabra en el diccionario, intente nuevamente.");
                }
            }else if(eleccion == 3){
                diccionario.verDefiniciones();
            }else if(eleccion != 0 && eleccion != 1 && eleccion != 2 && eleccion != 3){
                System.out.println("Número ingresado invalido, intente nuevamente.");
            }
        }
        System.out.println("Programa finalizado, gracias por participar!.");

        scan.close();
    }
}
