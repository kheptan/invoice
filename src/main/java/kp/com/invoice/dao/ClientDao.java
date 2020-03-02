package kp.com.invoice.dao;


import kp.com.invoice.entity.Address;
import kp.com.invoice.entity.BankAccount;

public class ClientDao {
	
	private String name;
	
	private BankAccount account;
	
	private Address address;
	
	private String fiscalCode;
	
	private String email;
	
	private Long phone;

	public ClientDao(String name, BankAccount account, 
			Address address, String fiscalCode,
			String email, Long phone) {
		this.name = name;
		this.account = account;
		this.address = address;
		this.fiscalCode = fiscalCode;
		this.email = email;
		this.phone = phone;
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
	
	


}
