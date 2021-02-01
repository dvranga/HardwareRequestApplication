package com.happiestminds.hardwareapplication.service;

import javax.validation.Valid;

import com.happiestminds.hardwareapplication.dto.RegistrationDTO;
import com.happiestminds.hardwareapplication.model.UserDetails;

public interface IUserService {

	UserDetails register(@Valid RegistrationDTO registration);

}
