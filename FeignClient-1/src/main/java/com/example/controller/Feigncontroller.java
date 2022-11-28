package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.utility.Feignservice;

import lombok.extern.slf4j.Slf4j;
@Slf4j

@RestController
//@RequestMapping("/alternative")
public class Feigncontroller {
	 private static Logger log = LoggerFactory.getLogger(Feigncontroller.class);
		@Autowired
		private Feignservice feignservice;
		
		@GetMapping("/feigndefault")
		public String defaultValues() {
			log.info("Getting inside function");
			return feignservice.getMessage();
		}
		
		@GetMapping("/gohere")
		public String helloMessage() {
			return "Hello world";
		}
}	
