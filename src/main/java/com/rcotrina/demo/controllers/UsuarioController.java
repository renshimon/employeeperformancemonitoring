package com.rcotrina.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcotrina.demo.models.IDocumentoService;
import com.rcotrina.demo.models.IPerfilService;
import com.rcotrina.demo.models.IUsuarioService;
import com.rcotrina.demo.models.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IDocumentoService documentoService;
	
	@Autowired
	private IPerfilService perfilService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		model.addAttribute("listaUsuarios", usuarioService.cargarUsuario());
		model.addAttribute("listaDocumentos", documentoService.cargarDocumento());
		model.addAttribute("listaPerfiles", perfilService.cargarPerfil());
		return "usuario/index";
	}
	
	@RequestMapping("/form")
	public String guardar(Usuario usuario) {
		usuario.setEstado("ACTIVO");
		String nombre,paterno,materno,nick;
		nombre = usuario.getNombre();
		paterno = usuario.getAppaterno();
		materno = usuario.getApmaterno();
		nick = nombre.charAt(0)+paterno+materno.charAt(0);
		usuario.setNick(nick.toLowerCase());
		usuarioService.guardarUsuario(usuario);
		return "redirect:/usuario/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		Usuario usuario = usuarioService.buscarUsuario(id);
		usuario.setEstado("INACTIVO");
		usuarioService.guardarUsuario(usuario);
		return "redirect:/usuario/";
	}
}
