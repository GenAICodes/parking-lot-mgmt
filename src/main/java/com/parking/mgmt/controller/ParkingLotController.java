
package com.parking.mgmt.controller;

import com.parking.mgmt.dto.ParkingLotDTO;
import com.parking.mgmt.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkinglots")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping
    public ResponseEntity<List<ParkingLotDTO>> getAllParkingLots() {
        List<ParkingLotDTO> parkingLots = parkingLotService.getAllParkingLots();
        return new ResponseEntity<>(parkingLots, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingLotDTO> getParkingLotById(@PathVariable Long id) {
        ParkingLotDTO parkingLot = parkingLotService.getParkingLotById(id);
        if (parkingLot == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(parkingLot, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ParkingLotDTO> addParkingLot(@RequestBody ParkingLotDTO parkingLotDTO) {
        ParkingLotDTO newParkingLot = parkingLotService.addParkingLot(parkingLotDTO);
        return new ResponseEntity<>(newParkingLot, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ParkingLotDTO> updateParkingLot(@PathVariable Long id, @RequestBody ParkingLotDTO parkingLotDTO) {
        ParkingLotDTO updatedParkingLot = parkingLotService.updateParkingLot(id, parkingLotDTO);
        if (updatedParkingLot == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedParkingLot, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParkingLot(@PathVariable Long id) {
        parkingLotService.deleteParkingLot(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
