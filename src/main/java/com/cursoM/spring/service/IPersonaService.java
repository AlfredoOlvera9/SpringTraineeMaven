package com.cursoM.spring.service;


import com.cursoM.spring.dto.PersonaDto;
import com.cursoM.spring.dto.request.PersonaRequest;
import com.cursoM.spring.model.Persona;

import java.util.List;

public interface IPersonaService {
    List<PersonaDto> findAll();

    Persona save (Persona persona);

    PersonaRequest save2 (PersonaRequest persona);

    // Usando Dto
    PersonaDto saveDto (Persona persona);

}
