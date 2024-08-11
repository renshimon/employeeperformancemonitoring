package com.rcotrina.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcotrina.demo.models.Documento;
import com.rcotrina.demo.models.IDocumentoService;

@Controller
@RequestMapping("/documento")
public class DocumentoController {
	
	@Autowired
	private IDocumentoService documentoService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Documento documento = new Documento();
		model.addAttribute("documento", documento);
		model.addAttribute("listaDocumentos", documentoService.cargarDocumento());
		return "documento/index";
	}
	
	@RequestMapping("/form")
	public String guardar(Documento documento) {
		documento.setEstado("ACTIVO");
		documentoService.guardarDocumento(documento);
		return "redirect:/documento/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		Documento documento = documentoService.buscarDocumento(id);
		documento.setEstado("INACTIVO");
		documentoService.guardarDocumento(documento);
		return "redirect:/documento/";
	}

}
