package com.rcotrina.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcotrina.demo.models.IPerfilService;
import com.rcotrina.demo.models.Perfil;

@Controller
@RequestMapping("/perfil")
public class PerfilController {
	
	@Autowired
	private IPerfilService perfilService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Perfil perfil = new Perfil();
		model.addAttribute("perfil", perfil);
		model.addAttribute("listaPerfiles", perfilService.cargarPerfil());
		return "perfil/index";
	}
	
	@RequestMapping("/form")
	public String guardar(Perfil perfil) {
		perfil.setEstado("ACTIVO");
		perfilService.guardarPerfil(perfil);
		return "redirect:/perfil/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		Perfil perfil = perfilService.buscarPerfil(id);
		perfil.setEstado("INACTIVO");
		perfilService.guardarPerfil(perfil);
		return "redirect:/perfil/";
	}

}
