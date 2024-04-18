package com.cursoM.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
// DTO enviar cierta informacion al cliente

public class PersonaDto {

    private Long personaId;

    private String nombre;

    private Integer direccionId;

    private Integer empleoId;

    private PersonaDto () {

    }

    public PersonaDto(Long personaId, String nombre, Integer direccionId, Integer empleoId) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.direccionId = direccionId;
        this.empleoId = empleoId;
    }
}
