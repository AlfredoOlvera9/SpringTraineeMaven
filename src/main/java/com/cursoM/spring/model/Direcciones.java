package com.cursoM.spring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "direcciones")
@Getter
@Setter
public class Direcciones {

    @Column(name = "direccion_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long direccionId;

    private String calle;

    private String ciudad;

    private String estado;

    private String codigoPostal;
}

