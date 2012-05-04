package com.epsiyaya.projetvideoejb.metier.model;

import java.util.ArrayList;

public class Utilisateur {

    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String numeroCarteCredit;
    private String adresse;
    private String codePostale;
    private String pays;
    private Boolean roleAdministrateur;
    private Integer pointFidelite;
    private ArrayList<FilmAchete> filmAchetes = new ArrayList<FilmAchete>();
    private ArrayList<FilmLoue> filmLoues = new ArrayList<FilmLoue>();

    public Utilisateur(String Login, String MotDePasse, String Nom, String Prenom, String Adresse,
            String CodePostale, String Pays, Boolean RoleAdministrateur) {
        login = Login;
        motDePasse = MotDePasse;
        nom = Nom;
        prenom = Prenom;
        adresse = Adresse;
        codePostale = CodePostale;
        pays = Pays;
        roleAdministrateur = RoleAdministrateur;
    }

    public boolean isAdministrateur() {
        return roleAdministrateur;
    }

    public void setAdministrateur(Boolean RoleAdministrateur) {
        roleAdministrateur = RoleAdministrateur;
    }

    public int getPontFidelite() {
        return pointFidelite;
    }

    public void setPontFidelite(Integer _pointFidelite) {
        pointFidelite = _pointFidelite;
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String MotDePasse) {
        motDePasse = MotDePasse;
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

    public String getNumeroCarteCredit() {
        return numeroCarteCredit;
    }

    public void setNumeroCarteCredit(String NumeroCarteCredit) {
        numeroCarteCredit = NumeroCarteCredit;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String Adresse) {
        adresse = Adresse;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String CodePostale) {
        codePostale = CodePostale;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String Pays) {
        pays = Pays;
    }

    public ArrayList<FilmAchete> getFilmAchetes() {
        return filmAchetes;
    }

    public void setFilmAchetes(ArrayList<FilmAchete> _filmAchetes) {
        filmAchetes = _filmAchetes;
    }

    public ArrayList<FilmLoue> getFilmLoues() {
        return filmLoues;
    }

    public void setFilmLoues(ArrayList<FilmLoue> _filmLoues) {
        filmLoues = _filmLoues;
    }
}