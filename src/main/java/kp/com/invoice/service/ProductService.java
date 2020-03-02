package kp.com.invoice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kp.com.invoice.dao.ProductDao;
import kp.com.invoice.entity.Product;
import kp.com.invoice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public void addProduct(ProductDao data) {
		Product product = new Product();
		product.setName(data.getName());
		product.setPrice(data.getPrice());
		product.setVat(data.getVat());
		
		repo.save(product);
	}
	
	public Page<Product> getProducts(Integer pageNo, Integer pageSize){
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return repo.findAll(pageable);
	}
	
	public Product getProduct(Long id){
		Optional<Product> product = repo.findById(id); 
		return (product.isPresent()) ? product.get() : null;
	}
	
	public void deleteProduct(Long id) {
		repo.deleteById(id);
	}
	
}
