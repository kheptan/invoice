package kp.com.invoice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private Double price;
	
	private Integer vat;
	
	public Product() {}

	public Product(@NotNull String name, @NotNull Double price, Integer vat) {
		super();
		this.name = name;
		this.price = price;
		this.vat = vat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getVat() {
		return vat;
	}

	public void setVat(Integer vat) {
		this.vat = vat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
