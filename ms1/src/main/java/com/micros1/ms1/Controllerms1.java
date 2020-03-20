package com.micros1.ms1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerms1
{
	
	@Autowired
	UserRepo usr;
	
	
	/*
	@RequestMapping("verifyuser")
	public Iterable<User> Verifyuser(User user)
	{
		//return usr.findById(user.getUname());
		//return user;
		return usr.findAll();
		//sSystem.out.println(usr.findById(user.getUname()));
		//return usr.findById(user.getUname());
		//return usr.findAllById(user.getUname());
	}*/
	
	
	@RequestMapping("verifyuser1")
	public String verifyuser(@RequestBody User user)
	{
		
		if(usr.existsById(user.getUname()))
		{
			 String val =(usr.findById(user.getUname())).get().getPswd();
			 		 
			 System.out.println(val);
			 return val;
				
		}
		else
			return "user does not exist";
	
	}

	@RequestMapping("/signup")
	public String adduser(@RequestBody User user)
	{
		
		System.out.println(user);
		usr.save(user);
		return "hello "+user.getUname()	;
	}
	
	
	
}
