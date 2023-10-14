package com.parcial.services;

import com.parcial.entities.Persona;
import com.parcial.repositories.BaseRepository;
import com.parcial.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

        @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable); Método de Query
            //Page<Persona> personas = personaRepository.search(filtro, pageable); JPQL parámetros nombrados
            Page<Persona> personas = personaRepository.searchNativo(filtro, pageable); //Query nativo
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


}
