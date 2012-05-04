package com.epsiyaya.projetvideoejb.metier.model;

public class Categorie {

    private String nom;
    private String description;

    public Categorie(String Nom, String Description) {
        nom = Nom;
        description = Description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String newNom) {
        nom = newNom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }
}