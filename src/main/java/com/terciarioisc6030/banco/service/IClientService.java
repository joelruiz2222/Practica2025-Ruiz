package com.terciarioisc6030.banco.service;

import java.util.List;

import com.terciarioisc6030.banco.entity.Client;

public interface IClientService {

	public void saveClient(Client client,List <Client> listaC);
	
	public void deleteClient(Long id_client, List<Client> listC);
	
	public void editClient();
	
	public Client findClient();
	
	public List<Client> getClients();
	
}
