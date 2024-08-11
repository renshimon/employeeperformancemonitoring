package com.rcotrina.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcotrina.demo.models.Actividad;
import com.rcotrina.demo.models.Auxiliar;
import com.rcotrina.demo.models.IActividadService;
import com.rcotrina.demo.models.IUsuarioActividadService;
import com.rcotrina.demo.models.IUsuarioService;
import com.rcotrina.demo.models.Usuario;
import com.rcotrina.demo.models.UsuarioActividad;
/*
@Controller
@RequestMapping("/uactividad")
public class UsuarioActividadController {

	@Autowired
	private IUsuarioActividadService usuarioActividadService;

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IActividadService actividadService;

	Auxiliar auxiliar = new Auxiliar();

	int condicion = 0;

	@RequestMapping("/")
	public String inicio(Model model) {
		UsuarioActividad uactividad = new UsuarioActividad();
		Auxiliar aux2 = new Auxiliar();
		
		
		
		return "uactividad/index";
	}

	@RequestMapping("/form")
	public String guardar(Auxiliar aux) {

		auxiliar = aux;

		if (auxiliar.getIdActividad() == 0) {

			if (auxiliar.getIdUsuario() == 0)
				condicion = 0;
			else
				condicion = 1;
		} else if (auxiliar.getIdUsuario() == 0)
			condicion = 2;
		else
			condicion = 3;

		return "redirect:/uactividad/";
	}

}
*/