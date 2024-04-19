package com.cursoM.spring.service;


import com.cursoM.spring.dto.PersonaDto;
import com.cursoM.spring.dto.request.PersonaRequest;
import com.cursoM.spring.model.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IPersonaService {
    List<PersonaDto> findAll();

    Persona save (Persona persona);

    PersonaRequest save2 (PersonaRequest persona);

    // Usando Dto
    PersonaDto saveDto (Persona persona);
    Persona buscarPersonaId(Long id);

    ResponseEntity<Persona> updatePersona(PersonaDto request);

    void eliminarPersona(Long id);

    public List<String> getNombrePersonaByGenero(String genero);

    ResponseEntity<Object> getInfoPersona(@PathVariable Integer id);
}