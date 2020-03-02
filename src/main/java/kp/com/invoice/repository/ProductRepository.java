package kp.com.invoice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import kp.com.invoice.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}
