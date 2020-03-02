package kp.com.invoice.dao;

import kp.com.invoice.entity.Invoice;
import kp.com.invoice.entity.Product;

public class LineItemDao {
	private Invoice invoice;
	private Product product;
	private Integer quantity;
	private Double price;
	private Integer vat;
	private Double value;
	
	public LineItemDao(Invoice invoice, 
			Product product, Double price, Integer quantity, Integer vat) {
		this.invoice = invoice;
		this.product = product;
		this.quantity = quantity;
		this.vat = vat;
		this.price = price;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getVat() {
		return vat;
	}

	public void setVat(Integer vat) {
		this.vat = vat;
	}


	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	
	
}
