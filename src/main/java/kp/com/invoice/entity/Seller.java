package kp.com.invoice.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Seller extends Company {

	public Seller(@NotNull String name, Address address,
			BankAccount account, String fiscalCode, String email,
			Long phone) {
		super(name, address, account, fiscalCode, email, phone);
	}
	
	public Seller() {
		super();
	}
	

}
