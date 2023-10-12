package com.parcial.repositories;

import com.parcial.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends org.springframework.data.jpa.repository.JpaRepository<Persona, Long> {

    //Anotacion del Metodo Query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //Anotacion JPQL utilizando parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido like '%:filtro%'")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido like '%:filtro%'")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);

    @Query(
            value = "select * from persona where persona.nombre like '%:filtro%' or persona.apellido like '%:filtro%'",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "select * from persona where persona.nombre like '%:filtro%' or persona.apellido like '%:filtro%'",
            countQuery = "select count(*) from persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}

