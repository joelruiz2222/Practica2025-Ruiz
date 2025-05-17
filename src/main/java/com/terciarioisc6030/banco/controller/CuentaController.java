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
import com.terciarioisc6030.banco.entity.Movimiento;
import com.terciarioisc6030.banco.service.IClienteService;
import com.terciarioisc6030.banco.service.ICuentaService;
import com.terciarioisc6030.banco.service.IMovimientoService;

@Controller
public class CuentaController {

	@Autowired
	private ICuentaService servCuenta; 
	
	@Autowired
	private IClienteService servCliente;
	
	@Autowired
	private IMovimientoService servMovimiento;
	
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
	
	@PostMapping("/cargar/movimiento")
	public String cargarMovimiento(Movimiento movimiento, @RequestParam("cuenta_id") Long id_cuenta,
			                                              @RequestParam("tipo_operacion") String tipo_operacion) {
		Random ramdon = new Random();
		
		movimiento.setId_movimiento(ramdon.nextLong(20));
		
		CuentaBancaria cuentaB = new CuentaBancaria();
		
		cuentaB = servCuenta.findCuenta(id_cuenta);
		
		movimiento.setUnaCuenta(cuentaB);
		
		movimiento.setTipo_operacion(tipo_operacion);
		
		servMovimiento.saveMovimiento(movimiento);
		
		return "redirect:/listaCuenta";
		
	}
	
	@PostMapping("/altaMovimiento")
	public String idCuenta(Model model, @RequestParam("cuenta_id") Long id_cuenta, 
			                            @RequestParam("tipo_operacion") String operacion) {
		
		Movimiento movimiento = new Movimiento();
		
		model.addAttribute("movimientoG", movimiento);
		
		CuentaBancaria cuentaB = servCuenta.findCuenta(id_cuenta);
		
		model.addAttribute("cuentaG", cuentaB);
		
		if (operacion.equalsIgnoreCase("deposito")) {
			
			return "banco/depositoCuenta";
			
		}
		
		if (operacion.equalsIgnoreCase("extraccion")) {
			
			return "banco/extraccionCuenta";
			
		}
		
		return null;
	}
	
	@PostMapping("/listaMovimiento")
	public String listaMovimientos(Model model, @RequestParam ("cuenta_id") Long id_cuenta) {
		
		model.addAttribute("listaMovimientos", servMovimiento.getMovimientosByCuenta(id_cuenta));
		
		return "banco/movimientoCuenta";
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
