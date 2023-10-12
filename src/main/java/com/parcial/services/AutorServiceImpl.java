package com.parcial.services;


import com.parcial.repositories.AutorRespository;
import com.parcial.entities.Autor;
import com.parcial.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,
        Long> implements AutorService{

    @Autowired
    private AutorRespository autorRespository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRespository, AutorRespository autorRespository) {
        super(baseRespository);
        this.autorRespository = autorRespository;
    }
}