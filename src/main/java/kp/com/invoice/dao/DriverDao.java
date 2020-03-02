package kp.com.invoice.dao;


public class DriverDao {

	
	private String name;
	
	private String carNumber;

	public DriverDao(String name, String carNumber) {
		this.name = name;
		this.carNumber = carNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
}
