package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Genero;

@Repository("generoRepository")
public interface GeneroRepository extends JpaRepository<Genero, Integer>{

}
