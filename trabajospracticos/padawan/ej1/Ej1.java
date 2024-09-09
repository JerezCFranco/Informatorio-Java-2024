package trabajospracticos.padawan.ej1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Tarea> listaTareas = new ArrayList<>();
        int idTarea = 0;
        int eleccion = 10;

        while(eleccion != 0){
            System.out.println("Bienvenido al programa! Que desea realizar?\n1- Agregar Tarea\n2- Eliminar Tarea\n3- Ver Tareas\n0- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();
            if(eleccion == 1){
                System.out.println("Ingrese el titulo de la tarea: ");
                String titulo = scan.nextLine();

                System.out.println("Ingrese la descripcion de la tarea: ");
                String descripcion = scan.nextLine();

                System.out.println("Ingrese la fecha de vencimiento de la tarea en formato (dd/mm/aa) :");
                String fechaVencimientoString = scan.nextLine();
                DateTimeFormatter formatoDiaMesAnio = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaVencimiento = LocalDate.parse(fechaVencimientoString, formatoDiaMesAnio);

                Tarea tarea = new Tarea(idTarea,titulo, descripcion, fechaVencimiento);
                listaTareas.add(tarea);
                idTarea++;

            }else if(eleccion == 2){
                System.out.println("Ingrese el Id de la tarea a eliminar: ");
                int idEliminar = scan.nextInt();
                scan.nextLine();

                if(idEliminar <= listaTareas.size()){
                    listaTareas.remove(idEliminar);
                }else{
                    System.out.println("No existe tarea con ese Id.");
                }
            }else if(eleccion == 3){
                for(Tarea tarea : listaTareas){
                    tarea.verTarea();
                }
            }else if(eleccion != 0 && eleccion != 1 && eleccion != 2 && eleccion != 3){
                System.out.println("Número ingresado invalido, intente nuevamente.");
            }
        }
        System.out.println("Gracias por participar en el programa!.");


        scan.close();
    }
    
}
