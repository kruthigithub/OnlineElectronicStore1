package com.abc.onlinestore.service;

import java.util.List;

import com.abc.onlinestore.entity.ElectronicDetails;

public interface ElectronicService {
	public List<ElectronicDetails> getallElectronicDetails();
	
	public boolean updateElectronicDetails(ElectronicDetails el);
}
