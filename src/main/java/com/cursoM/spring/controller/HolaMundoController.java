package com.cursoM.spring.controller;


import com.cursoM.spring.dto.Persona;
import com.cursoM.spring.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@RestController
@RequestMapping("/hola")

public class HolaMundoController {
    @Autowired
    private PersonaService personaService;


    @GetMapping ("/mundo{nombre}")
    public String holaNombre (@PathVariable String nombre){
      //  log.info("El nombre es:" + nombre);
        return "Hola: " + nombre;
    }

    @GetMapping("/nombres")
    public List<String> nombres(){

        return personaService.getNombres();

    }

    @PostMapping("/agregar-persona")
    public Persona agrgarPersona (@RequestBody Persona persona){

        return persona;

    }

    @GetMapping("/filtrar-nombres")
    public List<String> filtrarNombres (){

        return personaService.filtrarNombres();

    }

}
