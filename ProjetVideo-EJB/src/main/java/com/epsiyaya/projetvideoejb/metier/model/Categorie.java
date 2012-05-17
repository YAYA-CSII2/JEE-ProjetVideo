package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Categorie implements Serializable {

    private String nom;
    private Set<Film> films = new HashSet<Film>();

    public Categorie() {
    }

    public Categorie(String Nom) {
        nom = Nom;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> mesFilms) {
        this.films = mesFilms;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String newNom) {
        nom = newNom;
    }
}