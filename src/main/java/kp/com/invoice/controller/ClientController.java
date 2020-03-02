package kp.com.invoice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kp.com.invoice.dao.ClientDao;
import kp.com.invoice.entity.Client;
import kp.com.invoice.service.ClientService;

@RestController
@RequestMapping(path="/app/client")
public class ClientController {
	
	@Autowired
	ClientService service;
	
	@GetMapping  // list all clients
	public Page<Client> getClients(
			@RequestParam(name = "pageNo", defaultValue = "0") Integer pageNo,
			@RequestParam(name = "pageSize", defaultValue = "5") Integer pageSize) {
		return service.getClients(pageNo,pageSize);
	}
	
	@GetMapping(path="/{id}") // get one client 
	public Client getClient(@PathVariable Long id) {
		return service.getClient(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/add") // add new client
	public void addClient(@RequestBody ClientDao client) {
		service.addClient(client);
	}
	
	@DeleteMapping(path = "/delete/{id}")
    public void delClient(@PathVariable Long id) {
		service.deleteClient(id);
	}
}
