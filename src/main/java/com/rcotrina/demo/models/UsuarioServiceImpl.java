package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDAO usuarioDAO;
	
	@Override
	public List<Usuario> cargarUsuario() {
		return (List<Usuario>) usuarioDAO.findAll();
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		usuarioDAO.save(usuario);
		
	}

	@Override
	public void eliminarUsuario(Long id) {
		usuarioDAO.deleteById(id);
		
	}

	@Override
	public Usuario buscarUsuario(Long id) {
		return (Usuario) usuarioDAO.findById(id).get();
	}
	
	

}
