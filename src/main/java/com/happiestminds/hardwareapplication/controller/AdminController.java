package com.happiestminds.hardwareapplication.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happiestminds.hardwareapplication.dto.HardwareRequestDTO;
import com.happiestminds.hardwareapplication.dto.ResponseDTO;
import com.happiestminds.hardwareapplication.service.IAdminService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/hardwareapplication")
@CrossOrigin(allowedHeaders = "*",origins = "*")
@Slf4j
public class AdminController {

	@Autowired
	private IAdminService adminService;
	
	@GetMapping("/status/details")
	@ApiOperation("status Details")
	public ResponseEntity<ResponseDTO> getStatusDetails(){
		Map<String, Long> statusDetails = adminService.getStatusDetails();
		if (statusDetails.isEmpty()) {
			log.error("Status Details are Empty");
			return new ResponseEntity<ResponseDTO>(new ResponseDTO(400, "Status Details are Empty"),HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<ResponseDTO>(new ResponseDTO(200, "Successfull", statusDetails), HttpStatus.OK);
	}
	
	@PostMapping("/status/bydate")
	@ApiOperation("Status Details By Date")
	public ResponseEntity<ResponseDTO> getStatusDetailsByDate(@RequestBody HardwareRequestDTO hardwareRequestDTO){
		log.debug("HardwareRequestDTO "+hardwareRequestDTO.toString());
		Map<String, Long> statusDetails = adminService.getStatusDetailsByDate(hardwareRequestDTO);
		if (statusDetails.isEmpty()) {
			log.error("Status Details are Empty");
			return new ResponseEntity<ResponseDTO>(new ResponseDTO(400, "Status Details are Empty"),HttpStatus.BAD_REQUEST);
		}
		log.debug("Status details"+statusDetails);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO(200, "Succesfull", statusDetails),HttpStatus.OK);
	}
	
}




