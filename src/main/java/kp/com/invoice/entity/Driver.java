package kp.com.invoice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String carNumber;

	public Driver(@NotNull String name, @NotNull String carNumber) {
		this.name = name;
		this.carNumber = carNumber;
	}

	public Driver() {
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

	public Long getId() {
		return id;
	}

}
