package com.rcotrina.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcotrina.demo.models.Actividad;
import com.rcotrina.demo.models.IActividadService;

@Controller
@RequestMapping("/actividad")
public class ActividadController {
	
	@Autowired
	private IActividadService actividadService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Actividad actividad = new Actividad();
		model.addAttribute("actividad", actividad);
		model.addAttribute("listaActividades", actividadService.cargarActividad());
		return "actividad/index";
	}
	
	@RequestMapping("/form")
	public String guardar(Actividad actividad) {
		actividad.setEstado("ACTIVO");
		actividadService.guardarActividad(actividad);
		return "redirect:/actividad/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		Actividad actividad = actividadService.buscarActividad(id);
		actividad.setEstado("INACTIVO");
		actividadService.guardarActividad(actividad);
		return "redirect:/actividad/";
	}

}
