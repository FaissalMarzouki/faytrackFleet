package com.example.rimtrack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rimtrack.entity.Device;
import com.example.rimtrack.repository.DeviceRepository;

@RestController
@RequestMapping("/api/device")
public class DeviceController {
    
    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }
    
    @GetMapping("/getAllDevices")
    public ResponseEntity<List<Device>> getAllDevices() {
        List<Device> devices = deviceRepository.findAll();
        return new ResponseEntity<>(devices, HttpStatus.OK);
    }

    @GetMapping("/getDeviceById/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable("id") Long id) {
        Optional<Device> device = deviceRepository.findById(id);
        return device.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/createDevice")
    public ResponseEntity<Device> createDevice(@RequestBody Device device) {
        Device createDevice = deviceRepository.save(device);
        return new ResponseEntity<>(createDevice, HttpStatus.CREATED);
    }

    @PutMapping("/updateDevice/{id}")
    public ResponseEntity<Device> updateDevice(@PathVariable("id") Long id, @RequestBody Device device) {
        Optional<Device> existingDevice = deviceRepository.findById(id);
        if (existingDevice.isPresent()) {
            device.setId(id);
            Device updatedDevice = deviceRepository.save(device);
            return new ResponseEntity<>(updatedDevice, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteDevice/{id}")
    public ResponseEntity<HttpStatus> deleteDevice(@PathVariable("id") Long id) {
        Optional<Device> existingDriver = deviceRepository.findById(id);
        if (existingDriver.isPresent()) {
            deviceRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




}
