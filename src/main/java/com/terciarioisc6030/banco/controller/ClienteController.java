package com.terciarioisc6030.banco.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.service.IClienteService;
import com.terciarioisc6030.banco.service.imple.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private IClienteService servClient;
	
	@PostMapping("/cargar/cliente")
	public String saveClient(Cliente cliente, Model model) {
		
		Random id_random = new Random();
		
		Long id_R = id_random.nextLong(20);
		
		cliente.setId_cliente(id_R);
		
		servClient.saveClient(cliente);
		  
		model.addAttribute("clienteG", cliente);
		
		return "clientes/guardarCliente";
		
	}
	
	@PostMapping("/eliminar/cliente")
	public String deleteClient(@RequestParam("id_cliente") String id_cliente) {
		
		Long id_clientL = Long.parseLong(id_cliente);
		
		servClient.deleteClient(id_clientL);
		
		return "clientes/home";
		
	}
	
	@PostMapping("/editar/cliente")
	public String editClient(Cliente cliente) {
		
		servClient.editClient(cliente);
		
		return "redirect:/lista";
	}
	
	@PostMapping("/editar")
	public String editarCliente(@RequestParam("id_cliente") Long id_cliente, Model model) {
		
		model.addAttribute("clienteG", servClient.findClient(id_cliente));
		
		return "clientes/editarCliente";
	}
	
	@GetMapping("/buscardni/cliente")
	public String findClientByDni(@RequestParam("dni_cliente") String dni_cliente, Model model) {
		
    model.addAttribute("clienteBuscado", servClient.findClientByDni(dni_cliente));
		
	return "clientes/buscarCliente";
	
	}
	
	@GetMapping("/")
	public String home() {
		
		return "clientes/home";
	}
	
	@GetMapping("/alta")
	public String clientes(Model model) {
		
	    Cliente cliente = new Cliente();	
		
		model.addAttribute("clienteG", cliente);
		
		return "clientes/guardarCliente";
		
	}
	
	@GetMapping("/lista")
	public String listarClientes(Model model) {
		
		model.addAttribute("listC", servClient.getClients());
		
		return "clientes/listaCliente";
	}
	
	@GetMapping("/buscar")
	public String buscarCliente() {
		
		return "clientes/buscarCliente";
	}
	
}
