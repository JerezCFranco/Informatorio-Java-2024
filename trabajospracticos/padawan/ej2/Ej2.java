package trabajospracticos.padawan.ej2;
import java.util.LinkedList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleccion = 10;
        int id = 0;
        LinkedList<Contacto> listaContactos = new LinkedList<>();
        while(eleccion != 0){
            System.out.println("Bienvenido al programa! Que desea realizar?\n1- Agregar Contacto\n2- Eliminar Contacto\n3- Buscar Contacto\n4- Ver Lista de Contactos\n0- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();
            if(eleccion == 1){
                System.out.println("Ingrese el nombre del contacto: ");
                String nombreContacto = scan.nextLine();
                
                System.out.println("Ingrese el número de telefóno del contacto: ");
                long numeroTelefonoContacto = scan.nextLong();
                scan.nextLine();

                System.out.println("Ingrese el correo del contacto: ");
                String correoContacto = scan.nextLine();
                Contacto contacto = new Contacto(id, nombreContacto, numeroTelefonoContacto, correoContacto);
                listaContactos.add(contacto);
                id++;
            }else if(eleccion == 2){
                System.out.println("Ingrese el ID del contacto a eliminar: ");
                int idEliminar = scan.nextInt();
                scan.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < listaContactos.size(); i++) {
                    if (listaContactos.get(i).getId() == idEliminar) {
                        listaContactos.remove(i);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("No existe contacto con ese ID.");
                }
            }else if(eleccion == 3){
                System.out.println("Escriba el Id del contacto que quiere ver: ");
                int idBusqueda = scan.nextInt();
                scan.nextLine();
                boolean encontrado = false;
                for(Contacto contacto : listaContactos){
                    if(contacto.getId() == idBusqueda){
                        contacto.verContactoCompleto();
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("No existe contacto con ese Id.");
                }
            }else if(eleccion == 4){
                for(Contacto contacto : listaContactos){
                    contacto.verContacto();
                }
            }else if(eleccion != 0 && eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4){
                System.out.println("Número ingresado invalido, intente nuevamente.");
            }
        }
        System.out.println("Gracias por participar en el programa!.");

        scan.close();
    }
}
