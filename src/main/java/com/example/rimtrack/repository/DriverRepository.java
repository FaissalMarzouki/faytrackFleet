package com.example.rimtrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rimtrack.entity.Driver;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    
}
