package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;

public class Utilisateur implements Serializable {
    
    private static final long serialVersionUID = 3206093459760846969L; 

    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String numeroCarteCredit;
    private String adresse;
    private String codePostale;
    private String pays;
    private Boolean roleAdministrateur;
    //private Set<FilmAchete> filmAchetes = new HashSet<FilmAchete>();
    //private Set<FilmLoue> filmLoues = new HashSet<FilmLoue>();

    public Utilisateur() {
    }

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String log) {
        login = log;
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

    public boolean getRoleAdministrateur() {
        return roleAdministrateur;
    }

    public void setRoleAdministrateur(Boolean RoleAdministrateur) {
        roleAdministrateur = RoleAdministrateur;
    }

    /*
     * public Set<FilmAchete> getFilmAchetes() { return filmAchetes; }
     *
     * public void setFilmAchetes(Set<FilmAchete> _filmAchetes) { filmAchetes =
     * _filmAchetes; }
     *
     * public Set<FilmLoue> getFilmLoues() { return filmLoues; }
     *
     * public void setFilmLoues(Set<FilmLoue> _filmLoues) { filmLoues =
     * _filmLoues; }
     */
}