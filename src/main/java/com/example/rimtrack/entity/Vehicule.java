package com.example.rimtrack.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicule")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicule_id")
    private Long vehiculeId;
    
    @OneToOne
    @JoinColumn(name = "device_id")
    private Device device;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @OneToMany(mappedBy = "vehicule")
    private List<Maintenance> maintenances;

    
    @Column(name = "mark")
    private String mark;
    
    @Column(name = "matricule")
    private String matricule;
    
    @Column(name = "path_gray_card")
    private String pathGrayCard;
    
    @Column(name = "emails")
    private String emails;
    
    @Column(name = "max_speed")
    private Long maxSpeed;
    
    @Column(name = "icon")
    private String icon;
    
    @Column(name = "model")
    private String model;
    
    @Column(name = "odo_offset")
    private Double odoOffset;
    
    @Column(name = "last_odo_update")
    private Timestamp lastOdoUpdate;
    
    @Column(name = "circulation_at")
    private Timestamp circulationAt;
    
    @Column(name = "sub_mark")
    private String subMark;
    
    @Column(name = "have_avatar")
    private Boolean haveAvatar;
    
    @Column(name = "have_gray_card")
    private Boolean haveGrayCard;
    
    @Column(name = "rental")
    private Double rental;
    
    @Column(name = "transport_type_id")
    private Integer transportTypeId;
    
    @Column(name = "rotation")
    private Integer rotation;
    
    @Column(name = "fuel_card_number")
    private String fuelCardNumber;
    
    @Column(name = "jawaz_card_number")
    private String jawazCardNumber;
    
    @Column(name = "capacity")
    private String capacity;
    
    @Column(name = "have_contracting")
    private Boolean haveContracting;
    
    @Column(name = "have_second_contracting")
    private Boolean haveSecondContracting;
    
    @Column(name = "have_third_contracting")
    private Boolean haveThirdContracting;
    
    @Column(name = "program_id")
    private Integer programId;
    
    @Column(name = "code")
    private String code;
    
    @Column(name = "signification")
    private String signification;
    
    @Column(name = "card_fuel_solde")
    private Double cardFuelSolde;
    
    @Column(name = "secteur")
    private String secteur;
    

    public Vehicule() {
    }


    public Vehicule(List<Maintenance> maintenances, String mark, String matricule, String pathGrayCard, String emails,
            Long maxSpeed, String icon, String model, Double odoOffset, Timestamp lastOdoUpdate,
            Timestamp circulationAt, String subMark, Boolean haveAvatar, Boolean haveGrayCard, Double rental,
            Integer transportTypeId, Integer rotation, String fuelCardNumber, String jawazCardNumber, String capacity,
            Boolean haveContracting, Boolean haveSecondContracting, Boolean haveThirdContracting, Integer programId,
            String code, String signification, Double cardFuelSolde, String secteur) {
        this.maintenances = maintenances;
        this.mark = mark;
        this.matricule = matricule;
        this.pathGrayCard = pathGrayCard;
        this.emails = emails;
        this.maxSpeed = maxSpeed;
        this.icon = icon;
        this.model = model;
        this.odoOffset = odoOffset;
        this.lastOdoUpdate = lastOdoUpdate;
        this.circulationAt = circulationAt;
        this.subMark = subMark;
        this.haveAvatar = haveAvatar;
        this.haveGrayCard = haveGrayCard;
        this.rental = rental;
        this.transportTypeId = transportTypeId;
        this.rotation = rotation;
        this.fuelCardNumber = fuelCardNumber;
        this.jawazCardNumber = jawazCardNumber;
        this.capacity = capacity;
        this.haveContracting = haveContracting;
        this.haveSecondContracting = haveSecondContracting;
        this.haveThirdContracting = haveThirdContracting;
        this.programId = programId;
        this.code = code;
        this.signification = signification;
        this.cardFuelSolde = cardFuelSolde;
        this.secteur = secteur;
    }


    public Long getVehiculeId() {
        return vehiculeId;
    }


    public void setVehiculeId(Long vehiculeId) {
        this.vehiculeId = vehiculeId;
    }


    public List<Maintenance> getMaintenances() {
        return maintenances;
    }


    public void setMaintenances(List<Maintenance> maintenances) {
        this.maintenances = maintenances;
    }


    public String getMark() {
        return mark;
    }


    public void setMark(String mark) {
        this.mark = mark;
    }


    public String getMatricule() {
        return matricule;
    }


    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }


    public String getPathGrayCard() {
        return pathGrayCard;
    }


    public void setPathGrayCard(String pathGrayCard) {
        this.pathGrayCard = pathGrayCard;
    }


    public String getEmails() {
        return emails;
    }


    public void setEmails(String emails) {
        this.emails = emails;
    }


    public Long getMaxSpeed() {
        return maxSpeed;
    }


    public void setMaxSpeed(Long maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public String getIcon() {
        return icon;
    }


    public void setIcon(String icon) {
        this.icon = icon;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public Double getOdoOffset() {
        return odoOffset;
    }


    public void setOdoOffset(Double odoOffset) {
        this.odoOffset = odoOffset;
    }


    public Timestamp getLastOdoUpdate() {
        return lastOdoUpdate;
    }


    public void setLastOdoUpdate(Timestamp lastOdoUpdate) {
        this.lastOdoUpdate = lastOdoUpdate;
    }


    public Timestamp getCirculationAt() {
        return circulationAt;
    }


    public void setCirculationAt(Timestamp circulationAt) {
        this.circulationAt = circulationAt;
    }


    public String getSubMark() {
        return subMark;
    }


    public void setSubMark(String subMark) {
        this.subMark = subMark;
    }


    public Boolean getHaveAvatar() {
        return haveAvatar;
    }


    public void setHaveAvatar(Boolean haveAvatar) {
        this.haveAvatar = haveAvatar;
    }


    public Boolean getHaveGrayCard() {
        return haveGrayCard;
    }


    public void setHaveGrayCard(Boolean haveGrayCard) {
        this.haveGrayCard = haveGrayCard;
    }


    public Double getRental() {
        return rental;
    }


    public void setRental(Double rental) {
        this.rental = rental;
    }


    public Integer getTransportTypeId() {
        return transportTypeId;
    }


    public void setTransportTypeId(Integer transportTypeId) {
        this.transportTypeId = transportTypeId;
    }


    public Integer getRotation() {
        return rotation;
    }


    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }


    public String getFuelCardNumber() {
        return fuelCardNumber;
    }


    public void setFuelCardNumber(String fuelCardNumber) {
        this.fuelCardNumber = fuelCardNumber;
    }


    public String getJawazCardNumber() {
        return jawazCardNumber;
    }


    public void setJawazCardNumber(String jawazCardNumber) {
        this.jawazCardNumber = jawazCardNumber;
    }


    public String getCapacity() {
        return capacity;
    }


    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }


    public Boolean getHaveContracting() {
        return haveContracting;
    }


    public void setHaveContracting(Boolean haveContracting) {
        this.haveContracting = haveContracting;
    }


    public Boolean getHaveSecondContracting() {
        return haveSecondContracting;
    }


    public void setHaveSecondContracting(Boolean haveSecondContracting) {
        this.haveSecondContracting = haveSecondContracting;
    }


    public Boolean getHaveThirdContracting() {
        return haveThirdContracting;
    }


    public void setHaveThirdContracting(Boolean haveThirdContracting) {
        this.haveThirdContracting = haveThirdContracting;
    }


    public Integer getProgramId() {
        return programId;
    }


    public void setProgramId(Integer programId) {
        this.programId = programId;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getSignification() {
        return signification;
    }


    public void setSignification(String signification) {
        this.signification = signification;
    }


    public Double getCardFuelSolde() {
        return cardFuelSolde;
    }


    public void setCardFuelSolde(Double cardFuelSolde) {
        this.cardFuelSolde = cardFuelSolde;
    }


    public String getSecteur() {
        return secteur;
    }


    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }


    @Override
    public String toString() {
        return "Vehicule [vehiculeId=" + vehiculeId + ", device=" + device + ", driver=" + driver + ", maintenances="
                + maintenances + ", mark=" + mark + ", matricule=" + matricule + ", pathGrayCard=" + pathGrayCard
                + ", emails=" + emails + ", maxSpeed=" + maxSpeed + ", icon=" + icon + ", model=" + model
                + ", odoOffset=" + odoOffset + ", lastOdoUpdate=" + lastOdoUpdate + ", circulationAt=" + circulationAt
                + ", subMark=" + subMark + ", haveAvatar=" + haveAvatar + ", haveGrayCard=" + haveGrayCard + ", rental="
                + rental + ", transportTypeId=" + transportTypeId + ", rotation=" + rotation + ", fuelCardNumber="
                + fuelCardNumber + ", jawazCardNumber=" + jawazCardNumber + ", capacity=" + capacity
                + ", haveContracting=" + haveContracting + ", haveSecondContracting=" + haveSecondContracting
                + ", haveThirdContracting=" + haveThirdContracting + ", programId=" + programId + ", code=" + code
                + ", signification=" + signification + ", cardFuelSolde=" + cardFuelSolde + ", secteur=" + secteur
                + "]";
    }


    
}




