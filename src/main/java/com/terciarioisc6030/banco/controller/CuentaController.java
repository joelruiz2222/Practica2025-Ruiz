package com.terciarioisc6030.banco.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.entity.CuentaBancaria;
import com.terciarioisc6030.banco.service.IClienteService;
import com.terciarioisc6030.banco.service.ICuentaService;

@Controller
public class CuentaController {

	@Autowired
	private ICuentaService servCuenta; 
	
	@Autowired
	private IClienteService servCliente;
	
	@PostMapping("/cargar/cuenta")
	public String cargarCuenta(CuentaBancaria cuenta, @RequestParam("cliente_id") Long id_cliente){
		
		Random ramdon = new Random();
		
		cuenta.setId_cuenta(ramdon.nextLong(20));
		
		Cliente clienteB = servCliente.findClient(id_cliente);
		
		cuenta.setUnCliente(clienteB);
		
		servCuenta.saveCuenta(cuenta);
		
		return "redirect:/altaCuenta";
	}
	
	
	
	@GetMapping("/listaCuenta")
	public String listaCuentas(Model model) {
		
		model.addAttribute("listaCuentas", servCuenta.getCuentas());
		
		return "banco/listaCuenta";
	}
	
	
	@GetMapping("/altaCuenta")
	public String cuenta(Model model) {
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		model.addAttribute("cuentaG", cuenta);
		
		model.addAttribute("listaClientes", servCliente.getClients());
		
		return "banco/guardarCuenta";
	}
	
	@GetMapping("/homeCuenta")
	public String homeCuenta() {
		
		return "banco/homeCuenta";
	}
	
	
	
}
