package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Client;
import com.example.demo.service.ClientService;

@RestController
public class ClientController {
	@Autowired ClientService clientService;
	
	@RequestMapping(value="/client1" ,  method = RequestMethod.GET)
	public String Greetings() {
		return "Hi This is Client Endopoint";
	}
	
	@RequestMapping(value = "/client", method = RequestMethod.POST)
	public Client save(@RequestBody Client client) {
		return clientService.save(client);
	}

	@RequestMapping(value="/client" , method = RequestMethod.GET)
	public List<Client> getAll(){
		return clientService.getAll();
	}
}
