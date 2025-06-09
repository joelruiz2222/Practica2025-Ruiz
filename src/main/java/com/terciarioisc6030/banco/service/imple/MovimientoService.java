package com.terciarioisc6030.banco.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terciarioisc6030.banco.entity.Movimiento;
import com.terciarioisc6030.banco.repository.IMovimientoRepository;
import com.terciarioisc6030.banco.service.IMovimientoService;

@Service
public class MovimientoService implements IMovimientoService{

	private List<Movimiento> listaMovimientos = new ArrayList<Movimiento>();
	
	@Autowired
	private IMovimientoRepository repoMovimiento;
	
	@Override
	public void saveMovimiento(Movimiento movimiento) {
		
		repoMovimiento.save(movimiento);
		
	}

	@Override
	public List<Movimiento> getMovimientosByCuenta(Long id_cuenta) {
	
		List<Movimiento> movimientosBuscados = new ArrayList<Movimiento>();
		
		for (Movimiento movimiento : listaMovimientos) {
			
			if (id_cuenta == movimiento.getUnaCuenta().getId_cuenta()) {
				
				
				movimientosBuscados.add(movimiento);
				
			}
			
		}
		
		return movimientosBuscados;
	}

}
