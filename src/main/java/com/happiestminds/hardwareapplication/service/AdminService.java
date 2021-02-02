package com.happiestminds.hardwareapplication.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happiestminds.hardwareapplication.dto.HardwareRequestDTO;
import com.happiestminds.hardwareapplication.model.HardwareRequestOrder;
import com.happiestminds.hardwareapplication.repository.HardWareRequestOrderRepository;

@Service
public class AdminService implements IAdminService {
	
	Map<String, Long> requestDetails= new HashMap<>();

	@Autowired
	private HardWareRequestOrderRepository hardWareRequestRepository;
	
	@Override
	public Map<String, Long> getStatusDetails() {
		List<HardwareRequestOrder> findAll = hardWareRequestRepository.findAll();
		long approved = findAll.stream().filter(request -> request.status.equalsIgnoreCase("Approved")).count();
		long rejected = findAll.stream().filter(request -> request.status.equalsIgnoreCase("Rejected")).count();
		long submitted = findAll.stream().filter(request -> request.status.equalsIgnoreCase("Submitted")).count();
		requestDetails.put("approved", approved);
		requestDetails.put("rejected", rejected);
		requestDetails.put("submitted", submitted);
		return requestDetails;
	}

	@Override
	public Map<String, Long> getStatusDetailsByDate(HardwareRequestDTO hardwareRequestDTO) {
		
		List<HardwareRequestOrder> findAll = hardWareRequestRepository.findStatusDetailsByDate(hardwareRequestDTO.createDate, hardwareRequestDTO.modifiedDate);
		long approved = findAll.stream().filter(request -> request.status.equalsIgnoreCase("Approved")).count();
		long rejected = findAll.stream().filter(request -> request.status.equalsIgnoreCase("Rejected")).count();
		long submitted = findAll.stream().filter(request -> request.status.equalsIgnoreCase("Submitted")).count();
		requestDetails.put("approved", approved);
		requestDetails.put("rejected", rejected);
		requestDetails.put("submitted", submitted);
		return requestDetails;
	}

}









