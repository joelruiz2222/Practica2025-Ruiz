package com.terciarioisc6030.banco.service.imple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import com.terciarioisc6030.banco.controller.ClienteController;
import com.terciarioisc6030.banco.entity.CuentaBancaria;
import com.terciarioisc6030.banco.service.ICuentaService;

@Service
public class CuentaService implements ICuentaService{

    private final ClienteController clienteController;

	private List<CuentaBancaria> listaCuentas = new ArrayList<CuentaBancaria>();

    CuentaService(ClienteController clienteController) {
        this.clienteController = clienteController;
    }
	
	@Override
	public void saveCuenta(CuentaBancaria cuenta) {
	
		listaCuentas.add(cuenta);
		
	}

	@Override
	public void deleteCuenta(Long id) {
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		for (CuentaBancaria cuentaBancaria : listaCuentas) {
			
			if (id == cuentaBancaria.getId_cuenta()) {
				
				cuenta = cuentaBancaria;
			
				break;
				
			}
			
		}
		
		if (cuenta != null) {
			
			listaCuentas.remove(cuenta);
			
		}
		
	}

	@Override
	public void editCuenta(CuentaBancaria cuenta) {
		
		for (int i = 0; i < listaCuentas.size(); i++) {
		
			if (cuenta.getId_cuenta() == listaCuentas.get(i).getId_cuenta()) {
				
				listaCuentas.set(i, cuenta);
				
				break;
				
			}
			
		}
		
	}

	@Override
	public CuentaBancaria findCuenta(Long id) {
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
	   for (CuentaBancaria cuentaBancaria : listaCuentas) {
		
		   if (id == cuentaBancaria.getId_cuenta()) {
			
			   cuenta = cuentaBancaria;
			   
			   break;
			   
		}
		   
	}
		
		return cuenta;
	}

	@Override
	public List<CuentaBancaria> getCuentas() {
		
		return listaCuentas;
		
	}

}
