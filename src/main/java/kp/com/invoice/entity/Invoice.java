package kp.com.invoice.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String invoiceNumber;
	
	@NotNull
	private Date date;
	
	private Payment status;
	
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Driver driver;
	
	@OneToOne
	@JoinColumn(name="seller_id")
	private Seller seller;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "invoice_id")
	private Set<LineItem> lineItem = new HashSet<LineItem>();


	public Invoice() {}

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

	public Set<LineItem> getLineItem() {
		return lineItem;
	}

	public void setLineItems(Set<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLineItem(Set<LineItem> lineItem) {
		this.lineItem = lineItem;
	}
	
	
		
}
