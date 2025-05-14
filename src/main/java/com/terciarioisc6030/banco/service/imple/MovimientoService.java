package com.terciarioisc6030.banco.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.terciarioisc6030.banco.entity.Movimiento;
import com.terciarioisc6030.banco.service.IMovimientoService;

@Service
public class MovimientoService implements IMovimientoService{

	private List<Movimiento> listaMovimientos = new ArrayList<Movimiento>();
	
	@Override
	public void saveMovimiento(Movimiento movimiento) {
		
		listaMovimientos.add(movimiento);
		
	}

}
