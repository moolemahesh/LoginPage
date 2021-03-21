package com.mahi.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogController {
	
	@RequestMapping(value="/log", method= RequestMethod.GET)
	public String showlog() {
		return "logpage";
	}	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String showlogg(@RequestParam String maj , @RequestParam String upass) {
		
		String status ="";
		if(maj.equals("mahi") && upass.equals("mahi")) {
			status= "success";
		}
		else {
			status=  "failure";
		}	
		return status;
	}

}
