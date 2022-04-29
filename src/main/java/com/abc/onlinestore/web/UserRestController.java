package com.abc.onlinestore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.onlinestore.entity.ElectronicDetails;
import com.abc.onlinestore.entity.UserDetails;
import com.abc.onlinestore.service.ElectronicService;
import com.abc.onlinestore.service.UserService;

@RestController
//@RequestMapping("online")
public class UserRestController {
	
	@Autowired
	UserService User;
	
	
	 
	@GetMapping("/home")
	 public String gethomePage() {
		return "Welcome to electronic stores";
		 
	 }
	@GetMapping("/Userdetails")
	public List<UserDetails> dothis() {
		return User.getallUserDetails();
	}
	
	@PostMapping("/UserDetailsSave")
	public String saveUserDetails(@RequestBody UserDetails u) {
		boolean status= User.insertUser(u);
		
		return status==true?"Details Saved":"please fill the details";
		
	}
	

}
