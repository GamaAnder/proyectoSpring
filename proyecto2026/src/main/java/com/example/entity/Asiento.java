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
@Table(name="asiento")
public class Asiento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3498903158336053389L;

	@Id
	@Column(name="id_asiento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idAsiento;
	
	@Column(name="id_sala")
	private Integer idSala;
	
	@Column(name="fila")
	private String fila;
	
	@Column(name="numero")
	private Integer numero;

	public int getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
