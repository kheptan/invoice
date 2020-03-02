package kp.com.invoice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kp.com.invoice.entity.LineItem;

public interface LineItemRepository extends CrudRepository<LineItem, Long> {

	List<LineItem> findAll();
}
