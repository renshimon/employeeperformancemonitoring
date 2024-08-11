package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeloServiceImpl implements IModeloService {
	
	@Autowired
	private IModeloDAO modeloDAO;

	@Override
	public List<Modelo> cargarModelo() {
		return (List<Modelo>) modeloDAO.findAll();
	}

	@Override
	public void guardarModelo(Modelo modelo) {
		modeloDAO.save(modelo);
	}

	@Override
	public void eliminarModelo(Long id) {
		modeloDAO.deleteById(id);
	}

	@Override
	public Modelo buscarModelo(Long id) {
		return (Modelo) modeloDAO.findById(id).get();
	}

}
