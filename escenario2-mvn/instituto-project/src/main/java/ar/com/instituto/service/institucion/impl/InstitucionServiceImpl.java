package ar.com.instituto.service.institucion.impl;

import java.util.List;

import ar.com.instituto.domain.Curso;
import ar.com.instituto.domain.Institucion;
import ar.com.instituto.service.institucion.InstitucionService;

public class InstitucionServiceImpl implements InstitucionService{

    Institucion institucion;

    public InstitucionServiceImpl(Institucion institucion){
        this.institucion = institucion;
    }

    @Override
    public List<Curso> getCursos() {
        return this.institucion.getCursos();
    }
    
}
