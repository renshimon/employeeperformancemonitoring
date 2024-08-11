package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoServiceImpl implements IDocumentoService {
	
	@Autowired
	private IDocumentoDAO documentoDAO;

	@Override
	public List<Documento> cargarDocumento() {
		return (List<Documento>) documentoDAO.findAll();
	}

	@Override
	public void guardarDocumento(Documento documento) {
		documentoDAO.save(documento);
	}

	@Override
	public void eliminarDocumento(Long id) {
		documentoDAO.deleteById(id);
	}
	
	@Override
	public Documento buscarDocumento(Long id) {
		return (Documento)documentoDAO.findById(id).get();
	}

}
