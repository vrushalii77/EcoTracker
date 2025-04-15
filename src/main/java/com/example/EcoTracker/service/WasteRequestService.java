package com.example.EcoTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcoTracker.model.WasteRequest;
import com.example.EcoTracker.repository.WasteRequestRepository;

@Service
public class WasteRequestService {
	
	@Autowired
	private WasteRequestRepository wasteRequestRepo;
	
	public WasteRequest saveRequest(WasteRequest wasteRequest) {
		return  wasteRequestRepo.save(wasteRequest);
	}
	
	public List<WasteRequest> getAllRequests(){
		return wasteRequestRepo.findAll();	
	}
	
	public void deleteRequest(Long id) {
		wasteRequestRepo.deleteById(id);
	}
	
}
