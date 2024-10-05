package com.example.tp2.Modele;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Cours {



    @Id
    private int id;
    private String nom;
    private String description;

    @ManyToOne
    private Module module;

    public Cours(int id, String nom, String description, int moduleId) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.module = new Module(moduleId,"","");
    }
    public Cours() {

    }
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
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
}

