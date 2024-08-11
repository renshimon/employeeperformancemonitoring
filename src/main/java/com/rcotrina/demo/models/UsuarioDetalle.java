package com.rcotrina.demo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "usuarios_detalles")
public class UsuarioDetalle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usu_det")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "cod_det")
	Detalle detalle;
	
	@ManyToOne
	@JoinColumn(name = "cod_usu")
	Usuario usuario;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "hora_inicio")
	private String horai;
	
	@Column(name = "hora_final")
	private String horaf;
	
	@Column(name ="tiempo_usado")
	private String tiempou;
	
	@Column(name = "tiempo_ideal")
	private String tiempoi;
	
	@Column(name = "eficiencia")
	private double eficiencia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Detalle getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHorai() {
		return horai;
	}

	public void setHorai(String horai) {
		this.horai = horai;
	}

	public String getHoraf() {
		return horaf;
	}

	public void setHoraf(String horaf) {
		this.horaf = horaf;
	}

	public String getTiempou() {
		return tiempou;
	}

	public void setTiempou(String tiempou) {
		this.tiempou = tiempou;
	}

	public String getTiempoi() {
		return tiempoi;
	}

	public void setTiempoi(String tiempoi) {
		this.tiempoi = tiempoi;
	}

	public double getEficiencia() {
		return eficiencia;
	}

	public void setEficiencia(double eficiencia) {
		this.eficiencia = eficiencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
