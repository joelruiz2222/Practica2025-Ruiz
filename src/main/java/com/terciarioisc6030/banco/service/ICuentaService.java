package com.terciarioisc6030.banco.service;

import java.util.List;

import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.entity.CuentaBancaria;

public interface ICuentaService {

	public void saveCuenta(CuentaBancaria cuenta);
	
	public void deleteCuenta(Long id);
	
	public void editCuenta(Long id_cuenta ,CuentaBancaria cuenta);
	
	public CuentaBancaria findCuenta(Long id);
	
	public List<CuentaBancaria> getCuentas();
	
	public void actualizarSueldo(Long id, double importe, String tipo_operacion);
	
	public List<CuentaBancaria> getCuentasByCliente(Cliente cliente);
	
}
