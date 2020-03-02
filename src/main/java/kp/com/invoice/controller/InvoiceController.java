 package kp.com.invoice.controller;

import java.util.List;

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

import kp.com.invoice.dao.InvoiceDao;
import kp.com.invoice.entity.Invoice;
import kp.com.invoice.service.InvoiceService;

@RestController
@RequestMapping(path="/app/invoice")
public class InvoiceController {
	
	@Autowired
	InvoiceService service;
	
	@GetMapping  // list all invoices
	public Page<Invoice> getInvoices(
			@RequestParam(name = "pageNr", defaultValue = "0") Integer pageNo,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
		return service.getInvoices(pageNo, pageSize);
	}
	
	@GetMapping(path="/{id}") // get one invoice 
	public Invoice getInvoice(@PathVariable Long id) {
		return service.getInvoice(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/add") // add new invoice
	public void addInvoice(@RequestBody InvoiceDao invoice) {
		service.addInvoice(invoice);
	}
	
	@DeleteMapping(path = "/delete/{id}")
    public void delInvoice(@PathVariable Long id) {
		service.deleteInvoice(id);
	}

}
