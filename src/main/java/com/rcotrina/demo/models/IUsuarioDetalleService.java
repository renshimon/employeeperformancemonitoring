package com.rcotrina.demo.models;

import java.util.List;

public interface IUsuarioDetalleService {
	
	public List<UsuarioDetalle> cargarUsuarioDetalle();
	public List<UsuarioDetalle> listarPorDetalle(Detalle detalle);
	public List<UsuarioDetalle> listarPorUsuario(Usuario usuario);
	/*
	public void guardarUsuarioActividad(UsuarioActividad usuarioActividad);
	public void eliminarUsuarioActividad(Long id);*/

}
