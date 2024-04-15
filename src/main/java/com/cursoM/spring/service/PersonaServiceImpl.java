package com.cursoM.spring.service;

import com.cursoM.spring.service.impl.PersonaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Override
    public List<String> getNombres() {
        List<String> listaNombres = new ArrayList<>();

        listaNombres.add("Cesar");
        listaNombres.add("Oscar");
        listaNombres.add("Alfredo");
        listaNombres.add("Luis");

        return listaNombres;
    }


    @Override
    public List<String> filtrarNombres() {

        List<String> listaNombres = new ArrayList<>();

        List<String> listaFiltrada = new ArrayList<>();

        listaNombres.add("Cesar");
        listaNombres.add("Oscar");
        listaNombres.add("Alfredo");
        listaNombres.add("Luis");

        for (String l : listaNombres) {

            if (l.contains("o") || l.contains("O")) {
                listaFiltrada.add(l);
            }
        }

        return listaFiltrada;
    }

}

