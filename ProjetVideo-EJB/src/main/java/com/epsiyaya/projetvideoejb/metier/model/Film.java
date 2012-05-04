package com.epsiyaya.projetvideoejb.metier.model;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Film {

    private String nom;
    private String synopsis;
    private DateTime dateDeSortie;
    private Integer duree;
    private String lienFilm;
    private String anneeDeProduction;
    private Float prixAchat;
    private Float prixLocationJour;
    private String lienAffiche;
    private Personnalite realisateur;
    private ArrayList<Personnalite> acteurs = new ArrayList<Personnalite>();
    private ArrayList<BandeAnnonce> bandeAnnonces = new ArrayList<BandeAnnonce>();
    private ArrayList<Photo> photos = new ArrayList<Photo>();
    private ArrayList<Categorie> categorie = new ArrayList<Categorie>();
    private ArrayList<NoteFilm> notesDuFilm = new ArrayList<NoteFilm>();

    public Film(String Nom, String LienFilm, String Synopsis, Integer Duree, DateTime DateDeSortie, String AnneeDeProduction, Float PrixAchat, Float PrixLocation, String linkAff, Personnalite real, ArrayList<Personnalite> actors, ArrayList<BandeAnnonce> BandeAnnonces, ArrayList<Photo> Photos, ArrayList<NoteFilm> notes) {
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

    public DateTime getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(DateTime DateDeSortie) {
        dateDeSortie = DateDeSortie;
    }

    /**
     * @pdOid c8329d13-f15c-44ae-95fb-a1e8af2b5464
     */
    public String getLienFilm() {
        return lienFilm;
    }

    /**
     * @pdOid ea1bd844-e6bb-456b-b2da-de0f09d5ed6a
     */
    public void setLienFilm(String LienFilm) {
        lienFilm = LienFilm;
    }

    /**
     * @pdOid 63329f02-2e06-40b4-8690-c91094e71695
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * @pdOid f4c95ef0-eb7c-4d7a-b948-3fa86c077a38
     */
    public void setSynopsis(String Synopsis) {
        synopsis = Synopsis;
    }

    /**
     * @pdOid 5b9f747b-80db-46b8-9819-676e5804dcf4
     */
    public String getAnneeDeProduction() {
        return anneeDeProduction;
    }

    /**
     * @param newAnneeDeProduction @pdOid c79fdeea-dc18-4edf-8cd3-f7a14c55b6b8
     */
    public void setAnneeDeProduction(String newAnneeDeProduction) {
        anneeDeProduction = newAnneeDeProduction;
    }

    /**
     * @pdOid ed1790f7-6fa8-4156-b0c0-b33cc8b61d52
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param newNom @pdOid 8a1d0441-f6ad-46d2-bf2e-fd40446dd914
     */
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

    public Float getPrixLocation() {
        return prixLocationJour;
    }

    public void setPrixLocation(Float prixLocation) {
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

    public ArrayList<Personnalite> getActeurs() {
        return acteurs;
    }

    public void setActeurs(ArrayList<Personnalite> actors) {
        acteurs = actors;
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