package com.example.rimtrack.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "maintenance")
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_maintenance")
    private Long idMaintenance;
 
    @Column(name = "maintenance_type")
    private String maintenanceType;

    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;

    
 
    @Column(name = "observation")
    private String observation;
 
    @Column(name = "date_operation")
    private LocalDateTime dateOperation;
 
    @Column(name = "labor_cost")
    private Double laborCost;
 
    @Column(name = "reference_da_dr")
    private String referenceDaDr;
 
    @Column(name = "actual_repair_time")
    private LocalDateTime actualRepairTime;

    public Maintenance() {
    }

    public Maintenance(String maintenanceType, Vehicule vehicule, String observation,
            LocalDateTime dateOperation, Double laborCost, String referenceDaDr, LocalDateTime actualRepairTime) {
        this.maintenanceType = maintenanceType;
        this.vehicule = vehicule;
        this.observation = observation;
        this.dateOperation = dateOperation;
        this.laborCost = laborCost;
        this.referenceDaDr = referenceDaDr;
        this.actualRepairTime = actualRepairTime;
    }

    public Long getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(Long idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public LocalDateTime getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(LocalDateTime dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(Double laborCost) {
        this.laborCost = laborCost;
    }

    public String getReferenceDaDr() {
        return referenceDaDr;
    }

    public void setReferenceDaDr(String referenceDaDr) {
        this.referenceDaDr = referenceDaDr;
    }

    public LocalDateTime getActualRepairTime() {
        return actualRepairTime;
    }

    public void setActualRepairTime(LocalDateTime actualRepairTime) {
        this.actualRepairTime = actualRepairTime;
    }
 
    
 
}


