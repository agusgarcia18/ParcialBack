package com.parcial.services;

import com.parcial.entities.Localidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class LocalidadServiceImpl implements LocalidadService {
    @Override
    public List<Localidad> findAll() throws Exception {
        return null;
    }

    @Override
    public Page<Localidad> findAll(Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Localidad findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Localidad save(Localidad entity) throws Exception {
        return null;
    }

    @Override
    public Localidad update(Long aLong, Localidad entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
