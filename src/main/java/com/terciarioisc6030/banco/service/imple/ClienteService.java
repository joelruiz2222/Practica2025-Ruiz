package com.terciarioisc6030.banco.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.service.IClienteService;

@Service
public class ClienteService implements IClienteService{
	
	private List<Cliente> listaClientes = new ArrayList<Cliente>();
	
	@Override
	public void saveClient(Cliente cliente) {
		
		listaClientes.add(cliente);
		
	}

	@Override
	public void deleteClient(Long id_client) {

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
	    public Cliente findClientByDni(String dni_cliente) {
	        
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
		
			return listaClientes;
			
		}	

	@Override
	public void editClient(Cliente clienteEditado) {
		
		for (int i=0; i < listaClientes.size(); i++) {
			
			if (clienteEditado.getId_cliente() == listaClientes.get(i).getId_cliente()) {
				
				listaClientes.set(i, clienteEditado);
                                
				break;

			}
				
		}
		
	}

	@Override
	public Cliente findClient(Long id_cliente) {
	
		Cliente clienteB = new Cliente();
		
		for (Cliente cliente : listaClientes) {
			
			if (id_cliente == cliente.getId_cliente()) {
				
				clienteB = cliente;
				
				break;
				
			}
			
		}
		
		return clienteB;
	}

}
