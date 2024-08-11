package com.rcotrina.demo.models;

import java.util.List;

public interface IActividadService {
	
	public List<Actividad> cargarActividad();
	public void guardarActividad(Actividad actividad);
	public void eliminarActividad(Long id);
	public Actividad buscarActividad(Long id);

}
