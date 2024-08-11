package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleServiceImpl implements IDetalleService {
	
	@Autowired
	private IDetalleDAO detalleDAO;

	@Override
	public List<Detalle> cargarDetalle() {
		return (List<Detalle>) detalleDAO.findAll();
	}

	@Override
	public void guardarDetalle(Detalle detalle) {
		detalleDAO.save(detalle);
	}

	@Override
	public void eliminarDetalle(Long id) {
		detalleDAO.deleteById(id);
	}

	@Override
	public List<Detalle> listarPorModelo(Modelo modelo) {
		return (List<Detalle>) detalleDAO.findByModelo(modelo);
	}
	

}
