
package com.parking.mgmt.controller.advice;

import com.parking.mgmt.exception.ParkingLotNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ParkingLotNotFoundException.class)
    public ResponseEntity<String> handleParkingLotNotFoundException(ParkingLotNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
