package com.abc.onlinestore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.onlinestore.entity.ElectronicDetails;
import com.abc.onlinestore.service.ElectronicService;

@RestController
public class ElectronicRestController {
	@Autowired
	ElectronicService es;
	
	@GetMapping("/ElectronicDetails")
	public List<ElectronicDetails> electronicServiceDetails(){
		return es.getallElectronicDetails();
	}
	
	@PostMapping("/ElectronicDetailsSave")
	public String saveElectronicDetails(@RequestBody ElectronicDetails ed) {
		boolean status =es.updateElectronicDetails(ed);
		return status == true?"data updated":"please do again! Electronic data is not updated";
	}
	
	
}
