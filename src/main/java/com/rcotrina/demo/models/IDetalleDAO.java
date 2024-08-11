package com.rcotrina.demo.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IDetalleDAO extends CrudRepository<Detalle, Long>{
	
	public List<Detalle> findByModelo(Modelo modelo);

}
