package com.cursoM.spring.service.impl;

import com.cursoM.spring.dto.CuadradoDto;
import com.cursoM.spring.service.ICuadradoService;
import org.springframework.stereotype.Service;

@Service
public class CuadradoServiceImpl implements ICuadradoService {

    @Override
    public Double calcularAreaCuadrado(CuadradoDto request) {

        return request.getLado() * request.getLado();
    }
}
