package ar.com.instituto.service.curso;

import java.util.UUID;

import ar.com.instituto.domain.Curso;

public interface CursoService {

    void inscribirEstudiante(UUID idCurso);

    Curso crearCurso();

    void inscribirEstudianteACurso(UUID idCurso, Long dni);

    void listarCursos();

    void listarEstudiantesYCurso();
}
