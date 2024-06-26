package com.cursoM.spring.controller;

import com.cursoM.spring.dto.PersonaDto;
import com.cursoM.spring.model.Persona;
import com.cursoM.spring.service.IPersonaService;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
//@Tag(name = "Personas")
public class PersonaController {
    @Autowired
    IPersonaService personaService;

    @GetMapping("")
 //   @Operation(summary = "Operacion para obtener datos de las personas")
    public List <PersonaDto> findAllPersons(){

        return  personaService.findAll();
    }
    @PostMapping("")
   // @Operation(summary = "Operacion para guardar personas")
    public ResponseEntity <?> guardarPersonas(@RequestBody Persona persona){

        return ResponseEntity.status(HttpStatus.CREATED).body(personaService.saveDto(persona));
    }
    @GetMapping("buscar-persona/{id}")
    public Persona buscarPersonaID(@PathVariable Long id){

        return personaService.buscarPersonaId(id);

    }
    @DeleteMapping("/eliminar/{id}")

    public void eliminarPersona(@PathVariable Long id){

        personaService.eliminarPersona(id);

    }
    @GetMapping("/buscar-genero/{genero}")
    public List<String> getNombrePersonaByGenero(@PathVariable String genero){

        return personaService.getNombrePersonaByGenero(genero);

    }

    @GetMapping("/info/{id}")
    public ResponseEntity<Object> getInfoPersona(@PathVariable Integer id){

        return personaService.getInfoPersona(id);

    }

}
