package com.happiestminds.hardwareapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happiestminds.hardwareapplication.model.HardwareRequestOrder;

@Repository
public interface HardWareRequestOrderRepository extends JpaRepository<HardwareRequestOrder, Integer> {

}
