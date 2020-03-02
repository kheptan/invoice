package kp.com.invoice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kp.com.invoice.entity.Seller;

public interface SellerRepository extends CrudRepository<Seller, Long> {
	
	List<Seller> findAll();

}
