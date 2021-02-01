package com.happiestminds.hardwareapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@Table(name = "user_details")
@Entity
@NoArgsConstructor
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name="first_name")
	private String firstName;
	
	private int designation;

	@Column(name = "email_address")
	private String emailAddress;
	
	private String address;
	
	@Column(name = "user_password")
	private String userPassword;
	
	@Column(name="manager")
	private int manager;
	
}







