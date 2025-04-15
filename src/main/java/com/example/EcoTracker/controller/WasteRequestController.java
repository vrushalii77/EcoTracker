package com.example.EcoTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcoTracker.model.WasteRequest;
import com.example.EcoTracker.service.WasteRequestService;

@RestController
@RequestMapping("/waste")
public class WasteRequestController {
	
	@Autowired
	private WasteRequestService wasteRequestService;
	
	
	@GetMapping("")
	public String sayHello() {
		return "WelCome to the EcoTracker...!!";
	}
	
	@PostMapping("/add")
	public WasteRequest addRequest(@RequestBody WasteRequest wasteRequest) {
		return wasteRequestService.saveRequest(wasteRequest);
	}
	
	@GetMapping("/get")
	public List<WasteRequest> getAll(){
		return wasteRequestService.getAllRequests();
	}
	
	@DeleteMapping("/dlt/{id}")
	public String deleteById(@PathVariable Long id) {
		wasteRequestService.deleteRequest(id);
		return "Waste Request Deleted Successfully!!";
	}
	
}
