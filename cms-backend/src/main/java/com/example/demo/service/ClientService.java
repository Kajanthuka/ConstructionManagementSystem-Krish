package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;

@Service
public class ClientService implements ClientServiceImpl{
@Autowired ClientRepository clientRepository;

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public List<Client> getAll() {
		return clientRepository.findAll();
	}
	
	

}
