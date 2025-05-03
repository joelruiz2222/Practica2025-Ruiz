package com.terciarioisc6030.banco.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.terciarioisc6030.banco.entity.Client;
import com.terciarioisc6030.banco.service.IClientService;
import com.terciarioisc6030.banco.service.imple.ClientService;

@Controller
public class ClientController {

	List<Client> listClients = new ArrayList<>();
	
	IClientService servClient = new ClientService();
	
	@PostMapping("/cargar/cliente")
	public String saveClient(@ModelAttribute("clienteG") Client cliente) {
		
		Random id_random = new Random();
		
		Long id_R = id_random.nextLong(20);
		
		cliente.setId_cliente(id_R);
		
		servClient.saveClient(cliente, listClients);
		
		return "clients/saveClient";
		
	}
	
	@PostMapping("/eliminar/cliente")
	public String deleteClient(@RequestParam String id_cliente) {
		
		Long id_clientL = Long.parseLong(id_cliente);
		
		servClient.deleteClient(id_clientL, listClients);
		
		return "/clients/clients";
	}
	
	//@DeleteMapping
	
	//@PutMapping
	
	@GetMapping("/")
	public String mostrarHome() {
		
		return "clients/clients";
	}
	
	
	@GetMapping("/alta")
	public String brindarObjeto(Model model) {
		
	    Client cliente = new Client();	
		
		model.addAttribute("clienteG", cliente);
		
		return "clients/saveClient";
		
	}
	
	@GetMapping("/lista/cliente")
	public String listClient(Model model) {
		
		model.addAttribute("listC", listClients);
		
		return "/clients/listClients";
	}
	
}
