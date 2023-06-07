
    package com.parking.mgmt.repository;
    
    import com.parking.mgmt.model.ParkingLot;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    
    @Repository
    public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long> {
    }
