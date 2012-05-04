package com.epsiyaya.projetvideoejb.metier.model;

import org.joda.time.DateTime;

public class FilmLoue {

    private DateTime dateLocation;
    private Integer duree;
    private Film monFilmLoue;

    public FilmLoue(Film MonFilmLoue, DateTime DateLocation, Integer Duree) {
        monFilmLoue = MonFilmLoue;
        duree = Duree;
        dateLocation = DateLocation;
    }

    public Film getFilmLoue() {
        return monFilmLoue;
    }

    public DateTime getDateLocation() {
        return dateLocation;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer Duree) {
        duree = Duree;
    }
}