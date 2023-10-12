package com.parcial.services;

import com.parcial.entities.Autor;
import com.parcial.entities.Base;

import java.io.Serializable;

import com.parcial.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E,ID> baseRespository;

    public BaseServiceImpl(BaseRepository<Autor, Long> baseRespository) {

        this.baseRespository = (BaseRepository<E, ID>) baseRespository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception{
        try{
            List<E> entities = baseRespository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception{
        try{
            Page<E> entities = baseRespository.findAll(pageable);
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception{
        try{
            Optional<E> entityOptional = baseRespository.findById(id);
            return entityOptional.get();

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public E save(E entity) throws Exception{
        try{
            entity = baseRespository.save(entity);
            return entity;

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRespository.findById(id);
            E persona = entityOptional.get();
            persona = baseRespository.save(entity);
            return persona;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRespository.existsById(id)) {
                baseRespository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
