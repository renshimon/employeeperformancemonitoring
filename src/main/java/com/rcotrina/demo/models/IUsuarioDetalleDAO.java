package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDetalleDAO extends CrudRepository<UsuarioDetalle, Long> {
	
	public List<UsuarioDetalle> findByDetalle(Detalle detalle);
	public List<UsuarioDetalle> findByUsuario(Usuario usuario);

}
