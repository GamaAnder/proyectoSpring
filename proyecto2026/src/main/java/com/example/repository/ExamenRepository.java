package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Examen;

@Repository("examenRepository")
public interface ExamenRepository extends JpaRepository<Examen, Integer> {
	
	public List<Examen>findByCarnetAndNota(String carnet, Integer nota);

}
