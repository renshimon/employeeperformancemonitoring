package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadServiceImpl implements IActividadService {

	@Autowired
	private IActividadDAO actividadDAO;
	
	@Override
	public List<Actividad> cargarActividad() {
		return (List<Actividad>) actividadDAO.findAll();
	}

	@Override
	public void guardarActividad(Actividad actividad) {
		actividadDAO.save(actividad);
	}

	@Override
	public void eliminarActividad(Long id) {
		actividadDAO.deleteById(id);
	}

	@Override
	public Actividad buscarActividad(Long id) {
		return (Actividad)actividadDAO.findById(id).get();
	}

}
