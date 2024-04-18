package com.cursoM.spring.service.impl;

import com.cursoM.spring.dto.RectanguloDto;
import com.cursoM.spring.service.IRectanguloService;
import org.springframework.stereotype.Service;

@Service
public class RectanguloServiceImpl implements IRectanguloService {
    @Override
    public Double obtenerAreaRectangulo(RectanguloDto request) {
        return request.getBase() * request.getAltura();
    }
}
