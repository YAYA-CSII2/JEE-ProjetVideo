package com.epsiyaya.projetvideoejb.metier.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.joda.time.DateTime;

public class Film {

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
    private Set<Personnalite> acteurs = new HashSet<Personnalite>();
    private ArrayList<BandeAnnonce> bandeAnnonces = new ArrayList<BandeAnnonce>();
    private ArrayList<Photo> photos = new ArrayList<Photo>();
    private ArrayList<Categorie> categorie = new ArrayList<Categorie>();
    private ArrayList<NoteFilm> notesDuFilm = new ArrayList<NoteFilm>();

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

    public Film(String Nom, String LienFilm, String Synopsis, Integer Duree, DateTime DateDeSortie, String AnneeDeProduction, Float PrixAchat, Float PrixLocation, String linkAff, Personnalite real, Set actors, ArrayList<BandeAnnonce> BandeAnnonces, ArrayList<Photo> Photos, ArrayList<NoteFilm> notes) {
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
        return dateDeSortie;
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

    public ArrayList getBandeDannoce() {
        return bandeAnnonces;
    }

    public void setBandeDannoce(ArrayList bandeDannoce) {
        this.bandeAnnonces = bandeDannoce;
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

    public ArrayList<BandeAnnonce> getBandeAnnonces() {
        return bandeAnnonces;
    }

    public void setBandeAnnonces(ArrayList<BandeAnnonce> bandeAnnonces) {
        this.bandeAnnonces = bandeAnnonces;
    }

    public ArrayList<Categorie> getCategorie() {
        return categorie;
    }

    public void setCategorie(ArrayList<Categorie> categorie) {
        this.categorie = categorie;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
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

    public Set<Personnalite> getActeurs() {
        return acteurs;
    }

    public void setActeurs(Set<Personnalite> actors) {
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

    public ArrayList<NoteFilm> getNotesDuFilm() {
        return notesDuFilm;
    }

    public void setNoteDuFilm(ArrayList<NoteFilm> notes) {
        notesDuFilm = notes;
    }
}