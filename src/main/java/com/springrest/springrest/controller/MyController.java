package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.load;
import com.springrest.springrest.services.Loadservices;

@RestController
public class MyController {
	
	
	
	@Autowired
	private  Loadservices loadServices;
	
	
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome To load Application" ;
		 
	}
	//get the load
	@GetMapping("/load")
	public List<load> getLoads()
	{
		return this.loadServices.getLoads();
		
		
	}
	@GetMapping(path="/load/{shipperId}")
	public load getLoad(@PathVariable String shipperId) {
		return this.loadServices.getLoad(Long.parseLong(shipperId));
	}
    @PostMapping(path="/load/{shipperId}")
	public load addLoad(@RequestBody load load)
	{
		return this.loadServices.addLoad(load);
		
		
	}
    @PutMapping("/load/{shipperId}")
    public  load updateLoad(@RequestBody load load) {
    	return this.loadServices.upateLoad(load);
    	
    	
    	
    }@DeleteMapping("/load/{shipperId}")
    public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String shipperId){
    	try {
    		this.loadServices.deleteLoad(Long.parseLong(shipperId));
    		return new ResponseEntity<>(HttpStatus.OK);
    	}catch(Exception e) {
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
		    }
}
