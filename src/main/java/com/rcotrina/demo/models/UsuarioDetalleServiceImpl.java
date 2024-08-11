package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioDetalleServiceImpl implements IUsuarioDetalleService {
	
	@Autowired
	private IUsuarioDetalleDAO usuarioDetalleDAO;

	@Override
	public List<UsuarioDetalle> cargarUsuarioDetalle() {
		return (List<UsuarioDetalle>) usuarioDetalleDAO.findAll();
	}
	@Override
	public List<UsuarioDetalle> listarPorDetalle(Detalle detalle) {
		return (List<UsuarioDetalle>) usuarioDetalleDAO.findByDetalle(detalle);
	}

	@Override
	public List<UsuarioDetalle> listarPorUsuario(Usuario usuario) {
		return (List<UsuarioDetalle>) usuarioDetalleDAO.findByUsuario(usuario);
	}

}
