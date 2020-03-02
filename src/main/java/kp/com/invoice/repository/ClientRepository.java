package kp.com.invoice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import kp.com.invoice.entity.Client;

public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {
	
	
}
