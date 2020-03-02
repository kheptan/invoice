package kp.com.invoice.controller;

import java.util.List;
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
import kp.com.invoice.dao.ProductDao;
import kp.com.invoice.entity.Product;
import kp.com.invoice.service.ProductService;

@RestController
@RequestMapping(path="/app/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping  // list all products
	public Page<Product> getProducts(
			@RequestParam(name = "pageNr", defaultValue = "0") Integer pageNo,
			@RequestParam(name = "pageSize", defaultValue = "5") Integer pageSize) {
		return service.getProducts(pageNo, pageSize);
	}
	
	@GetMapping(path="/{id}") // get one product 
	public Product getProduct(@PathVariable Long id) {
		return service.getProduct(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/add") // add new product
	public void addProduct(@RequestBody ProductDao product) {
		service.addProduct(product);
	}
	
	@DeleteMapping(path = "/delete/{id}")
    public void delProduct(@PathVariable Long id) {
		service.deleteProduct(id);
	}
}
