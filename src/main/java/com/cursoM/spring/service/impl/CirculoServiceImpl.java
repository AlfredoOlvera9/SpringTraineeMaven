package com.cursoM.spring.service.impl;

import com.cursoM.spring.dto.CirculoDto;
import com.cursoM.spring.service.ICirculoService;
import org.springframework.stereotype.Service;

@Service
public class CirculoServiceImpl implements ICirculoService {
    @Override
    public Double calcularAreaCirculo(CirculoDto request) {
        return Math.PI * (request.getRadio() * request.getRadio());
    }
}
