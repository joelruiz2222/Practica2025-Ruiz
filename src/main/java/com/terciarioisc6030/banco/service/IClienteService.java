package com.terciarioisc6030.banco.service;

import java.util.List;

import com.terciarioisc6030.banco.entity.Cliente;

public interface IClienteService {

	public void saveClient(Cliente cliente, List<Cliente> listaC);
	
	public void deleteClient(Long id_cliente, List<Cliente> listaC);
	
	public void editClient();
	
	public Cliente findClient(Long id_cliente);
	
    public Cliente findClientByDni(String dni_cliente, List<Cliente> listaC);
        
	public List<Cliente> getClients();
	
}
