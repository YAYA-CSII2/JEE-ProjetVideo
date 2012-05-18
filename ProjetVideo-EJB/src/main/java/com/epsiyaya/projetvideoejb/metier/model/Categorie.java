package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Categorie implements Serializable {

    private static final long serialVersionUID = 3206093459760846969L;
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