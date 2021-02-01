package com.happiestminds.hardwareapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happiestminds.hardwareapplication.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer>{

}
