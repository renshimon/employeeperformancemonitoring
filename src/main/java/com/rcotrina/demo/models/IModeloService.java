package com.rcotrina.demo.models;

import java.util.List;

public interface IModeloService {
	
	public List<Modelo> cargarModelo();
	public void guardarModelo(Modelo modelo);
	public void eliminarModelo(Long id);
	public Modelo buscarModelo(Long id);

}
