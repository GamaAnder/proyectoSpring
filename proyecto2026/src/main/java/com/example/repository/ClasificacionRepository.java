package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Clasificacion;

@Repository("clasificacionRepository")
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Integer> {

}
