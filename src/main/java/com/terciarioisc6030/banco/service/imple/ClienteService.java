package com.terciarioisc6030.banco.service.imple;

import java.util.ArrayList;
import java.util.List;

import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.service.IClienteService;

public class ClienteService implements IClienteService{
	
	@Override
	public void saveClient(Cliente cliente, List<Cliente> listaClientes) {
		
		listaClientes.add(cliente);
		
	}

	@Override
	public void deleteClient(Long id_client, List<Cliente> listaClientes) {

		Cliente clienteE = new Cliente();
		
		for (Cliente cliente : listaClientes) {
			
			if (id_client == cliente.getId_cliente()) {
				
				clienteE = cliente;
				
				break;
				
			}
			
		}
		
		if (clienteE != null) {
			
			
			listaClientes.remove(clienteE);
			
		}
		
		
	}
	
	 @Override
	    public Cliente findClientByDni(String dni_cliente, List<Cliente> listaClientes) {
	        
	        Cliente clienteE = new Cliente();
	        
	        for (Cliente cliente : listaClientes) {
				
	        	if (dni_cliente.equalsIgnoreCase(cliente.getDni())) {
					
	        		
	        		clienteE = cliente;
	        		
	        		
	        		break;
				}
	        	
	        	
			}
	    		
	            return clienteE;
	        
	    }
	 
		@Override
		public List<Cliente> getClients() {
			
		
			//no se necesita
			
			return null;
			
		}	


	@Override
	public void editClient() {
		
		
		//no se necesita
		
		
	}

	@Override
	public Cliente findClient(Long id_cliente) {
	
		//no se necesita
		
		
		return null;
	}


}
