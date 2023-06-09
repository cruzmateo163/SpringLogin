package com.distribuida.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.entities.Cliente;
import com.distribuida.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping
	public String frmClientes(Model model) {
		
		List<Cliente> clientes = clienteService.findAll();
		
		model.addAttribute("keyClientes",clientes);
		
		return "clientes";
	}
	
	@RequestMapping("/frmAdd")
	public String frmAgregarCliente(Model model)  {
	
	Cliente cliente = new Cliente();
	
	model.addAttribute("cliente", cliente);
	
	return "agregar-clientes";
	
}
	
	@PostMapping("/add")
	public String add(@ModelAttribute("cliente") Cliente cliente, BindingResult bindingresult) {
		
		if(bindingresult.hasErrors()) {
			return "agregar-clientes";
		}else {
			clienteService.add(cliente);
			return "redirect:/clientes";
		}
		
	}

	@GetMapping("/findOne")
	public String findOne(@RequestParam("idCliente") int id, @RequestParam("opcion") int opcion, Model model) {
		
		Cliente cliente = clienteService.findOne(id);
		model.addAttribute("cliente", cliente);
		
		if(opcion == 1) {
			
			return "agregar-clientes";
		}else {
			return "eliminar-clientes";
		}
		
	}
	
	
	@GetMapping("/del")
	public String del(@ModelAttribute("cliente") Cliente cliente) {
		
		clienteService.del(cliente.getIdCliente());
		
		return "redirect:/clientes";
		
	}
	

	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmerEditor);
	}
	
	
	

}
