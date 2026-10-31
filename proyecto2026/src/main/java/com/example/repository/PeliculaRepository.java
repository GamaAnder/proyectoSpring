package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Pelicula;

@Repository("peliculaRepository")
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}
