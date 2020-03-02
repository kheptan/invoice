package kp.com.invoice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kp.com.invoice.dao.DriverDao;
import kp.com.invoice.entity.Driver;
import kp.com.invoice.repository.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	DriverRepository repo;
	
	public void addDriver(DriverDao data) {
		Driver driver = new Driver();
		driver.setName(data.getName());
		driver.setCarNumber(data.getCarNumber());
		repo.save(driver);
	}
	
	public Page<Driver> getDrivers(Integer pageNo, Integer pageSize){
		Pageable pageable = PageRequest.of(pageNo, pageSize);	
		return repo.findAll(pageable);
	}
	
	public Driver getDriver(Long id) {
		Optional<Driver> driver = repo.findById(id);
		return (driver.isPresent()) ? driver.get() : null;
	}
	
	public void deleteDriver(Long id) {
		repo.deleteById(id);
	}
}
