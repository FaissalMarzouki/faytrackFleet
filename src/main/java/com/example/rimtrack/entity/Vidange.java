package com.example.rimtrack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Vidange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vidange;

    private String type;
    private double cost;
    @OneToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicule vehicule;
    
    public Vidange() {
    }
    public Vidange(String type, double cost, Vehicule vehicule) {
        this.type = type;
        this.cost = cost;
        this.vehicule = vehicule;
    }
    public Long getId_vidange() {
        return id_vidange;
    }
    public void setId_vidange(Long id_vidange) {
        this.id_vidange = id_vidange;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public Vehicule getVehicule() {
        return vehicule;
    }
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }


}

