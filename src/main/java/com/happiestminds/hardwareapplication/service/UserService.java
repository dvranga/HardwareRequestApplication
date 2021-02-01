package com.happiestminds.hardwareapplication.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.happiestminds.hardwareapplication.dto.RegistrationDTO;
import com.happiestminds.hardwareapplication.model.UserDetails;
import com.happiestminds.hardwareapplication.repository.UserRepository;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private UserRepository userRepository;
//	
//	@Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDetails register(@Valid RegistrationDTO registration) {
		UserDetails userDetails= new UserDetails();
		BeanUtils.copyProperties(registration, userDetails);
//        userDetails.setUserPassword(bCryptPasswordEncoder.encode(userDetails.getUserPassword()));
		return userRepository.save(userDetails);
	}
	
	
}
