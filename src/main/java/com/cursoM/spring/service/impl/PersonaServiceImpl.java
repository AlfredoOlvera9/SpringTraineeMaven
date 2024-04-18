package com.cursoM.spring.service.impl;

import com.cursoM.spring.dto.PersonaDto;
import com.cursoM.spring.dto.mapper.MapperPersonaDto;
import com.cursoM.spring.dto.request.PersonaRequest;
import com.cursoM.spring.model.Persona;
import com.cursoM.spring.repository.IPersonasRepository;
import com.cursoM.spring.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    IPersonasRepository repository;

    @Override
    public List<PersonaDto> findAll() {

        List <Persona> personas = (List<Persona>) repository.findAll();
        // convertimos cada objeto persona a persona dto, usamos:
        //api stream, con un mapa "u", convertimos usuarios a objeto dto y lo devolvemos auna tipo de lista collectors
        return personas
                .stream()
                .map( u -> MapperPersonaDto.builder().setPersona(u).build())
                .collect(Collectors.toList());
    }

    @Override
    public Persona save(Persona persona) {

        return repository.save(persona);
    }

    @Override
    public PersonaRequest save2(PersonaRequest persona) {
        com.cursoM.spring.model.Persona persona1 = new com.cursoM.spring.model.Persona();

        persona1.setNombre(persona.getNombre());
        persona1.setEdad(persona.getEdad());
        persona1.setGenero(persona.getGenero());
        persona1.setDireccionId(persona.getDireccionId());
        persona1.setEmpleoId(persona.getEmpleoId());

        return null;
    }

    @Override
    public PersonaDto saveDto(Persona persona) {

        return MapperPersonaDto.builder().setPersona(repository.save(persona)).build();
    }

}
