package com.terciarioisc6030.banco.service.imple;

import java.util.List;

import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.service.IClienteService;

public class ClienteService implements IClienteService{

	
	@Override
	public void saveClient(Cliente cliente, List<Cliente> listaC) {
		
		listaC.add(cliente);
		
	}

	@Override
	public void deleteClient(Long id_client, List<Cliente> listaC) {

		Cliente clienteE = new Cliente();
		
		for (Cliente cliente : listaC) {
			
			if (id_client == cliente.getId_cliente()) {
				
				clienteE = cliente;
				
				break;
				
			}
			
		}
		
		if (clienteE != null) {
			
			
			listaC.remove(clienteE);
			
		}
		
		
	}
	
	 @Override
	    public Cliente findClientByDni(String dni_cliente,List<Cliente> listaC) {
	        
	        Cliente clienteE = new Cliente();
	        
	        for (Cliente cliente : listaC) {
				
	        	if (dni_cliente.equalsIgnoreCase(cliente.getDni())) {
					
	        		
	        		clienteE = cliente;
	        		
	        		
	        		break;
				}
	        	
	        	
			}
	    		
	            return clienteE;
	        
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

	@Override
	public List<Cliente> getClients() {
		
		
		//no se necesita
		
		return null;
	}	

}
