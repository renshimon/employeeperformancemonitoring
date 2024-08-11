package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilServiceImpl implements IPerfilService {

	@Autowired
	private IPerfilDAO perfilDAO;
	
	@Override
	public List<Perfil> cargarPerfil() {
		return (List<Perfil>)perfilDAO.findAll();
	}

	@Override
	public void guardarPerfil(Perfil perfil) {
		perfilDAO.save(perfil);
	}

	@Override
	public void eliminarPerfil(Long id) {
		perfilDAO.deleteById(id);
	}

	@Override
	public Perfil buscarPerfil(Long id) {
		return (Perfil)perfilDAO.findById(id).get();
	}

}
