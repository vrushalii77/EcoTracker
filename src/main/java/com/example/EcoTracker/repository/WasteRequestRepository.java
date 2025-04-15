package com.example.EcoTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EcoTracker.model.WasteRequest;

@Repository
public interface WasteRequestRepository extends JpaRepository<WasteRequest, Long> {

}
