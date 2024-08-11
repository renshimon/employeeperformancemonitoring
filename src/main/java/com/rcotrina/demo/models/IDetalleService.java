package com.rcotrina.demo.models;

import java.util.List;

public interface IDetalleService {
	
	public List<Detalle> cargarDetalle();
	public void guardarDetalle(Detalle detalle);
	public void eliminarDetalle(Long id);
	public List<Detalle> listarPorModelo(Modelo modelo);

}
