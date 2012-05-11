package com.epsiyaya.projetvideoejb.metier.model;

import java.util.Date;
import org.joda.time.DateTime;

public class FilmLoue {

    private DateTime dateLocation;
    private Integer duree;
    private Film monFilmLoue;
    private Utilisateur monLoueur;

    public FilmLoue(Film MonFilmLoue, Utilisateur MonLoueur, DateTime DateLocation, Integer Duree) {
        monLoueur = MonLoueur;
        monFilmLoue = MonFilmLoue;
        duree = Duree;
        dateLocation = DateLocation;
    }
    
    public Utilisateur getMonLoueur() {
        return monLoueur;
    }

    public void setMonLoueur(Utilisateur monLoueur) {
        this.monLoueur = monLoueur;
    }

    public Film getFilmLoue() {
        return monFilmLoue;
    }

    public DateTime getDateTimeLocation() {
        return dateLocation;
    }
    
    public Date getDateDeSortie() {
        return dateLocation.toDate();
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer Duree) {
        duree = Duree;
    }
}