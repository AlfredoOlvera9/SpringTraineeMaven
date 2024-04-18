package com.cursoM.spring.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@ToString

public class PersonaEjemploDto {

    @NotNull(message = "El campó nomnbre no pude ser vacio")
    private String nombre;

    @Pattern(regexp = "[0-9]{1,3}", message = "El campo solo admite n\u00fameros enteros y maximo 3 digitos")
    private String edad;

    private  String genero;

    @NotNull(message = "El campó  apellido no pude ser vacio")
    private String apellidoPaterno;

    private String apellidoMaterno;

 //   @Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")
    private String email;

    public PersonaEjemploDto(){

    }

}
