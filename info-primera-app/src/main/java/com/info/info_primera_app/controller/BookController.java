package com.info.info_primera_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    //Get --> Obtener
    @GetMapping("/aplicacion/v1/despedida")
    public String goodByeWorld(){

        return "Adios mundo cruel";
    }

    @GetMapping("/aplicacion/v1/saludo")
    public String helloWorld(){

        return "Hola mundo";
    }
}
