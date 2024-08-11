package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioActividadServiceImpl implements IUsuarioActividadService {

	@Autowired
	private IUsuarioActividadDAO usuarioActividadDAO;
	
	@Override
	public List<UsuarioActividad> cargarUsuarioActividad() {
		return (List<UsuarioActividad>) usuarioActividadDAO.findAll();
	}

	@Override
	public void guardarUsuarioActividad(UsuarioActividad usuarioActividad) {
		usuarioActividadDAO.save(usuarioActividad);
	}

	@Override
	public void eliminarUsuarioActividad(Long id) {
		usuarioActividadDAO.deleteById(id);
	}

	@Override
	public UsuarioActividad buscarUsuarioActividad(Long id) {
		return (UsuarioActividad) usuarioActividadDAO.findById(id).get();
	}

	@Override
	public List<UsuarioActividad> listarPorUsuario(Usuario usuario) {
		return (List<UsuarioActividad>) usuarioActividadDAO.findByUsuario(usuario);
	}

	@Override
	public List<UsuarioActividad> listarPorActividad(Actividad actividad) {
		// TODO Auto-generated method stub
		return (List<UsuarioActividad>) usuarioActividadDAO.findByActividad(actividad);
	}

	@Override
	public List<UsuarioActividad> listarPorActividadAndUsuario(Usuario usuario, Actividad actividad) {
		// TODO Auto-generated method stub
		return (List<UsuarioActividad>) usuarioActividadDAO.findByUsuarioAndActividad(usuario, actividad);
	}

}
