package kp.com.invoice.dao;

public class ProductDao {
	
	private String name;
	
	private Double price;
	
	private Integer vat;

	public ProductDao(String name, Double price, Integer vat) {
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
	
	
}
