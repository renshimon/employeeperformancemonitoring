package com.rcotrina.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class PrincipalController {
	
	@RequestMapping("/")
	private String inicio() {
		return "principal/index";
	}

}
