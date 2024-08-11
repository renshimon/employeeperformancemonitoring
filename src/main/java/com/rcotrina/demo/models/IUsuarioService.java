package com.rcotrina.demo.models;

import java.util.List;

public interface IUsuarioService {

	public List<Usuario> cargarUsuario();
	public void guardarUsuario(Usuario usuario);
	public void eliminarUsuario(Long id);
	public Usuario buscarUsuario(Long id);
	
}
