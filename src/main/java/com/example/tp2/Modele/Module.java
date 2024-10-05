package com.example.tp2.Modele;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // Strategy AUTO means the persistence provider (e.g., Hibernate) will automatically pick an appropriate generation strategy (e.g., sequence, identity).
    private int id;

    private String nom;
    private String description;

    // Default constructor (required by JPA)
    public Module() {
    }

    public Module(int id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }
    // Parameterized constructor
    public Module(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Optional: You may want to override toString(), equals(), and hashCode() methods
    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
