package com.example.rimtrack.repository;
import com.example.rimtrack.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface FuelRepository extends JpaRepository<Fuel, Long> {
    
}

