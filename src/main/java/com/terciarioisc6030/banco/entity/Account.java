package com.terciarioisc6030.banco.entity;

import java.time.LocalDate;

public class Account {

	private Long id_cuenta;
	private Long numero_cuenta;
	private Client unCliente;
	private LocalDate fecha_ingreso;
	private double saldo_actual;
	private boolean estado;
	private double limite_extraccion;
	
	public Account() {
		super();
	}

	public Account(Long id_cuenta, Long numero_cuenta, Client unCliente, LocalDate fecha_ingreso, double saldo_actual,
			boolean estado, double limite_extraccion) {
		super();
		this.id_cuenta = id_cuenta;
		this.numero_cuenta = numero_cuenta;
		this.unCliente = unCliente;
		this.fecha_ingreso = fecha_ingreso;
		this.saldo_actual = saldo_actual;
		this.estado = estado;
		this.limite_extraccion = limite_extraccion;
	}

	public Long getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(Long id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public Long getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(Long numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public Client getUnCliente() {
		return unCliente;
	}

	public void setUnCliente(Client unCliente) {
		this.unCliente = unCliente;
	}

	public LocalDate getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(LocalDate fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public double getSaldo_actual() {
		return saldo_actual;
	}

	public void setSaldo_actual(double saldo_actual) {
		this.saldo_actual = saldo_actual;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getLimite_extraccion() {
		return limite_extraccion;
	}

	public void setLimite_extraccion(double limite_extraccion) {
		this.limite_extraccion = limite_extraccion;
	}
	
}
