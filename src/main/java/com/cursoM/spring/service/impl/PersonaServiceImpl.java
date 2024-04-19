package com.cursoM.spring.service.impl;

import com.cursoM.spring.dto.PersonaDto;
import com.cursoM.spring.dto.mapper.MapperPersonaDto;
import com.cursoM.spring.dto.request.PersonaRequest;
import com.cursoM.spring.dto.response.DatosPersonaResponse;
import com.cursoM.spring.model.Persona;
import com.cursoM.spring.repository.IPersonasRepository;
import com.cursoM.spring.service.IPersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
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


    @Override
    public Persona buscarPersonaId(Long id) {
        Optional<Persona> datosPersona = repository.findById(id);
        return datosPersona.get();
    }

    @Override
    public ResponseEntity<Persona> updatePersona(PersonaDto personaDto) {
        Optional<Persona> existePersona = repository.findById(personaDto.getPersonaId());
        ResponseEntity<Persona> response = null;

        if(existePersona.isPresent()){

            Persona persona = new Persona();
            persona.setPersonaId(personaDto.getPersonaId());
            persona.setNombre(personaDto.getNombre());
            persona.setDireccionId(personaDto.getDireccionId());
            persona.setEmpleoId(personaDto.getEmpleoId());
            response = ResponseEntity.ok(repository.save(persona));

        } else {
            response = ResponseEntity.noContent().build();
        }
        return  response;

    }

    @Override
    public void eliminarPersona(Long id) {

        repository.deleteById(id);

    }

    @Override
    public List<String> getNombrePersonaByGenero(String genero) {

        return repository.personasByGenero(genero );
    }

    @Override

    public ResponseEntity<Object> getInfoPersona( Integer id){

        ResponseEntity<Object> response = null;

        try {

            Optional<DatosPersonaResponse> info = Optional.ofNullable(repository.getInfoPersona(id));

            if(info.isPresent()){

                response = ResponseEntity.ok(info.get());

            }else {
                response = ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("No se econtraron datos de la persona con el ID: " + id);
            }


        }catch (Exception e){
            log.error("error en metodo getInfoPersona" + e.getMessage());
        }
        return response;
    }



}
