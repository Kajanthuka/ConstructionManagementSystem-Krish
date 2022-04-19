package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Client;

public interface ClientServiceImpl {
	
	public Client save(Client client);
	public List<Client> getAll();

}
