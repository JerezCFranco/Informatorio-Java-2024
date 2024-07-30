package actividadesrevision;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        String alumnosRegistro = "actividadesrevision/alumnos.txt";

        try (BufferedReader registro = new BufferedReader(new FileReader(alumnosRegistro))) {
            String linea;
            while ((linea = registro.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
