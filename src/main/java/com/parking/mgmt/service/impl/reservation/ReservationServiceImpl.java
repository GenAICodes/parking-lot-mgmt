
package com.parking.mgmt.service.impl.reservation;

import com.parking.mgmt.dto.ReservationDTO;
import com.parking.mgmt.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.parking.mgmt.model.Reservation;
import com.parking.mgmt.repository.ReservationRepository;
import com.parking.mgmt.mapper.ReservationMapper;
import com.parking.mgmt.model.User;
import com.parking.mgmt.model.ParkingLot;
import com.parking.mgmt.repository.UserRepository;
import com.parking.mgmt.repository.ParkingLotRepository;
import com.parking.mgmt.exception.UserException;
import com.parking.mgmt.exception.ParkingLotException;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ReservationMapper reservationMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ParkingLotRepository parkingLotRepository;

    @Override
    public List<ReservationDTO> getReservationHistory(Long userId) {
        List<Reservation> reservations = reservationRepository.findByUserId(userId);
        return reservations.stream().map(reservationMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public void addFavouriteParkingLot(Long userId, Long parkingLotId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserException("User with id " + userId + " not found"));
        ParkingLot parkingLot = parkingLotRepository.findById(parkingLotId).orElseThrow(() -> new ParkingLotException("Parking lot with id " + parkingLotId + " not found"));
        user.getFavouriteParkingLots().add(parkingLot);
        userRepository.save(user);
    }

    @Override
    public void removeFavouriteParkingLot(Long userId, Long parkingLotId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserException("User with id " + userId + " not found"));
        ParkingLot parkingLot = parkingLotRepository.findById(parkingLotId).orElseThrow(() -> new ParkingLotException("Parking lot with id " + parkingLotId + " not found"));
        user.getFavouriteParkingLots().remove(parkingLot);
        userRepository.save(user);
    }

    @Override
    public List<Long> getFavouriteParkingLots(Long userId) {
        // Your code here
        return null;
    }
}
