package com.epsiyaya.projetvideoejb.metier.model;

import java.util.Date;
import org.joda.time.DateTime;

public class FilmAchete {

    private Film monFilmAchete;
    private DateTime dateAchat;
    private Utilisateur acheteur;

    public FilmAchete(DateTime date, Film film) {
        dateAchat = date;
        monFilmAchete = film;
    }

    public Film getMonFilmAchete() {
        return monFilmAchete;
    }

    public void setMonFilmAchete(Film monFilmAchete) {
        this.monFilmAchete = monFilmAchete;
    }

    public Utilisateur getAcheteur() {
        return acheteur;
    }

    public void setAcheteur(Utilisateur acheteur) {
        this.acheteur = acheteur;
    }

    public Date getDateAchat() {
        return dateAchat.toDate();
    }

    public void setDateAchat(Date date) {
        dateAchat = new DateTime(date);
    }

    public DateTime getDateTimeAchat() {
        return dateAchat;
    }

    public void setDateTimeAchat(DateTime date) {
        dateAchat = date;
    }
}