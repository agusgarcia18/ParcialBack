package com.parcial.services;

import com.parcial.repositories.BaseRepository;
import com.parcial.entities.Localidad;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRespository) {
        super(baseRespository);
    }

}