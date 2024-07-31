package com.example.rimtrack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class DocumentCirculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_documentCirculation;

    private String documentNumber;
    private String issuingAuthority;
    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicule vehicule;

    
    public DocumentCirculation() {
    }
    public DocumentCirculation(String documentNumber, String issuingAuthority, Vehicule vehicule) {
        this.documentNumber = documentNumber;
        this.issuingAuthority = issuingAuthority;
        this.vehicule = vehicule;
    }
    public Long getId_documentCirculation() {
        return id_documentCirculation;
    }
    public void setId_documentCirculation(Long id_documentCirculation) {
        this.id_documentCirculation = id_documentCirculation;
    }
    public String getDocumentNumber() {
        return documentNumber;
    }
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
    public String getIssuingAuthority() {
        return issuingAuthority;
    }
    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }
    public Vehicule getVehicle() {
        return vehicule;
    }
    public void setVehicle(Vehicule vehicule) {
        this.vehicule = vehicule;
    }


}