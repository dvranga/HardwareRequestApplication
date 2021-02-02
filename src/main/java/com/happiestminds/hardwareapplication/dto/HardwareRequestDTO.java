package com.happiestminds.hardwareapplication.dto;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class HardwareRequestDTO {
	
	@NotEmpty(message = "create date can't be null ")
	public Date createDate;// To Identify Complete User registration Information

	@NotEmpty(message = "modified date can't be null ")
	public Date modifiedDate;
}



