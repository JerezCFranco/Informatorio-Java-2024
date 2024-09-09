package trabajospracticos.padawan.ej3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

// Aplicación de estudiantes y calificaciones. Define una clase Estudiante con
// atributos como nombre, número de identificación y calificaciones. Cree una clase
// calificaciones y para cada estudiante cree un par de calificaciones, cada calificación
// tiene atributos como calificación (1 al 10) y fecha de creación. Utiliza un ArrayList
// para almacenar las calificaciones y los estudiantes.
// a. La aplicación debe permitir :
// i. Agregar estudiantes junto con sus calificaciones
// ii. Calcular promedios de calificaciones
// iii. Mostrar por pantalla identificación, nombre del estudiante y promedio de calificaciones.

public class Ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleccion = 10;
        int id = 0;
        int totalDeCalificaciones = 0;
        double totalcalfInd = 0;
        double promIndividual = 0;
        ArrayList<Calificacion> listaCalificaciones = new ArrayList<>();
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        while (eleccion != 0) {
            System.out.println(
                    "Bienvenido al programa! Que desea realizar?\n1- Agregar Alumno y sus calificaciones\n2- Promedio de calificaciones\n3- Datos de Alumnos\n0- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();
            if (eleccion == 1) {
                System.out.println("Escriba el nombre del estudiante: ");
                String nombreEstudiante = scan.nextLine();

                System.out.println("Cuantas calificaciones desea ingresar?: ");
                int cantCalf = scan.nextInt();
                scan.nextLine();
                if (cantCalf > 0) {
                    for (int i = 1; i <= cantCalf; i++) {
                        System.out.println("Ingrese la calificacion del estudiante: ");
                        int calf = scan.nextInt();
                        scan.nextLine();
                        if(calf <= 10 && calf >= 0){
                            System.out.println("Cuando fue otorgada esta calificación? Ingreselo en formato dd/MM/aaaa");
                            String creacionCalifString = scan.nextLine();
                            DateTimeFormatter formatoDiaMesAnio = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                            LocalDate fechaVencimiento = LocalDate.parse(creacionCalifString, formatoDiaMesAnio);
                            Calificacion calificacion = new Calificacion(calf, fechaVencimiento);
                            listaCalificaciones.add(calificacion);
                            totalcalfInd += calf;
                            totalDeCalificaciones++;
                        }
                        promIndividual = totalcalfInd/cantCalf;
                    }
                    Estudiante estudiante = new Estudiante(id, nombreEstudiante, listaCalificaciones, promIndividual);
                    listaEstudiantes.add(estudiante);
                    id++;
                    totalcalfInd = 0;
                    promIndividual = 0;
                }else{
                    System.out.println("Debe ingresar una cantidad mayor a 0.");
                }
            } else if (eleccion == 2) {
                double sumaPromedios = 0;
                for(Estudiante estudiante : listaEstudiantes){
                    sumaPromedios+=estudiante.calcularPromedio(totalDeCalificaciones);
                }
                sumaPromedios/=listaEstudiantes.size();
                DecimalFormat formatoDecimal = new DecimalFormat("#.##");
                System.out.println("El promedio de calificaciones es: " + formatoDecimal.format(sumaPromedios));
            } else if (eleccion == 3) {
                for(Estudiante estudiante : listaEstudiantes){
                    estudiante.verEstudiante();
                }
            } else if (eleccion != 0 && eleccion != 1 && eleccion != 2 && eleccion != 3) {
                System.out.println("Número ingresado invalido, intente nuevamente.");
            }
        }
        System.out.println("Programa finalizado, gracias por participar!.");
        scan.close();
    }
}
