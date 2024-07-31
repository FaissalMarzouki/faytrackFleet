package com.example.rimtrack.controller;

import com.example.rimtrack.entity.Driver;
import com.example.rimtrack.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/driver")
public class DriverController {
    @Autowired
    private DriverRepository driverRepository;


    @GetMapping("/getAllDrivers")
    public ResponseEntity<List<Driver>> getAllDrivers() {
        List<Driver> drivers = driverRepository.findAll();
        return new ResponseEntity<>(drivers, HttpStatus.OK);
    }

    @GetMapping("/getDriverById/{id}")
    public ResponseEntity<Driver> getDriverById(@PathVariable("id") Long id) {
        Optional<Driver> driver = driverRepository.findById(id);
        return driver.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/createDriver")
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver) {
        Driver createdDriver = driverRepository.save(driver);
        return new ResponseEntity<>(createdDriver, HttpStatus.CREATED);
    }

    @PutMapping("/updateDriver/{id}")
    public ResponseEntity<Driver> updateDriver(@PathVariable("id") Long id, @RequestBody Driver driver) {
        Optional<Driver> existingDriver = driverRepository.findById(id);
        if (existingDriver.isPresent()) {
            driver.setId(id);
            Driver updatedDriver = driverRepository.save(driver);
            return new ResponseEntity<>(updatedDriver, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteDriver/{id}")
    public ResponseEntity<HttpStatus> deleteDriver(@PathVariable("id") Long id) {
        Optional<Driver> existingDriver = driverRepository.findById(id);
        if (existingDriver.isPresent()) {
            driverRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
