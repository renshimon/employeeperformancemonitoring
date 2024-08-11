package com.rcotrina.demo.models;

import java.util.List;

public interface IDocumentoService {
	
	public List<Documento> cargarDocumento();
	public void guardarDocumento(Documento cargo);
	public void eliminarDocumento(Long id);
	public Documento buscarDocumento(Long id);

}
