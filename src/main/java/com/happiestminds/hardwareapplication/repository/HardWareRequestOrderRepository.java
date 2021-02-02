package com.happiestminds.hardwareapplication.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.happiestminds.hardwareapplication.model.HardwareRequestOrder;

@Repository
public interface HardWareRequestOrderRepository extends JpaRepository<HardwareRequestOrder, Integer> {

	@Query(value = "SELECT * FROM hw_request_order where creation_date >=:createdDate AND modified_date <=:modifiedDate", nativeQuery = true)
	List<HardwareRequestOrder> findStatusDetailsByDate(Date createdDate,Date modifiedDate);

}
