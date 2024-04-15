package com.cursoM.spring.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;



public interface PersonaService {

    List<String> getNombres();

    List<String> filtrarNombres();

}
