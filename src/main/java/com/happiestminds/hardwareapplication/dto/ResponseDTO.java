package com.happiestminds.hardwareapplication.dto;

import java.util.List;
import java.util.Map;

import com.happiestminds.hardwareapplication.model.HardwareRequestOrder;
import com.happiestminds.hardwareapplication.model.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDTO {

	private String message;
	private Object data;
	private int statusCode;
	
	public ResponseDTO(int statusCode, String message, Map<String, Long> statusDetails) {
		this.message = message;
		this.data = statusDetails;
		this.statusCode = statusCode;
	}

	public ResponseDTO(int statusCode, String message) {
		this.message = message;
		this.statusCode = statusCode;
	}

	public ResponseDTO(int statusCode, String message, UserDetails statusDetails) {
		this.message = message;
		this.data = statusDetails;
		this.statusCode = statusCode;
	}

	public ResponseDTO(int statusCode, String message, List<String> errMessage) {
		this.message = message;
		this.data = errMessage;
		this.statusCode = statusCode;
	}

}
