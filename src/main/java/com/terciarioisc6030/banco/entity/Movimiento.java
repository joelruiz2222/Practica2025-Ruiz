package com.terciarioisc6030.banco.entity;

import java.time.LocalDate;

public class Movimiento {

	private String tipo_operacion;
	private double importe;
	private LocalDate fecha_movimiento;
	
	public Movimiento() {
		super();
	}

	public Movimiento(String tipo_operacion, double importe, LocalDate fecha_movimiento) {
		super();
		this.tipo_operacion = tipo_operacion;
		this.importe = importe;
		this.fecha_movimiento = fecha_movimiento;
	}

	public String getTipo_operacion() {
		return tipo_operacion;
	}

	public void setTipo_operacion(String tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public LocalDate getFecha_movimiento() {
		return fecha_movimiento;
	}

	public void setFecha_movimiento(LocalDate fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}
	
}
