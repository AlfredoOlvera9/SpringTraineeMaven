package com.cursoM.spring.dto.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaRequest {

    private Long personaId;

    //   @Column(name= "nombre")
    private String nombre;

    //  @Column(name= "edad")
    private Integer edad;

    //   @Column(name= "genero")
    private String genero;


    private Integer direccionId;


    private Integer empleoId;


}
