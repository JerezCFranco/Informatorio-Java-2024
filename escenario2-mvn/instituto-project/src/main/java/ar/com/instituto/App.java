package ar.com.instituto;

import java.util.Scanner;
import ar.com.instituto.domain.Institucion;
import ar.com.instituto.service.curso.CursoService;
import ar.com.instituto.service.curso.impl.CursoServiceImpl;
import ar.com.instituto.service.estudiante.EstudianteService;
import ar.com.instituto.service.estudiante.impl.EstudianteServiceImpl;
import ar.com.instituto.service.institucion.InstitucionService;
import ar.com.instituto.service.institucion.impl.InstitucionServiceImpl;
import ar.com.instituto.service.menu.MenuService;
import ar.com.instituto.service.menu.impl.MenuServiceImpl;

public class App {
    public static void main(String[] args)
    {
        Institucion institucion = new Institucion();

        EstudianteService estudianteService = new EstudianteServiceImpl();

        InstitucionService institucionService = new InstitucionServiceImpl(institucion);

        CursoService CursoService = new CursoServiceImpl(estudianteService, institucionService);
        MenuService menuService = new MenuServiceImpl(CursoService);

        Scanner scan = new Scanner(System.in);

        menuService.mostrarMenu(scan);

        scan.close();
    }
}
