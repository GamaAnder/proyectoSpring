package com.example.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Funcion;


@Repository("funcionRepository")
public interface FuncionRepository extends JpaRepository<Funcion, Integer>{


}
