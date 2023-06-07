
package com.parking.mgmt.mapper;

import com.parking.mgmt.dto.ParkingLotDTO;
import com.parking.mgmt.model.ParkingLot;
import org.springframework.stereotype.Component;

@Component
public class ParkingLotMapper {

    public ParkingLotDTO toDTO(ParkingLot parkingLot) {
        ParkingLotDTO parkingLotDTO = new ParkingLotDTO();
        parkingLotDTO.setName(parkingLot.getName());
        parkingLotDTO.setLocation(parkingLot.getLocation());
        parkingLotDTO.setTotalSlots(parkingLot.getTotalSlots());
        parkingLotDTO.setAvailableSlots(parkingLot.getAvailableSlots());
        parkingLotDTO.setRating(parkingLot.getRating());
        parkingLotDTO.setReviews(parkingLot.getReviews());
        return parkingLotDTO;
    }

    public ParkingLot toEntity(ParkingLotDTO parkingLotDTO) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName(parkingLotDTO.getName());
        parkingLot.setLocation(parkingLotDTO.getLocation());
        parkingLot.setTotalSlots(parkingLotDTO.getTotalSlots());
        parkingLot.setAvailableSlots(parkingLotDTO.getAvailableSlots());
        parkingLot.setRating(parkingLotDTO.getRating());
        parkingLot.setReviews(parkingLotDTO.getReviews());
        return parkingLot;
    }
}
