package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = {"com.example.demo","com.example.controller","com.example.utility"})
@SpringBootApplication
@EnableFeignClients
public class FeignClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignClient1Application.class, args);
	}

}
