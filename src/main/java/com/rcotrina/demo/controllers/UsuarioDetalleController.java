package com.rcotrina.demo.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcotrina.demo.models.Auxiliar;
import com.rcotrina.demo.models.IModeloService;
import com.rcotrina.demo.models.IUsuarioDetalleService;
import com.rcotrina.demo.models.IUsuarioService;
import com.rcotrina.demo.models.Modelo;
import com.rcotrina.demo.models.Usuario;
import com.rcotrina.demo.models.UsuarioDetalle;

@Controller
@RequestMapping("/udetalle")
public class UsuarioDetalleController {

	@Autowired
	private IUsuarioDetalleService udetalleService;

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IModeloService modeloService;

	Auxiliar auxiliar = new Auxiliar();

	List<UsuarioDetalle> listaAux = new ArrayList<UsuarioDetalle>();
	int condicion = 0;

	@RequestMapping("/")
	public String inicio(Model model) {

		List<UsuarioDetalle> miLista = new ArrayList<UsuarioDetalle>();

		miLista = udetalleService.cargarUsuarioDetalle();

		List<UsuarioDetalle> reverse = reverseList(miLista);

		Auxiliar aux2 = new Auxiliar();

		model.addAttribute("listaUsuario", usuarioService.cargarUsuario());
		model.addAttribute("listaModelos", modeloService.cargarModelo());
		model.addAttribute("auxiliar", aux2);

		listaAux.clear();

		switch (condicion) {
		case 0:

			model.addAttribute("listaUDetalles", reverse);
			condicion = 0;
			break;

		case 1:

			for (UsuarioDetalle ud : udetalleService.cargarUsuarioDetalle()) {
				if (ud.getDetalle().getModelo().getId().equals(auxiliar.getIdModelo()))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 2:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getUsuario().getId().equals(auxiliar.getIdUsuario()))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 3:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getFecha().after(auxiliar.getFechaInicio()) || ud.getFecha().equals(auxiliar.getFechaInicio()))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 4:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getFecha().before(auxiliar.getFechaFinal()) || ud.getFecha().equals(auxiliar.getFechaFinal()))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 5:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getDetalle().getModelo().getId().equals(auxiliar.getIdModelo())
						&& ud.getUsuario().getId().equals(auxiliar.getIdUsuario()))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 6:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getDetalle().getModelo().getId().equals(auxiliar.getIdModelo())
						&& (ud.getFecha().after(auxiliar.getFechaInicio())
								|| ud.getFecha().equals(auxiliar.getFechaInicio())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 7:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getDetalle().getModelo().getId().equals(auxiliar.getIdModelo())
						&& (ud.getFecha().before(auxiliar.getFechaFinal())
								|| ud.getFecha().equals(auxiliar.getFechaFinal())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 8:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getUsuario().getId().equals(auxiliar.getIdUsuario())
						&& (ud.getFecha().after(auxiliar.getFechaInicio())
								|| ud.getFecha().equals(auxiliar.getFechaInicio())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 9:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getUsuario().getId().equals(auxiliar.getIdUsuario())
						&& (ud.getFecha().before(auxiliar.getFechaFinal())
								|| ud.getFecha().equals(auxiliar.getFechaFinal())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 10:

			for (UsuarioDetalle ud : miLista) {
				if ((ud.getFecha().after(auxiliar.getFechaInicio()) || ud.getFecha().equals(auxiliar.getFechaInicio()))
						&& (ud.getFecha().before(auxiliar.getFechaFinal())
								|| ud.getFecha().equals(auxiliar.getFechaFinal())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 11:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getDetalle().getModelo().getId().equals(auxiliar.getIdModelo())
						&& ud.getUsuario().getId().equals(auxiliar.getIdUsuario())
						&& (ud.getFecha().after(auxiliar.getFechaInicio())
								|| ud.getFecha().equals(auxiliar.getFechaInicio())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 12:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getDetalle().getModelo().getId().equals(auxiliar.getIdModelo())
						&& ud.getUsuario().getId().equals(auxiliar.getIdUsuario())
						&& (ud.getFecha().before(auxiliar.getFechaFinal())
								|| ud.getFecha().equals(auxiliar.getFechaFinal())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 13:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getDetalle().getModelo().getId().equals(auxiliar.getIdModelo())
						&& (ud.getFecha().after(auxiliar.getFechaInicio())
								|| ud.getFecha().equals(auxiliar.getFechaInicio()))
						&& (ud.getFecha().before(auxiliar.getFechaFinal())
								|| ud.getFecha().equals(auxiliar.getFechaFinal())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		case 14:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getUsuario().getId().equals(auxiliar.getIdUsuario())
						&& (ud.getFecha().after(auxiliar.getFechaInicio())
								|| ud.getFecha().equals(auxiliar.getFechaInicio()))
						&& (ud.getFecha().before(auxiliar.getFechaFinal())
								|| ud.getFecha().equals(auxiliar.getFechaFinal())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		default:

			for (UsuarioDetalle ud : miLista) {
				if (ud.getDetalle().getModelo().getId().equals(auxiliar.getIdModelo())
						&& ud.getUsuario().getId().equals(auxiliar.getIdUsuario())
						&& (ud.getFecha().after(auxiliar.getFechaInicio())
								|| ud.getFecha().equals(auxiliar.getFechaInicio()))
						&& (ud.getFecha().before(auxiliar.getFechaFinal())
								|| ud.getFecha().equals(auxiliar.getFechaFinal())))
					listaAux.add(ud);
			}
			model.addAttribute("listaUDetalles", listaAux);
			condicion = 0;
			break;

		}

		return "udetalle/index";

	}

	@RequestMapping("/form")
	public String guardar(Auxiliar aux) {

		auxiliar = aux;

		if (auxiliar.getIdModelo() == 0 && auxiliar.getIdUsuario() == 0 && auxiliar.getFechaInicio() == null
				&& auxiliar.getFechaFinal() == null)
			condicion = 0;

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		if (auxiliar.getIdModelo() != 0 && auxiliar.getIdUsuario() == 0 && auxiliar.getFechaInicio() == null
				&& auxiliar.getFechaFinal() == null)
			condicion = 1;

		if (auxiliar.getIdModelo() == 0 && auxiliar.getIdUsuario() != 0 && auxiliar.getFechaInicio() == null
				&& auxiliar.getFechaFinal() == null)
			condicion = 2;

		if (auxiliar.getIdModelo() == 0 && auxiliar.getIdUsuario() == 0 && auxiliar.getFechaInicio() != null
				&& auxiliar.getFechaFinal() == null)
			condicion = 3;

		if (auxiliar.getIdModelo() == 0 && auxiliar.getIdUsuario() == 0 && auxiliar.getFechaInicio() == null
				&& auxiliar.getFechaFinal() != null)
			condicion = 4;

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		if (auxiliar.getIdModelo() != 0 && auxiliar.getIdUsuario() != 0 && auxiliar.getFechaInicio() == null
				&& auxiliar.getFechaFinal() == null)
			condicion = 5;

		if (auxiliar.getIdModelo() != 0 && auxiliar.getIdUsuario() == 0 && auxiliar.getFechaInicio() != null
				&& auxiliar.getFechaFinal() == null)
			condicion = 6;

		if (auxiliar.getIdModelo() != 0 && auxiliar.getIdUsuario() == 0 && auxiliar.getFechaInicio() == null
				&& auxiliar.getFechaFinal() != null)
			condicion = 7;

		if (auxiliar.getIdModelo() == 0 && auxiliar.getIdUsuario() != 0 && auxiliar.getFechaInicio() != null
				&& auxiliar.getFechaFinal() == null)
			condicion = 8;

		if (auxiliar.getIdModelo() == 0 && auxiliar.getIdUsuario() != 0 && auxiliar.getFechaInicio() == null
				&& auxiliar.getFechaFinal() != null)
			condicion = 9;

		if (auxiliar.getIdModelo() == 0 && auxiliar.getIdUsuario() == 0 && auxiliar.getFechaInicio() != null
				&& auxiliar.getFechaFinal() != null)
			condicion = 10;

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		if (auxiliar.getIdModelo() != 0 && auxiliar.getIdUsuario() != 0 && auxiliar.getFechaInicio() != null
				&& auxiliar.getFechaFinal() == null)
			condicion = 11;

		if (auxiliar.getIdModelo() != 0 && auxiliar.getIdUsuario() != 0 && auxiliar.getFechaInicio() == null
				&& auxiliar.getFechaFinal() != null)
			condicion = 12;

		if (auxiliar.getIdModelo() != 0 && auxiliar.getIdUsuario() == 0 && auxiliar.getFechaInicio() != null
				&& auxiliar.getFechaFinal() != null)
			condicion = 13;

		if (auxiliar.getIdModelo() == 0 && auxiliar.getIdUsuario() != 0 && auxiliar.getFechaInicio() != null
				&& auxiliar.getFechaFinal() != null)
			condicion = 14;

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		if (auxiliar.getIdModelo() != 0 && auxiliar.getIdUsuario() != 0 && auxiliar.getFechaInicio() != null
				&& auxiliar.getFechaFinal() != null)
			condicion = 15;

		return "redirect:/udetalle/";
	}

	public static <T> List<T> reverseList(List<T> list) {
		return list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(ArrayList::new), lst -> {
			Collections.reverse(lst);
			return lst.stream();
		})).collect(Collectors.toCollection(ArrayList::new));
	}

}
