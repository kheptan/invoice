package kp.com.invoice.entity;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;


@Embeddable
public class Address {
		
	@NotNull
	String  city;
	
	@NotNull
	String streetName;
	
	@NotNull
	Integer streetNumber;
	
	String postalCode;
	
	
	public Address() {}
	
	
	public Address(@NotNull String streetName, @NotNull Integer streetNumber, 
			String postalCode) {
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.postalCode = postalCode;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public Integer getStreetNumber() {
		return streetNumber;
	}


	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
