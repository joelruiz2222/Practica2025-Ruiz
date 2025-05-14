package com.terciarioisc6030.banco.service;

import java.util.List;

import com.terciarioisc6030.banco.entity.CuentaBancaria;

public interface ICuentaService {

	public void saveCuenta(CuentaBancaria cuenta);
	
	public void deleteCuenta(Long id);
	
	public void editCuenta(CuentaBancaria cuenta);
	
	public CuentaBancaria findCuenta(Long id);
	
	public List<CuentaBancaria> getCuentas();
	
}
