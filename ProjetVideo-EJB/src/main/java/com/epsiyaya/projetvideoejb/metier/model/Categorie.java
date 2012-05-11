package com.epsiyaya.projetvideoejb.metier.model;

import java.util.HashSet;
import java.util.Set;

public class Categorie {

    private String nom;
    private Set<Film> mesFilms = new HashSet<Film>();
    
    public Categorie(String Nom) {
        nom = Nom;
    }
    
    public Set<Film> getMesFilms() {
        return mesFilms;
    }

    public void setMesFilms(Set<Film> mesFilms) {
        this.mesFilms = mesFilms;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String newNom) {
        nom = newNom;
    }

}