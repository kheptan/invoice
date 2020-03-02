package kp.com.invoice.entity;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class Company {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	
	@Embedded
	private BankAccount account;
	
	@Embedded
	private Address address;
	
	private String fiscalCode;
	
	private String email;
	
	private Long phone;

	public Company(@NotNull String name, Address address,
			BankAccount account, String fiscalCode, String email,
			Long phone) {
		this.name = name;
		this.account = account;
		this.address = address;
		this.fiscalCode = fiscalCode;
		this.email = email;
		this.phone = phone;
	}
	
	public Company() {};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}	
	
	
	
}
