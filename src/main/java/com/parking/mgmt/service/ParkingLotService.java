
package com.parking.mgmt.service;

import com.parking.mgmt.dto.ParkingLotDTO;
import com.parking.mgmt.model.ParkingLot;

import java.util.List;

public interface ParkingLotService {
    List<ParkingLot> getAllParkingLots();
    ParkingLot getParkingLotById(Long id);
    ParkingLot addParkingLot(ParkingLot parkingLot);
    ParkingLot updateParkingLot(ParkingLot parkingLot);
    void deleteParkingLot(Long id);
}
