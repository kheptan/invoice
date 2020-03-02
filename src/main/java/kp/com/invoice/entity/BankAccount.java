package kp.com.invoice.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BankAccount {
	@Column(name = "bank_name")
	private String bank;
	
	@Column(name="bank_account")
	private String accountNumber;
	
	@Column(name = "bank_account_type")
	private String accountType;

	public BankAccount(String bank, String accountNumber, String accountType) {
		this.bank = bank;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	} 
	
	public BankAccount() {}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
	
}
