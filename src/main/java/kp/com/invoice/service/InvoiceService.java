package kp.com.invoice.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kp.com.invoice.dao.InvoiceDao;
import kp.com.invoice.entity.Invoice;
import kp.com.invoice.entity.LineItem;
import kp.com.invoice.entity.Product;
import kp.com.invoice.repository.InvoiceRepository;

@Service
public class InvoiceService {
	
	@Autowired
	InvoiceRepository repo;
	
	
	@Autowired
	ProductService prodService;
	
	public Page<Invoice> getInvoices(Integer pageNo, Integer pageSize){
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return repo.findAll(pageable);
	}
	
	public Invoice getInvoice(Long id) {
		Optional<Invoice> invoice = repo.findById(id);
		return (invoice.isPresent()) ? invoice.get() : null;
	}
	
	public void addInvoice(InvoiceDao data) {
		
		Invoice invoice = new Invoice();
		
		invoice.setClient(data.getClient());
		invoice.setDriver(data.getDriver());
		invoice.setSeller(data.getSeller());
		
		Set<LineItem> lines = new HashSet<LineItem>();
		
		System.out.println(data.getItems().size());
		
		data.getItems().stream().forEach(line->{
			Product p = prodService.getProduct(line.getProduct().getId());
			LineItem lineItem = line;
			lineItem.setProduct(p);
			lineItem.setQuantity(line.getQuantity());
			lineItem.setVat(p.getVat());
			lineItem.setPrice(p.getPrice());
			lineItem.calcValue();
			lines.add(lineItem);
		});
		
		invoice.setInvoiceNumber(data.getInvoiceNumber());
		invoice.setDate(data.getDate());
		invoice.setLineItems(lines);
		invoice.setStatus(data.getStatus());
		
		repo.save(invoice);
	}
	
	public void deleteInvoice(Long id) {
		repo.deleteById(id);
	}

}
