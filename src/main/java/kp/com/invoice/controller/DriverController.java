package kp.com.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kp.com.invoice.dao.DriverDao;
import kp.com.invoice.entity.Driver;
import kp.com.invoice.service.DriverService;

@RestController
@RequestMapping(path="/app/driver")
public class DriverController {
	
	@Autowired 
	DriverService service;
	
	@GetMapping  // list all drivers
	public Page<Driver> getDrivers(
			@RequestParam(name = "pageNo", defaultValue = "0") Integer pageNo,
			@RequestParam(name = "pageSize", defaultValue = "5") Integer pageSize) {
		return service.getDrivers(pageNo, pageSize);
	}
	
	@GetMapping(path="/{id}") // get one driver 
	public Driver getDriver(@PathVariable Long id) {
		return service.getDriver(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/add") // add new driver
	public void addDriver(@RequestBody DriverDao driver) {
		service.addDriver(driver);
	}
	
	@DeleteMapping(path = "/delete/{id}")
    public void delDriver(@PathVariable Long id) {
		service.deleteDriver(id);
	}

}
