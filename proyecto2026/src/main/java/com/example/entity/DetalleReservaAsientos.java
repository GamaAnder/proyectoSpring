package com.example.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detalle_reserva_asientos")
public class DetalleReservaAsientos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4219152344711721294L;

	@Id
	@Column(name="id_detalle")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idDetalle;
	
	@Column(name="id_reserva")
	private Integer idReserva;
	
	@Column(name="id_asiento")
	private Integer idAsiento;

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public Integer getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(Integer idAsiento) {
		this.idAsiento = idAsiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
