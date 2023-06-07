
    package com.parking.mgmt.controller;
    
    import com.parking.mgmt.model.ParkingLot;
    import com.parking.mgmt.service.ParkingLotService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    
    import java.util.List;
    
    @RestController
    @RequestMapping("/users")
    public class UserController {
        @Autowired
        private ParkingLotService parkingLotService;
        
        // Other methods omitted for brevity
        
        @GetMapping("/parking-lots")
        public ResponseEntity<List<ParkingLot>> getAllParkingLots() {
            List<ParkingLot> parkingLots = parkingLotService.getAllParkingLots();
            return new ResponseEntity<>(parkingLots, HttpStatus.OK);
        }
    }
