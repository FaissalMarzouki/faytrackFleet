package com.example.rimtrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.rimtrack.entity.Vidange;
import com.example.rimtrack.repository.VidangeRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vidanges")
public class VidangeController {

    @Autowired
    private VidangeRepository vidangeRepository;

    @GetMapping("getAllVidanges")
    public ResponseEntity<List<Vidange>> getAllVidanges() {
        List<Vidange> vidanges = vidangeRepository.findAll();
        return ResponseEntity.ok(vidanges);
    }

    @GetMapping("/getVidangeById/{id}")
    public ResponseEntity<Vidange> getVidangeById(@PathVariable("id") Long id) {
        Optional<Vidange> optionalVidange = vidangeRepository.findById(id);
        if (optionalVidange.isPresent()) {
            return ResponseEntity.ok(optionalVidange.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/createVidange")
    public ResponseEntity<Vidange> createVidange(@RequestBody Vidange vidange) {
        Vidange createdVidange = vidangeRepository.save(vidange);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdVidange);
    }

    @PutMapping("/updateVidange/{id}")
    public ResponseEntity<Vidange> updateVidange(@PathVariable("id") Long id, @RequestBody Vidange updatedVidange) {
        Optional<Vidange> optionalVidange = vidangeRepository.findById(id);
        if (optionalVidange.isPresent()) {
            Vidange existingVidange = optionalVidange.get();
            existingVidange.setType(updatedVidange.getType());
            existingVidange.setCost(updatedVidange.getCost());

            Vidange savedVidange = vidangeRepository.save(existingVidange);
            return ResponseEntity.ok(savedVidange);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deleteVidange/{id}")
    public ResponseEntity<Void> deleteVidange(@PathVariable("id") Long id) {
        Optional<Vidange> optionalVidange = vidangeRepository.findById(id);
        if (optionalVidange.isPresent()) {
            vidangeRepository.delete(optionalVidange.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

