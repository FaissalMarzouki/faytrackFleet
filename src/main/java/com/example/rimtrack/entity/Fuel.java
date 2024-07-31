package com.example.rimtrack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fuel;

    private String fuelType;
    private double quantity;
    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;
    public Long getId_fuel() {
        return id_fuel;
    }
    public void setId_fuel(Long id_fuel) {
        this.id_fuel = id_fuel;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public Vehicule getVehicle() {
        return vehicule;
    }
    public void setVehicle(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
    public Fuel(String fuelType, double quantity, Vehicule vehicule) {
        this.fuelType = fuelType;
        this.quantity = quantity;
        this.vehicule = vehicule;
    }
    public Fuel() {
    }

}