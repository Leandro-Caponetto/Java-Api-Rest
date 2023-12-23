package com.proyect.persona.services;

import com.proyect.persona.entities.Persona;
import com.proyect.persona.repositories.BaseRepository;
import com.proyect.persona.repositories.PersonaRepository;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {


    @Audited
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
       super(baseRepository);
    }


}
