package com.rcotrina.demo.models;

import java.util.List;

public interface IUsuarioActividadService {

	public List<UsuarioActividad> cargarUsuarioActividad();
	public void guardarUsuarioActividad(UsuarioActividad usuarioActividad);
	public void eliminarUsuarioActividad(Long id);
	public UsuarioActividad buscarUsuarioActividad(Long id);
	public List<UsuarioActividad> listarPorUsuario(Usuario usuario);
	public List<UsuarioActividad> listarPorActividad(Actividad actividad);
	public List<UsuarioActividad> listarPorActividadAndUsuario(Usuario usuario, Actividad actividad);
}
