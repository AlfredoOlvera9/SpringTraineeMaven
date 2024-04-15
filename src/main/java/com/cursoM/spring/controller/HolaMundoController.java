package com.cursoM.spring.controller;


import com.cursoM.spring.dto.Persona;
import com.cursoM.spring.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hola")

public class HolaMundoController {
    @Autowired
    private PersonaService personaService;

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
