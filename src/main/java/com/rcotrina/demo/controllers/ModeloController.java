package com.rcotrina.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcotrina.demo.models.IModeloService;
import com.rcotrina.demo.models.Modelo;

@Controller
@RequestMapping("/modelo")
public class ModeloController {
	
	@Autowired
	private IModeloService modeloService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Modelo modelo = new Modelo();
		model.addAttribute("modelo", modelo);
		model.addAttribute("listaModelos", modeloService.cargarModelo());
		return "modelo/index";
	}
	
	@RequestMapping("/form")
	public String guardar(Modelo modelo) {
		modeloService.guardarModelo(modelo);
		return "redirect:/modelo/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		modeloService.eliminarModelo(id);
		return "redirect:/modelo/";
	}


}
