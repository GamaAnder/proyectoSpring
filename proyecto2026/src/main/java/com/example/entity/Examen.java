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
@Table(name= "Examen")
public class Examen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1067613266535370738L;

	@Id
	@Column(name="idexamen")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idexamen;
	
	@Column(name= "fecha_examen")
	private Date fechaExamen;
	
	@Column(name= "nota")
	private Integer nota;
	
	@Column(name= "carnet")
	private String carnet;

	public int getIdexamen() {
		return idexamen;
	}

	public void setIdexamen(int idexamen) {
		this.idexamen = idexamen;
	}

	public Date getFechaExamen() {
		return fechaExamen;
	}

	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
