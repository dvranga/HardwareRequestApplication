package com.happiestminds.hardwareapplication.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happiestminds.hardwareapplication.dto.ResponseDTO;
import com.happiestminds.hardwareapplication.model.HardwareRequestOrder;
import com.happiestminds.hardwareapplication.service.IAdminService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hardwareapplication")
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class AdminController {

	@Autowired
	private IAdminService adminService;
	
	@GetMapping("/status/details")
	@ApiOperation("status Details")
	public ResponseEntity<ResponseDTO> getStatusDetails(){
		Map<String, Long> statusDetails = adminService.getStatusDetails();
		return new ResponseEntity<ResponseDTO>(new ResponseDTO(200, "Successfull", statusDetails), HttpStatus.OK);
	}
}
