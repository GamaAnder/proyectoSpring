package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Reserva;

@Repository("reservaRepository")
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
