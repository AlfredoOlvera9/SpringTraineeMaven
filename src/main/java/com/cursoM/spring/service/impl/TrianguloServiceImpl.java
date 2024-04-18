package com.cursoM.spring.service.impl;

import com.cursoM.spring.dto.TrianguloDto;
import com.cursoM.spring.service.ITrianguloService;
import org.springframework.stereotype.Service;

@Service
public class TrianguloServiceImpl implements ITrianguloService {
    @Override
    public Double calcularAreaTriangulo(TrianguloDto request) {
        return (request.getBase()*request.getAltura()) / 2;
    }
}
