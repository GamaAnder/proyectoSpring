package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.DetalleReservaAsientos;

@Repository("detalle_reserva_asientosRepository")
public interface DetalleReservaAsientosRepository extends JpaRepository<DetalleReservaAsientos, Integer>{

}
