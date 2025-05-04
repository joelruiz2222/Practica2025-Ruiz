package com.terciarioisc6030.banco.entity;

public class Cliente {

	private Long id_cliente;
    private String dni;
	private String nombre_usuario;
	private String clave;
	private String nombre;
	private String domicilio;
	private String correo_electronico;
	private boolean estado;
	
	public Cliente() {
		super();
	}

	public Cliente(Long id_cliente, String dni, String nombre_usuario, String clave, String nombre, String domicilio,
			String correo_electronico, boolean estado) {
		super();
		this.id_cliente = id_cliente;
		this.dni = dni;
		this.nombre_usuario = nombre_usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.correo_electronico = correo_electronico;
		this.estado = estado;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
