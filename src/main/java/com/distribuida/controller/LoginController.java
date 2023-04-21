package com.distribuida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.entities.Cliente;
import com.distribuida.service.ClienteService;

@Controller
@RequestMapping
public class LoginController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/login")
	public String login(@RequestParam String usuario, @RequestParam String contrasena, Model model) {
		
		System.out.print(usuario+ " " +contrasena);
		
		Cliente cliente = clienteService.validar(usuario, contrasena);
		model.addAttribute("usuario", cliente.getCedula());
		return "menu";
		
	}
	
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmerEditor);
	}
	

}
