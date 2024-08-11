package com.rcotrina.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_modelo")
public class Detalle implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_det")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "cod_mod")
	Modelo modelo;
	
	@ManyToOne
	@JoinColumn(name = "cod_act")
	Actividad actividad;
	
	@Column(name = "tiempo")
	private int tiempo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
