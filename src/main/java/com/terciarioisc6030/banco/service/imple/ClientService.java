package com.terciarioisc6030.banco.service.imple;

import java.util.ArrayList;
import java.util.List;

import com.terciarioisc6030.banco.entity.Client;
import com.terciarioisc6030.banco.service.IClientService;

public class ClientService implements IClientService{

	
	@Override
	public void saveClient(Client client, List<Client> listaC) {
		
		listaC.add(client);
		
	}

	@Override
	public void deleteClient(Long id_client, List<Client> listaC) {

		Client clienteE = new Client();
		
		for (Client client : listaC) {
			
			if (id_client == client.getId_cliente()) {
				
				clienteE = client;
				
				break;
				
			}
			
		}
		
		if (clienteE != null) {
			
			
			listaC.remove(clienteE);
			
		}
		
		
	}

	@Override
	public void editClient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

}
