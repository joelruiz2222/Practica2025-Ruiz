package com.terciarioisc6030.banco.service;

import java.util.List;

import com.terciarioisc6030.banco.entity.Cliente;

public interface IClienteService {

	public void saveClient(Cliente cliente);
	
	public void deleteClient(Long id_cliente);
	
	public void editClient(Cliente cliente);
	
	public Cliente findClient(Long id_cliente);
	
    public Cliente findClientByDni(String dni_cliente);
        
	public List<Cliente> getClients();
	
}
