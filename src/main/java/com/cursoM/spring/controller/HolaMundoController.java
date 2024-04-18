package com.cursoM.spring.controller;

import com.cursoM.spring.dto.PersonaEjemploDto;
import com.cursoM.spring.service.IEjerciciosService;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/curso-spring")
@Slf4j
//@Tag(name = "Hola Mundo Controller")

public class HolaMundoController {

    @Autowired
    private IEjerciciosService ejerciciosService;

    @GetMapping("/hola")
  //  @Operation(summary = "Operacion para mostrar hola mundo")
    public String holaMundo (){

        return ("Hola mundo");

    }

    @GetMapping(path ="/hola/{nombre}")
    //@Operation (summary = "Mostrar Hola mundo con unavariable extra")
    public String holaMundo2(@PathVariable String nombre) {
        log.info("El nombre que se envia es: "+ nombre);
        return "Hola: " + nombre;
    }

    @PostMapping("/persona")
    public PersonaEjemploDto datosPersona(@Valid @RequestBody PersonaEjemploDto personaEjemploDto){

        return personaEjemploDto;
    }

    @GetMapping("/nombres")
    public List<String> nombre (){
        return ejerciciosService.getNombres();
    }

}
