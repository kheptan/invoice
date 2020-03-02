package kp.com.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kp.com.invoice.controller.LineItemController;
import kp.com.invoice.dao.LineItemDao;
import kp.com.invoice.entity.LineItem;
import kp.com.invoice.entity.Product;
import kp.com.invoice.repository.LineItemRepository;

@Service
public class LineItemService {
	
	@Autowired
	LineItemRepository repo;
	
	@Autowired
	ProductService productService;
	
	public void addLine(LineItemDao data) {
		LineItem line = new LineItem();
		Product product = productService.getProduct(data.getProduct().getId());
		line.setProduct(product);
		line.setQuantity(data.getQuantity());
		line.setVat(data.getVat());
		line.setValue(data.getValue());
		
		repo.save(line);
	}

	public List<LineItem> getLines() {
		return repo.findAll();
	}
	
	public void deleteLine(Long id) {
		repo.deleteById(id);
	}
	

}
