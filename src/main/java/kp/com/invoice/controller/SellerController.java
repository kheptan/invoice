package kp.com.invoice.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kp.com.invoice.dao.SellerDao;
import kp.com.invoice.entity.Seller;
import kp.com.invoice.service.SellerService;

@RestController
@RequestMapping(path="/app/seller")
public class SellerController {
	
	@Autowired
	SellerService service;
	
	@GetMapping
	public List<Seller> getSellers() {
		return service.getSellers();
	}
	
	@GetMapping(path="/{id}") // get seller 
	public Seller getSeller(@PathVariable Long id) {
		return service.getSeller(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/add") // add new seller
	public void addSeller(@RequestBody SellerDao seller) {
		service.addSeller(seller);
	}
	
	@DeleteMapping(path = "/delete/{id}")
    public void delSeller(@PathVariable Long id) {
		service.deleteSeller(id);
	}

}
