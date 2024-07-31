package com.example.rimtrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.rimtrack.entity.Fuel;
import com.example.rimtrack.repository.FuelRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fuels")
public class FuelController {

    @Autowired
    private FuelRepository fuelRepository;

    @GetMapping("/getAllFuels")
    public ResponseEntity<List<Fuel>> getAllFuels() {
        List<Fuel> fuels = fuelRepository.findAll();
        return ResponseEntity.ok(fuels);
    }

    @GetMapping("/getFuelById/{id}")
    public ResponseEntity<Fuel> getFuelById(@PathVariable("id") Long id) {
        Optional<Fuel> optionalFuel = fuelRepository.findById(id);
        if (optionalFuel.isPresent()) {
            return ResponseEntity.ok(optionalFuel.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/createFuel")
    public ResponseEntity<Fuel> createFuel(@RequestBody Fuel fuel) {
        Fuel createdFuel = fuelRepository.save(fuel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFuel);
    }

    @PutMapping("/updateFuel/{id}")
    public ResponseEntity<Fuel> updateFuel(@PathVariable("id") Long id, @RequestBody Fuel updatedFuel) {
        Optional<Fuel> optionalFuel = fuelRepository.findById(id);
        if (optionalFuel.isPresent()) {
            Fuel existingFuel = optionalFuel.get();
            existingFuel.setFuelType(updatedFuel.getFuelType());
            existingFuel.setQuantity(updatedFuel.getQuantity());

            Fuel savedFuel = fuelRepository.save(existingFuel);
            return ResponseEntity.ok(savedFuel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteFuel/{id}")
    public ResponseEntity<Void> deleteFuel(@PathVariable("id") Long id) {
        Optional<Fuel> optionalFuel = fuelRepository.findById(id);
        if (optionalFuel.isPresent()) {
            fuelRepository.delete(optionalFuel.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

