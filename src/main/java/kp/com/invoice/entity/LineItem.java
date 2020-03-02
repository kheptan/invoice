package kp.com.invoice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class LineItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
	private Product product;
	
	@NotNull
	private Integer quantity;
	
	private Double price;

	private Integer vat;
	
	private Double value;
	
	public LineItem() {}

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

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void calcValue() {
		Double percentage = (this.vat / 100.0);
		Double lineValue = this.price * this.quantity;
		Double vatValue = lineValue * percentage; 
		Double totalValue = lineValue + vatValue;
		setValue(totalValue);
	}

	public Long getId() {
		return id;
	}
	
}
