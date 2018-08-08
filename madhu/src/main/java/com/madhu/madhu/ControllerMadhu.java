package com.madhu.madhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMadhu {
    
	@Autowired
	private ServiceMadhu service;
	
	@PostMapping("/save")
	public void save(@RequestBody Combined combo) {
		System.out.println(combo.getPipe().getPipeName()+"=================================================");
		service.save(combo);
	}
	
}
