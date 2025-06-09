package com.terciarioisc6030.banco.service.imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.repository.IClienteRepository;
import com.terciarioisc6030.banco.service.IClienteService;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private IClienteRepository repoCliente;
	
	@Override
	public void saveClient(Cliente cliente) {
		
		repoCliente.save(cliente);
		
	}

	@Override
	public void deleteClient(Long id_client) {

		repoCliente.deleteById(id_client);
		
	}
	
	    @Override
	    public Cliente findClientByDni(String dni_cliente) {
	        
	       return repoCliente.findBydni(dni_cliente);
	        
	    }
	 
		@Override
		public List<Cliente> getClients() {
		
			return repoCliente.findAll();
			
		}	

	@Override
	public void editClient(Long id_cliente, Cliente clienteEditado) {
		
		Cliente clienteB = this.findClient(id_cliente);
		
		clienteB.setDni(clienteEditado.getDni());
		clienteB.setNombre_usuario(clienteEditado.getNombre_usuario());
		clienteB.setClave(clienteEditado.getClave());
		clienteB.setNombre(clienteEditado.getNombre());
		clienteB.setDomicilio(clienteEditado.getDomicilio());
		clienteB.setCorreo_electronico(clienteEditado.getCorreo_electronico());
		clienteB.setEstado(clienteEditado.getEstado());
		
		this.saveClient(clienteB);
		
	}

	@Override
	public Cliente findClient(Long id_cliente) {
	
		return repoCliente.findById(id_cliente).orElse(null);

     }
	
}
