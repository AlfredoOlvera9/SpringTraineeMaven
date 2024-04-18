package com.cursoM.spring.repository;

import com.cursoM.spring.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonasRepository
        extends CrudRepository<Persona, Long> {

}
