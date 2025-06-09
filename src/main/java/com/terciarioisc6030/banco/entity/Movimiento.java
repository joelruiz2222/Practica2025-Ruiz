package com.terciarioisc6030.banco.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Movimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_movimiento;
	
	@ManyToOne()
	@JoinColumn(name = "unaCuenta")
	private CuentaBancaria unaCuenta;
	
	private String tipo_operacion;
	private double importe;
	private LocalDate fecha_movimiento;
	
	public Movimiento() {
		super();
	}
	
	public Movimiento(Long id_movimiento, CuentaBancaria unaCuenta, String tipo_operacion, double importe,
			LocalDate fecha_movimiento) {
		super();
		this.id_movimiento = id_movimiento;
		this.unaCuenta = unaCuenta;
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

	public Long getId_movimiento() {
		return id_movimiento;
	}

	public void setId_movimiento(Long id_movimiento) {
		this.id_movimiento = id_movimiento;
	}

	public CuentaBancaria getUnaCuenta() {
		return unaCuenta;
	}

	public void setUnaCuenta(CuentaBancaria unaCuenta) {
		this.unaCuenta = unaCuenta;
	}
	
}
