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
@Table(name="sala")
public class Sala implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8665139083437279675L;
	
	@Id
	@Column(name="id_sala")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private int idSala;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="filas")
	private Integer filas;

	@Column(name="asientos_por_fila")
	private String asientosPorFila;

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getFilas() {
		return filas;
	}

	public void setFilas(Integer filas) {
		this.filas = filas;
	}

	public String getAsientosPorFila() {
		return asientosPorFila;
	}

	public void setAsientosPorFila(String asientosPorFila) {
		this.asientosPorFila = asientosPorFila;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
