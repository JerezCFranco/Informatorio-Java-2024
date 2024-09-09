package ar.com.instituto.service.archivos.impl;

import java.util.List;
import com.opencsv.CSVWriter;
import ar.com.instituto.domain.Curso;
import ar.com.instituto.service.archivos.ArchivosCursoService;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoCursoServiceImpl implements ArchivosCursoService{

    @Override
    public void exportarCursosCsv(List<Curso> cursos){
        
        final String UBICACION_ARCHIVO = "/src/main/java/ar/com/instituto/recursos";

        String ruta = System.getProperty("user.dir").concat(UBICACION_ARCHIVO);

        try(CSVWriter csvWriter = new CSVWriter(new FileWriter(ruta))) {
            String[] encabezado = {"ID", "NOMBRE", "CANTIDAD DE HORAS", "COMPLEJIDAD"};
            csvWriter.writeNext(encabezado);

            for(Curso curso : cursos){
                String[] datos = {
                    curso.getId().toString(),
                    curso.getNombre(),
                    curso.getCantidadHoras().toString(),
                    curso.getComplejidad().toString()
                };
                csvWriter.writeNext(datos);
            }

            csvWriter.close();
            System.out.println("Exportacion exitosa.");
        } catch (IOException e) {
            System.out.println("Algo salio mal, motivo : " + e.getMessage().concat("Ubicacion archivo : " + ruta));
        }
    }
    
}
