package com.terciarioisc6030.banco.service;

import java.util.List;

import com.terciarioisc6030.banco.entity.Movimiento;

public interface IMovimientoService {

	public void saveMovimiento(Movimiento movimiento);
	
	public List<Movimiento> getMovimientosByCuenta(Long id_cuenta);
	
}
