package com.happiestminds.hardwareapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@ToString
public class HardwareapplicationApplication {

	public static void main(String[] args) {
		log.info("Spring Application Started");
		ConfigurableApplicationContext context = SpringApplication.run(HardwareapplicationApplication.class, args);
		log.info(context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
