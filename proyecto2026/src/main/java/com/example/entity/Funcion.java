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
@Table(name="funcion")
public class Funcion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5403065864610085117L;

	@Id
	@Column(name="id_funcion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private int idFuncion;
	
	@Column(name="id_pelicula")
	private Integer idPelicula;
	
	@Column(name="id_sala")
	private Integer idSala;

	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="hora")
	private String hora;
	
	@Column(name="precio_entrada")
	private Double precioEntrada;

	public int getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(Double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
