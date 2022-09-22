package com.api.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.api.parkingcontrol.models.parkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;


@Service
public class ParkingSpotService {

	
	ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}

	@Transactional
	public Object save(parkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}

	public boolean existsByLincensePlateCar(String lincensePlateCar) {

		return parkingSpotRepository.existsByLincensePlateCar(lincensePlateCar);
	}

	public boolean existsByParkingSpotNumber(String parkingSpotnumber) {
	
		return parkingSpotRepository.existsByParkingSpotnumber(parkingSpotnumber);
	}

	public List<parkingSpotModel> findAll() {
		
		return parkingSpotRepository.findAll();
	}

	
	 public Optional<parkingSpotModel> findById(UUID id) {
	        return parkingSpotRepository.findById(id);
	    }

	@Transactional 
	public void delete(parkingSpotModel parkingSpotModel) {
		parkingSpotRepository.delete(parkingSpotModel);
		
	}
	
	
	
	
	
	
}
