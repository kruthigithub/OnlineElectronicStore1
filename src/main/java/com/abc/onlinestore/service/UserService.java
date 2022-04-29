package com.abc.onlinestore.service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

import com.abc.onlinestore.entity.UserDetails;
//import com.abc.onlinestore.repository.UserDetailsRepository;

public interface UserService {
	
	
	public String login(String userName,String password);

	public List<UserDetails> getallUserDetails();
	public boolean insertUser(UserDetails a);

}
