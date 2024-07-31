package com.example.rimtrack.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driver_id")

    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "type_permis")
    private String typePermis;

    private String genre;

    @OneToMany(mappedBy = "driver")
    private List<Vehicule> vehicules;

    public Driver() {
    }

    public Driver(String nom, String prenom, String email, String typePermis, String genre) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.typePermis = typePermis;
        this.genre = genre;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypePermis() {
        return typePermis;
    }

    public void setTypePermis(String typePermis) {
        this.typePermis = typePermis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }
}
