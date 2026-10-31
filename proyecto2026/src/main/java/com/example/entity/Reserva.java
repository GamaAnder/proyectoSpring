package com.example.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4450333284581588393L;

	@Id
	@Column(name="id_reserva")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idReserva;
	
	@Column(name="cantidad_entradas")
	private Integer cantidadEntradas;
	
	@Column(name="total_a_pagar")
	private Double totalAPagar;

	@Column(name="fecha_reserva")
	private Date fechaReserva;
	
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@Column(name="id_funcion")
	private Integer idFuncion;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(Integer idFuncion) {
		this.idFuncion = idFuncion;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Integer getCantidadEntradas() {
		return cantidadEntradas;
	}

	public void setCantidadEntradas(Integer cantidadEntradas) {
		this.cantidadEntradas = cantidadEntradas;
	}

	public Double getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(Double totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
