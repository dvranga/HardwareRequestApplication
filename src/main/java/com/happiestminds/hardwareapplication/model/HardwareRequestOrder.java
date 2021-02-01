package com.happiestminds.hardwareapplication.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.ToString;

@Entity
@Table(name = "hw_request_order")
@ToString
public class HardwareRequestOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	@Column(name = "ami_id")
	public int amiId;
	
	@Column(name = "user_id")
	public int userId;
	
	@Column(name = "instance_id")
	public int instanceId;
	
	@Column(name = "user_data")
	public String userData;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date")
	public Date createDate;// To Identify Complete User registration Information

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_date")
	public Date modifiedDate;// To Identify Complete User registration Information
	
	public String status;

}
