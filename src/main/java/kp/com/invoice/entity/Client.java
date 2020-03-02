package kp.com.invoice.entity;
import javax.persistence.Entity;

@Entity
public class Client extends Company{
	
	/**
	
	@OneToMany(mappedBy = "client",
	        orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Invoice> invoice = new ArrayList<>();

	public List<Invoice> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<Invoice> invoice) {
		this.invoice = invoice;
	}
	*/
	
	
}
