package com.proyect.persona.services;

import com.proyect.persona.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{

    List<Persona> search(String filtro) throws Exception;
}
