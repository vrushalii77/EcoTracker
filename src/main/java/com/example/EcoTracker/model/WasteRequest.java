package com.example.EcoTracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="waste_request")
public class WasteRequest {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name ="name")
	  	private String name;
		
		@Column(name="address")
	    private String address;
		
		@Column(name ="type_of_waste")
	    private String typeOfWaste;
		
		@Column(name ="pick_up_date")
	    private String pickupDate;
		
		
		public WasteRequest(){
			
		}
		
		 public WasteRequest(String name, String address, String typeOfWaste, String pickupDate){
			 this.name = name;
			 this.address = address;
			 this.typeOfWaste = typeOfWaste;
			 this.pickupDate = pickupDate;	 
		 }

		 
		 
		public Long getId() {
			return id;
		}
		 
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTypeOfWaste() {
			return typeOfWaste;
		}

		public void setTypeOfWaste(String typeOfWaste) {
			this.typeOfWaste = typeOfWaste;
		}

		public String getPickupDate() {
			return pickupDate;
		}

		public void setPickupDate(String pickupDate) {
			this.pickupDate = pickupDate;
		}
		
//		public void setName() {
//			this.name = name;
//		}
//		
//		public String getName() {
//			return name;
//		}
		 
		 
}
