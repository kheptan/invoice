package kp.com.invoice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import kp.com.invoice.entity.Invoice;

public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {
	
	
	
}
