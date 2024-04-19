package com.cursoM.spring.model;

import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "empleos")
@Getter
@Setter

public class Empleos {

    @Column(name = "empleo_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empleoId;

    private String titulo;

    private String empresa;

    private BigDecimal salario;

}
