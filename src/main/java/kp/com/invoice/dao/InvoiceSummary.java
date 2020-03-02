package kp.com.invoice.dao;

public class InvoiceSummary {
	Integer totalProducts;
	Double invoiceTotalValue;
	
	public InvoiceSummary(Integer totalProducts, Double invoiceTotalValue) {
		super();
		this.totalProducts = totalProducts;
		this.invoiceTotalValue = invoiceTotalValue;
	}

	public Integer getTotalProducts() {
		return totalProducts;
	}

	public void setTotalProducts(Integer totalProducts) {
		this.totalProducts = totalProducts;
	}

	public Double getInvoiceTotalValue() {
		return invoiceTotalValue;
	}

	public void setInvoiceTotalValue(Double invoiceTotalValue) {
		this.invoiceTotalValue = invoiceTotalValue;
	}
	
	

}
