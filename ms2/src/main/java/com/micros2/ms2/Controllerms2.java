package com.micros2.ms2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@Controller
public class Controllerms2
{
	//@Autowired
	//private RestTemplate rest;
	RestTemplate rest = new RestTemplate();
	
	@RequestMapping("/login")
	public String home()
	{
		return "login";
	}
	
	
	
	
	@RequestMapping("/processform1")
	public String verifyusr(User user) 
	{
		 String tempusr = rest.postForObject("http://localhost:9090/verifyuser1", user, String.class);
		 System.out.println(user.getPswd());
		 System.out.println(tempusr);
		 if(user.getPswd().equals(tempusr))
		 {
			 return "successfullogin";
			 
		 }
		 
		 return "Failed";
	}
	
	
	
	
	@RequestMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	
	
	@RequestMapping("/signupuser")
	public String signupuser(User user)
	{
		String temp=null;
		
		
		temp=rest.postForObject("http://localhost:9090/signup", user, String.class);
		
		System.out.println(temp);
		return "success";
	}
	
	
	
}
