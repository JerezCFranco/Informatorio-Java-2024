package ar.com.instituto.service.archivos;

import java.util.List;

import ar.com.instituto.domain.Curso;

public interface ArchivosCursoService {
    void exportarCursosCsv(List<Curso> curso);
}
