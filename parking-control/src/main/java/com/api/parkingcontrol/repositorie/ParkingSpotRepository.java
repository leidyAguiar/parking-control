package com.api.parkingcontrol.repositorie;

import com.api.parkingcontrol.domain.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {

    boolean existsByLicensePlateCar(String licencePlaterCar);

    boolean existsByParkingSpotNumber(String parkingSpotnumber);

    boolean existsByApartmentAndBlock(String apartment, String block);
}
