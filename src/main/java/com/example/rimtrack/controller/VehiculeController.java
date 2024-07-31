package com.example.rimtrack.controller;

import com.example.rimtrack.entity.Vehicule;
import com.example.rimtrack.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehicules")
public class VehiculeController {
    
    
    @Autowired
    private VehiculeRepository vehiculeRepository;



    @GetMapping("/getAllVehicules")
    public ResponseEntity<List<Vehicule>> getAllVehicules() {
        List<Vehicule> vehicules = vehiculeRepository.findAll();
        return ResponseEntity.ok(vehicules);
    }

    @GetMapping("/getVehiculeById/{id}")
    public ResponseEntity<Vehicule> getVehiculeById(@PathVariable("id") Long id) {
        Optional<Vehicule> optionalVehicule = vehiculeRepository.findById(id);
        if (optionalVehicule.isPresent()) {
            return ResponseEntity.ok(optionalVehicule.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/createVehicule")
    public ResponseEntity<Vehicule> createVehicule(@RequestBody Vehicule vehicule) {
        Vehicule createdVehicule = vehiculeRepository.save(vehicule);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdVehicule);
    }
@PutMapping("/updateVehicule/{id}")
public ResponseEntity<Vehicule> updateVehicule(@PathVariable("id") Long id, @RequestBody Vehicule updatedVehicule) {
    Optional<Vehicule> optionalVehicule = vehiculeRepository.findById(id);
    if (optionalVehicule.isPresent()) {
        Vehicule existingVehicule = optionalVehicule.get();
        existingVehicule.setMark(updatedVehicule.getMark());
        existingVehicule.setMatricule(updatedVehicule.getMatricule());
        existingVehicule.setPathGrayCard(updatedVehicule.getPathGrayCard());
        existingVehicule.setEmails(updatedVehicule.getEmails());
        existingVehicule.setMaxSpeed(updatedVehicule.getMaxSpeed());
        existingVehicule.setIcon(updatedVehicule.getIcon());
        existingVehicule.setModel(updatedVehicule.getModel());
        existingVehicule.setOdoOffset(updatedVehicule.getOdoOffset());
        existingVehicule.setLastOdoUpdate(updatedVehicule.getLastOdoUpdate());
        existingVehicule.setCirculationAt(updatedVehicule.getCirculationAt());
        existingVehicule.setSubMark(updatedVehicule.getSubMark());
        existingVehicule.setHaveAvatar(updatedVehicule.getHaveAvatar());
        existingVehicule.setHaveGrayCard(updatedVehicule.getHaveGrayCard());
        existingVehicule.setRental(updatedVehicule.getRental());
        existingVehicule.setTransportTypeId(updatedVehicule.getTransportTypeId());
        existingVehicule.setRotation(updatedVehicule.getRotation());
        existingVehicule.setFuelCardNumber(updatedVehicule.getFuelCardNumber());
        existingVehicule.setJawazCardNumber(updatedVehicule.getJawazCardNumber());
        existingVehicule.setCapacity(updatedVehicule.getCapacity());
        existingVehicule.setHaveContracting(updatedVehicule.getHaveContracting());
        existingVehicule.setHaveSecondContracting(updatedVehicule.getHaveSecondContracting());
        existingVehicule.setHaveThirdContracting(updatedVehicule.getHaveThirdContracting());
        existingVehicule.setProgramId(updatedVehicule.getProgramId());
        existingVehicule.setCode(updatedVehicule.getCode());
        existingVehicule.setSignification(updatedVehicule.getSignification());
        existingVehicule.setCardFuelSolde(updatedVehicule.getCardFuelSolde());
        existingVehicule.setSecteur(updatedVehicule.getSecteur());

        Vehicule savedVehicule = vehiculeRepository.save(existingVehicule);
        return ResponseEntity.ok(savedVehicule);
    } else {
        return ResponseEntity.notFound().build();
    }
}


    @DeleteMapping("/deleteVehicule/{id}")
    public ResponseEntity<Void> deleteVehicule(@PathVariable("id") Long id) {
        Optional<Vehicule> optionalVehicule = vehiculeRepository.findById(id);
        if (optionalVehicule.isPresent()) {
            vehiculeRepository.delete(optionalVehicule.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
