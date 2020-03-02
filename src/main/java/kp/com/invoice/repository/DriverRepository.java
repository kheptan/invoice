package kp.com.invoice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import kp.com.invoice.entity.Driver;

public interface DriverRepository extends PagingAndSortingRepository<Driver, Long> {

}
