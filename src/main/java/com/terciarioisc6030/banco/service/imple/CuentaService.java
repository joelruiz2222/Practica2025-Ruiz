package com.terciarioisc6030.banco.service.imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.entity.CuentaBancaria;
import com.terciarioisc6030.banco.repository.IClienteRepository;
import com.terciarioisc6030.banco.repository.ICuentaBancariaRepository;
import com.terciarioisc6030.banco.service.ICuentaService;

@Service
public class CuentaService implements ICuentaService{

	@Autowired
	private ICuentaBancariaRepository repoCuenta;
	
	@Autowired
	private IClienteRepository repoCliente;
	
	@Override
	public void saveCuenta(CuentaBancaria cuenta) {
	
		repoCuenta.save(cuenta);
		
	}

	@Override
	public void deleteCuenta(Long id) {
		
		repoCuenta.deleteById(id);
		
	}

	@Override
	public void editCuenta(Long id_cuenta, CuentaBancaria cuenta) {
		
		CuentaBancaria cuentaB = this.findCuenta(id_cuenta);
		
		cuentaB.setNumero_cuenta(cuenta.getNumero_cuenta());
		cuentaB.setUnCliente(cuenta.getUnCliente());
		cuentaB.setFecha_ingreso(cuenta.getFecha_ingreso());
		cuentaB.setSaldo_actual(cuenta.getSaldo_actual());
		cuentaB.setLimite_extraccion(cuenta.getLimite_extraccion());
		
		this.saveCuenta(cuentaB);
		
	}

	@Override
	public CuentaBancaria findCuenta(Long id) {
		
		return repoCuenta.findById(id).orElse(null);
	}

	@Override
	public List<CuentaBancaria> getCuentas() {
		
		return repoCuenta.findAll();
		
	}

	@Override
	public void actualizarSueldo(Long id, double importe,String tipo_operacion) {
		
		CuentaBancaria cuentaB = this.findCuenta(id);
		
		if (tipo_operacion.equalsIgnoreCase("deposito")) {
			
			cuentaB.setSaldo_actual(cuentaB.getSaldo_actual() + importe);
			
		}else {
			
			if (tipo_operacion.equalsIgnoreCase("extraccion")) {
				
				cuentaB.setSaldo_actual(cuentaB.getSaldo_actual() - importe);
				
			}
				
		}
		
		this.saveCuenta(cuentaB);
		
	}

	@Override
	public List<CuentaBancaria> getCuentasByCliente(Cliente cliente) {
		
		return repoCuenta.findByunCliente(cliente);
		
		
	}



}
