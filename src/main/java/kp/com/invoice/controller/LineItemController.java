package kp.com.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kp.com.invoice.dao.LineItemDao;
import kp.com.invoice.entity.LineItem;
import kp.com.invoice.service.LineItemService;

@RestController
@RequestMapping(path="/app/invoice/lineitem")
public class LineItemController {
	
	@Autowired
	LineItemService service;
	
	@GetMapping  // list all lines
	public List<LineItem> getLines() {
		return service.getLines();
	}
	
	@GetMapping(path="/{id}") // get one line 
	public LineItem getLine(@PathVariable Long id) {
		return null;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/add") // add new line
	public void addLine(@RequestBody LineItemDao line) {
		service.addLine(line);
	}
	
	@DeleteMapping(path = "/delete/{id}")
    public void delLine(@PathVariable Long id) {
		service.deleteLine(id);
	}

}
