package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IUsuarioActividadDAO extends CrudRepository<UsuarioActividad, Long> {
	
	public List<UsuarioActividad> findByUsuario(Usuario usuario);
	public List<UsuarioActividad> findByActividad(Actividad actividad);
	public List<UsuarioActividad> findByUsuarioAndActividad(Usuario usuario, Actividad actividad);

}
