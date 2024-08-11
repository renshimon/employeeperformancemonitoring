package com.rcotrina.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rcotrina.demo.models.Actividad;
import com.rcotrina.demo.models.Detalle;
import com.rcotrina.demo.models.IActividadService;
import com.rcotrina.demo.models.IDetalleService;
import com.rcotrina.demo.models.IModeloService;
import com.rcotrina.demo.models.Modelo;

@Controller
@RequestMapping("/detalle")
public class DetalleController {
	
	@Autowired
	private IDetalleService detalleService;
	
	@Autowired
	private IActividadService actividadService;
	
	@Autowired
	private IModeloService modeloService;
	
	@RequestMapping("/{id}")
	public String inicio(@PathVariable(value = "id") Long id, Model model) {
		Detalle detalle = new Detalle();
		Modelo modelo = modeloService.buscarModelo(id);
		Actividad actividad = new Actividad();
		model.addAttribute("detalle", detalle);
		model.addAttribute("actividad", actividad);
		model.addAttribute("listaDestalles", detalleService.listarPorModelo(modelo));
		model.addAttribute("listaActividades", actividadService.cargarActividad());
		model.addAttribute("iddet", id);
		return "detalle/index";
	}
	
	@RequestMapping(value = "/form/{id}",method = RequestMethod.POST)
	public String guardar(@PathVariable(value = "id") Long id, Detalle detalle) {
		Modelo modelo = modeloService.buscarModelo(id);
		detalle.setModelo(modelo);
		detalleService.guardarDetalle(detalle);
		return "redirect:/detalle/"+id;
	}
	
	@RequestMapping(value = "/form2/{id}",method = RequestMethod.POST)
	public String guardarActividad(@PathVariable(value="id") Long id, Actividad actividad, RedirectAttributes flash) {
		for (Actividad act : actividadService.cargarActividad()) {
			if(actividad.getNombre().equals(act.getNombre())) {
				flash.addFlashAttribute("error", "Actividad Duplicada");
				return "redirect:/detalle/"+id;
			}
		}
		actividad.setEstado("ACTIVO");
		actividadService.guardarActividad(actividad);
		return "redirect:/detalle/"+id;
	}
	
	@RequestMapping("/eliminar/{id}/{id2}")
	public String eliminar(@PathVariable(value = "id") Long id,@PathVariable(value = "id2") Long id2) {
		detalleService.eliminarDetalle(id);
		return "redirect:/detalle/"+id2;
	}

}
