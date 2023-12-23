package com.proyect.persona.services;


import com.proyect.persona.entities.Autor;
import com.proyect.persona.repositories.AutorRepository;
import com.proyect.persona.repositories.BaseRepository;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends  BaseServiceImpl<Autor, Long> implements AutorService {

    @Audited
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
