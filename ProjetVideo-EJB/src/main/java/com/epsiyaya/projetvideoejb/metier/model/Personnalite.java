package com.epsiyaya.projetvideoejb.metier.model;

import org.joda.time.DateTime;

public class Personnalite {

    private String nom;
    private String prenom;
    private DateTime dateDeNaissance;
    private String description;

    public Personnalite(String name, String surname, DateTime dateNaiss, String desc) {
        nom = name;
        prenom = surname;
        dateDeNaissance = dateNaiss;
        description = desc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String Nom) {
        nom = Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String Prenom) {
        prenom = Prenom;
    }

    public DateTime getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(DateTime DateDeNaissance) {
        dateDeNaissance = DateDeNaissance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        description = Description;
    }
}