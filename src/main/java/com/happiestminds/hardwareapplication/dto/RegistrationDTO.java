package com.happiestminds.hardwareapplication.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class RegistrationDTO {
	
	@NotEmpty(message = "UserName can't be null ")
	@Pattern(regexp = "^(?=[a-zA-Z0-9.@_]{6,20}$)(?!.*[_.]{2})[^_.].*[^_.]$", message = "Invalid UserName")	
	public String userName;
	
	@NotEmpty(message = "FirstName can't be null ")
	public String firstName;
	
	public int designation;
	
	@NotEmpty(message = "Email can't be null ")
	@Pattern(regexp = "^([a-z0-9]+[-._+]?[a-z0-9]+)+@[a-z0-9-]+.[a-z]{2,3}.[a-z]{2,3}$", message = "Invalid Email")
	public String emailAddress;
	
	@NotEmpty(message = "UserName can't be null ")
	public String address;
	
	@Pattern(regexp = "^(?=.*[@#$%^&+=])(?=.*[0-9])(?=.*[A-Z]).{8,}$", message = "Invalid Pattern")
	@NotEmpty(message = "Password can't be null ")
	public String userPassword;
	
	public int manager;
	
}
