package com.epsiyaya.projetvideoejb.metier.model;

import org.joda.time.DateTime;

public class FilmAchete {

    private Film filmAchete;
    private DateTime dateAchat;

    public FilmAchete(DateTime date, Film film) {
        dateAchat = date;
        filmAchete = film;
    }

    public Film getFilmAchete() {
        return filmAchete;
    }

    public DateTime getDateAchat() {
        return dateAchat;
    }
}