
package com.parking.mgmt.service.impl;

import com.parking.mgmt.dto.ParkingLotDTO;
import com.parking.mgmt.exception.ParkingLotException;
import com.parking.mgmt.mapper.ParkingLotMapper;
import com.parking.mgmt.model.ParkingLot;
import com.parking.mgmt.repository.ParkingLotRepository;
import com.parking.mgmt.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    @Autowired
    private ParkingLotRepository parkingLotRepository;

    @Autowired
    private ParkingLotMapper parkingLotMapper;

    @Override
    public List<ParkingLotDTO> getAllParkingLots() {
        List<ParkingLot> parkingLots = parkingLotRepository.findAll();
        return parkingLots.stream().map(parkingLotMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public ParkingLotDTO getParkingLotById(Long id) {
        ParkingLot parkingLot = parkingLotRepository.findById(id).orElse(null);
        if (parkingLot == null) {
            throw new ParkingLotException("Parking lot with id " + id + " not found");
        }
        return parkingLotMapper.toDTO(parkingLot);
    }

    @Override
    public ParkingLotDTO addParkingLot(ParkingLotDTO parkingLotDTO) {
        ParkingLot parkingLot = parkingLotMapper.toEntity(parkingLotDTO);
        parkingLot = parkingLotRepository.save(parkingLot);
        return parkingLotMapper.toDTO(parkingLot);
    }

    @Override
    public ParkingLotDTO updateParkingLot(Long id, ParkingLotDTO parkingLotDTO) {
        ParkingLot parkingLot = parkingLotRepository.findById(id).orElse(null);
        if (parkingLot == null) {
            throw new ParkingLotException("Parking lot with id " + id + " not found");
        }
        parkingLot.setName(parkingLotDTO.getName());
        parkingLot.setLocation(parkingLotDTO.getLocation());
        parkingLot.setTotalSlots(parkingLotDTO.getTotalSlots());
        parkingLot.setAvailableSlots(parkingLotDTO.getAvailableSlots());
        parkingLot.setRating(parkingLotDTO.getRating());
        parkingLot.setReviews(parkingLotDTO.getReviews());
        parkingLot = parkingLotRepository.save(parkingLot);
        return parkingLotMapper.toDTO(parkingLot);
    }

    @Override
    public void deleteParkingLot(Long id) {
        parkingLotRepository.deleteById(id);
    }
}
