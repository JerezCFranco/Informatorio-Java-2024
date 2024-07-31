package trabajospracticos.iniciado.ej3;
import java.util.Scanner;
import trabajospracticos.iniciado.ej1.Alumno;
import java.util.ArrayList;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();
        int id = 1;
        int eleccion = 10;
        while(eleccion !=0){
            System.out.println("Bienvenido! que desea realizar?\n1- Agregar alumno\n2- Ver lista de alumnos\n0- Salir");
            eleccion = scan.nextInt();
            if(eleccion == 1){
                System.out.println("Ingrese el nombre del alumno: ");
                String nombre = scan.next();

                System.out.println("Ingrese el apellido del alumno: ");
                String apellido = scan.next();

                System.out.println("Ingrese la edad del alumno: ");
                int edad = scan.nextInt();
                Alumno alumno = new Alumno(nombre, apellido, null, edad, id);
                listaAlumnos.add(alumno);
                id++;
            }else if(eleccion == 2){
                for(Alumno alumno : listaAlumnos){
                    alumno.verAlumnoLista();
                }
            }else if(eleccion != 0 && eleccion != 1 && eleccion != 2){
                System.out.println("Número ingresado invalido, intente nuevamente.");
            }
            
        }
        System.out.println("Programa finalizado, gracias por participar!.");
        scan.close();
    }
}
