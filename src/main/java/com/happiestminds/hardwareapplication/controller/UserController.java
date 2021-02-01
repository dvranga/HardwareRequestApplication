package com.happiestminds.hardwareapplication.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happiestminds.hardwareapplication.dto.RegistrationDTO;
import com.happiestminds.hardwareapplication.dto.ResponseDTO;
import com.happiestminds.hardwareapplication.model.UserDetails;
import com.happiestminds.hardwareapplication.service.IUserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hardwareapplication")
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@ApiOperation("User Registration")
	@PostMapping("user/register")
	public ResponseEntity<ResponseDTO> register(@Valid @RequestBody RegistrationDTO registration){
		UserDetails register = userService.register(registration);
		if(register!=null) {
			return new ResponseEntity<>(new ResponseDTO(200, "Your account has been successfully created", register),
					HttpStatus.OK);
	        }
		 return new ResponseEntity<>(new ResponseDTO(400,"Account creation failed"), HttpStatus.NOT_ACCEPTABLE);
	}
	
}
