package actividadesrevision;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ruta del archivo desde donde se leerá la lista
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Carlos", 30));
        empleados.add(new Empleado("Ana", 25));
        empleados.add(new Empleado("Luis", 35));

        // Ruta del archivo donde se guardará la lista
        String rutaArchivo = "actividadesrevision/empleados.txt";

        // Llamar al método para guardar la lista en el archivo
        guardarListaEnArchivo(empleados, rutaArchivo);
    }

    public static void guardarListaEnArchivo(List<Empleado> lista, String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Empleado empleado : lista) {
                bw.write(empleado.toString());
                bw.newLine();
            }
            System.out.println("Lista guardada exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
