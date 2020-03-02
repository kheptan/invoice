package kp.com.invoice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kp.com.invoice.dao.ClientDao;
import kp.com.invoice.entity.Client;
import kp.com.invoice.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository repository;
	
	public void addClient(ClientDao data) {
		
		Client client = new Client();
		
		client.setName(data.getName());
		client.setFiscalCode(data.getFiscalCode());
		client.setAddress(data.getAddress());
		client.setAccount(data.getAccount());
		client.setEmail(data.getEmail());
		client.setPhone(data.getPhone());
		
		repository.save(client);
	}
	
	public Client getClient(Long id) {
		Optional<Client> client = repository.findById(id);
		return (client.isPresent()) ? client.get() : null;
	}
	
	public Page<Client> getClients(Integer pageNo, Integer pageSize){
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return repository.findAll(pageable);
	}
	
	public void deleteClient(Long id) {
		repository.deleteById(id);
	}
}
