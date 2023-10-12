package com.parcial.services;

import com.parcial.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PersonaServiceImpl implements PersonaService {
    @Override
    public List<Persona> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Persona> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Persona findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        return null;
    }

    @Override
    public Persona update(Long aLong, Persona entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        return null;
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        return null;
    }
}
