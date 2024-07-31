package com.example.rimtrack.controller;

import com.example.rimtrack.entity.Maintenance;
import com.example.rimtrack.repository.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/maintenance")
public class MaintenanceController {
    @Autowired
    private MaintenanceRepository maintenanceRepository;


    @GetMapping("/getAllMaintenances")
    public ResponseEntity<List<Maintenance>> getAllMaintenances() {
        List<Maintenance> maintenances = maintenanceRepository.findAll();
        return new ResponseEntity<>(maintenances, HttpStatus.OK);
    }

    @GetMapping("/getMaintenanceById/{id}")
    public ResponseEntity<Maintenance> getMaintenanceById(@PathVariable("id") Long id) {
        Optional<Maintenance> maintenance = maintenanceRepository.findById(id);
        return maintenance.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/createMaintenance")
    public ResponseEntity<Maintenance> createMaintenance(@RequestBody Maintenance maintenance) {
        Maintenance createdMaintenance = maintenanceRepository.save(maintenance);
        return new ResponseEntity<>(createdMaintenance, HttpStatus.CREATED);
    }

    @PutMapping("/updateMaintenance/{id}")
    public ResponseEntity<Maintenance> updateMaintenance(@PathVariable("id") Long id, @RequestBody Maintenance maintenance) {
        Optional<Maintenance> existingMaintenance = maintenanceRepository.findById(id);
        if (existingMaintenance.isPresent()) {
            maintenance.setIdMaintenance(id);
            Maintenance updatedMaintenance = maintenanceRepository.save(maintenance);
            return new ResponseEntity<>(updatedMaintenance, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteMaintenance/{id}")
    public ResponseEntity<HttpStatus> deleteMaintenance(@PathVariable("id") Long id) {
        Optional<Maintenance> existingMaintenance = maintenanceRepository.findById(id);
        if (existingMaintenance.isPresent()) {
            maintenanceRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
