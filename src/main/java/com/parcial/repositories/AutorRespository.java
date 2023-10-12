package com.parcial.repositories;

import com.parcial.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRespository extends org.springframework.data.jpa.repository.JpaRepository<Autor, Long> {
}
