package com.abc.onlinestore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.onlinestore.entity.UserDetails;
import com.abc.onlinestore.repository.UserDetailsRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDetailsRepository udr;
	
	@Override
	public String login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetails> getallUserDetails() {
		// TODO Auto-generated method stub
		return udr.findAll();
	}

	@Override
	public boolean insertUser(UserDetails a) {
		// TODO Auto-generated method stub
		UserDetails obj = udr.save(a);
		
		return obj!=null?true:false;
	}
	

}
