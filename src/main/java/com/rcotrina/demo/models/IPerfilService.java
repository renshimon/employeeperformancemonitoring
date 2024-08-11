package com.rcotrina.demo.models;

import java.util.List;

public interface IPerfilService {
	
	public List<Perfil> cargarPerfil();
	public void guardarPerfil(Perfil perfil);
	public void eliminarPerfil(Long id);
	public Perfil buscarPerfil(Long id);

}
