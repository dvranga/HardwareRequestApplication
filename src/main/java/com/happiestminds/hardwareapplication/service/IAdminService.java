package com.happiestminds.hardwareapplication.service;

import java.util.Map;

import com.happiestminds.hardwareapplication.dto.HardwareRequestDTO;


public interface IAdminService {

	Map<String, Long> getStatusDetails();

	Map<String, Long> getStatusDetailsByDate(HardwareRequestDTO hardwareRequestDTO);

}
