package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.parkingSpotModel;


@Repository
public interface ParkingSpotRepository extends JpaRepository<parkingSpotModel, UUID> {

	boolean existsByLincensePlateCar(String lincensePlateCar);
    
	boolean existsByParkingSpotnumber(String parkingSpotnumber);
	
	
}
