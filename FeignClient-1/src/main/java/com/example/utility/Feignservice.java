package com.example.utility;

import java.util.List;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import com.example.demo.Employee;

@FeignClient(value="FeignDemo",url="http://localhost:8080/")
public interface Feignservice {
	@GetMapping("defaultvalues")
	public String getMessage();
	
}
