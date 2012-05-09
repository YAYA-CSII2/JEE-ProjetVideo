package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.joda.time.DateTime;

public class Personnalite {
    
    private Integer id;
    private String nom;
    private String prenom;
    private DateTime dateDeNaissance;
    private String description;
    private Set<Film> filmJouer = new HashSet<Film>();

    public Personnalite(String name, String surname, DateTime dateNaiss, String desc) {
        nom = name;
        prenom = surname;
        dateDeNaissance = dateNaiss;
        description = desc;
    }

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer persoId) {
        id = persoId;
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

    public Date getDateDeNaissance() {
        return dateDeNaissance.toDate();
    }

    public DateTime getDateTimeDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date date) {
        dateDeNaissance = new DateTime(date);
    }

    public void setDateTimeDeNaissance(DateTime date) {
        dateDeNaissance = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        description = Description;
    }

    public Set getFilmJouer() {
        return filmJouer;
    }

    public void setFilmJouer(Set<Film> films) {
        filmJouer = films;
    }

    public void addFilmJouer(Film film) {
        filmJouer.add(film);
    }
}