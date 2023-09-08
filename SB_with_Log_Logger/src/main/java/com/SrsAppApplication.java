package com;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SrsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrsAppApplication.class, args);
		System.out.println("Spring-Boot with Logger Info running on port No: 8585...");
	}
	
	/*
	 * Steps: 
	 * 		Add=> 1) private static final Logger LOGGER = LoggerFactory.getLogger(User_Controller.class); 
	 * 			  in Controller, 
	 * 			  2) import org.slf4j.Logger;
	 *				 import org.slf4j.LoggerFactory;
	 *			  3) Apply Logger in Controller methods.
	 */

}
