package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.joda.time.DateTime;

public class Film implements Serializable {

    private static final long serialVersionUID = 3206093459760846969L; 
    
    private String nom;
    private String lienAffiche;
    private String synopsis;
    private DateTime dateDeSortie;
    private Integer duree;
    private String lienFilm;
    private String anneeDeProduction;
    private Float prixAchat;
    private Float prixLocationJour;
    private Personnalite realisateur;
    private Set acteurs = null;
    private Set bandeAnnonces = null;
    private Set photos = null;
    private Set categories = null;
    private Set notesDuFilm = null;

    public Film() {
    }

    public Film(String Nom, String LienFilm, String Synopsis, Integer Duree, DateTime DateDeSortie, String AnneeDeProduction, Float PrixAchat, Float PrixLocation, String linkAff, Personnalite real) {
        nom = Nom;
        lienFilm = LienFilm;
        synopsis = Synopsis;
        duree = Duree;
        dateDeSortie = DateDeSortie;
        anneeDeProduction = AnneeDeProduction;
        prixAchat = PrixAchat;
        prixLocationJour = PrixLocation;
        lienAffiche = linkAff;
        realisateur = real;
    }

    public Film(String Nom, String LienFilm, String Synopsis, Integer Duree, DateTime DateDeSortie, String AnneeDeProduction, Float PrixAchat, Float PrixLocation, String linkAff, Personnalite real, HashSet<Personnalite> actors, HashSet<BandeAnnonce> BandeAnnonces, HashSet<Photo> Photos, HashSet<NoteFilm> notes) {
        nom = Nom;
        lienFilm = LienFilm;
        synopsis = Synopsis;
        duree = Duree;
        dateDeSortie = DateDeSortie;
        anneeDeProduction = AnneeDeProduction;
        prixAchat = PrixAchat;
        prixLocationJour = PrixLocation;
        lienAffiche = linkAff;
        realisateur = real;
        acteurs = actors;
        bandeAnnonces = BandeAnnonces;
        photos = Photos;
        notesDuFilm = notes;
    }
    // pour un fucking test

    public Film(String Nom, Set desNotes) {
        nom = Nom;
        notesDuFilm = desNotes;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer Duree) {
        duree = Duree;
    }

    public Date getDateDeSortie() {
        return dateDeSortie.toDate();
    }

    public DateTime getDateTimeDeSortie() {
        return dateDeSortie.toDateTime();
    }

    public void setDateDeSortie(Date date) {
        dateDeSortie = new DateTime(date);
    }

    public void setDateTimeDeSortie(DateTime date) {
        dateDeSortie = date;
    }

    public String getLienFilm() {
        return lienFilm;
    }

    public void setLienFilm(String LienFilm) {
        lienFilm = LienFilm;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String Synopsis) {
        synopsis = Synopsis;
    }

    public String getAnneeDeProduction() {
        return anneeDeProduction;
    }

    public void setAnneeDeProduction(String newAnneeDeProduction) {
        anneeDeProduction = newAnneeDeProduction;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String newNom) {
        nom = newNom;
    }

    public Float getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Float getPrixLocationJour() {
        return prixLocationJour;
    }

    public void setPrixLocationJour(Float prixLocation) {
        this.prixLocationJour = prixLocation;
    }

    public String getLienAffiche() {
        return lienAffiche;
    }

    public void setLienAffiche(String linkAffiche) {
        lienAffiche = linkAffiche;
    }

    public Set getBandeAnnonces() {
        return bandeAnnonces;
    }

    /*
     * public void setBandeAnnonces(HashSet<BandeAnnonce> bandeAnnonces) {
     * this.bandeAnnonces = bandeAnnonces; }
     */
    public void setBandeAnnonces(Set bandeAnnonces) {
        this.bandeAnnonces = bandeAnnonces;
    }

    public Set getCategories() {
        return categories;
    }

    public void setCategories(Set categorie) {
        this.categories = categorie;
    }

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set photos) {
        this.photos = photos;
    }

    public void ajouterBandeAnnoce(BandeAnnonce Bandeannonce) {
        bandeAnnonces.add(Bandeannonce);
    }

    public void supprimerBandeAnnonce(BandeAnnonce Bandeannonce) {
        bandeAnnonces.remove(Bandeannonce);
    }

    public void ajouterPhoto(Photo photo) {
        photos.add(photo);
    }

    public void SupprimerPhoto(Photo photo) {
        photos.remove(photo);
    }

    public Set getActeurs() {
        return acteurs;
    }

    public void setActeurs(Set actors) {
        acteurs = actors;
    }

    public void addActeur(Personnalite acteur) {
        acteurs.add(acteur);
    }

    public Personnalite getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Personnalite real) {
        realisateur = real;
    }

    public Set getNotesDuFilm() {
        return notesDuFilm;
    }

    public void setNotesDuFilm(Set notes) {
        notesDuFilm = notes;
    }
}