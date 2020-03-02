package kp.com.invoice.dao;

import java.util.Date;
import java.util.Set;

import kp.com.invoice.entity.Client;
import kp.com.invoice.entity.Driver;
import kp.com.invoice.entity.LineItem;
import kp.com.invoice.entity.Payment;
import kp.com.invoice.entity.Seller;

public class InvoiceDao {
	
	private String invoiceNumber;
	private Date date;
	private Payment status;
	private Client client;
	private Driver driver;
	private Seller seller;
	private Set<LineItem> items;
	
	public InvoiceDao() {
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Payment getStatus() {
		return status;
	}

	public void setStatus(Payment status) {
		this.status = status;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Set<LineItem> getItems() {
		return items;
	}

	public void setItems(Set<LineItem> items) {
		this.items = items;
	}
	
}
