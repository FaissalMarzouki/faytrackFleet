package com.example.rimtrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rimtrack.entity.Device;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    
}
