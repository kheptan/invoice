package kp.com.invoice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kp.com.invoice.dao.SellerDao;
import kp.com.invoice.entity.Seller;
import kp.com.invoice.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	SellerRepository repo;
	
	public void addSeller(SellerDao data) {
		Seller seller = new Seller();
		seller.setName(data.getName());
		seller.setFiscalCode(data.getFiscalCode());
		seller.setAccount(data.getAccount());
		seller.setAddress(data.getAddress());
		seller.setEmail(data.getEmail());
		seller.setPhone(data.getPhone());
		
		repo.save(seller);
	}
	
	public Seller getSeller(Long id) {
		Optional<Seller> seller =  repo.findById(id);
		return (seller.isPresent()) ? seller.get() : null;
	}
	
	public void deleteSeller(Long id) {
		repo.deleteById(id);
	}

	public List<Seller> getSellers() {
		return repo.findAll();
	}

}
