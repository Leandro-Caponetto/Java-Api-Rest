package com.proyect.persona.services;

import com.proyect.persona.entities.Localidad;
import com.proyect.persona.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServicempl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    public LocalidadServicempl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
