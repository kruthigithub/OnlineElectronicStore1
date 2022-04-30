package com.abc.onlinestore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.onlinestore.entity.ElectronicDetails;
import com.abc.onlinestore.repository.ElectronicDetailsRepository;
@Service
public class ElectronicServiceImpl implements ElectronicService{
	@Autowired
	ElectronicDetailsRepository edr;
	
	
	@Override
	public List<ElectronicDetails> getallElectronicDetails() {
		// TODO Auto-generated method stub
		return edr.findAll();
	}
	@Override
	public boolean updateElectronicDetails(ElectronicDetails ed) {
		ElectronicDetails obj = edr.save(ed);
		
		return obj!=null?true:false ;
		
	}
}
