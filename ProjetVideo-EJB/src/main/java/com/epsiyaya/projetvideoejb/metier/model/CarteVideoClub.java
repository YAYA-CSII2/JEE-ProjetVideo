package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;

public class CarteVideoClub implements Serializable {

    private static final long serialVersionUID = 3206093459760846969L;

    private String numeroCarteFidel;
    private Integer pointFidelite;
    private Utilisateur utilCarte;

    public CarteVideoClub() {
    }

    public CarteVideoClub(String num, Integer pts, Utilisateur util) {
        numeroCarteFidel = num;
        pointFidelite = pts;
        utilCarte = util;
    }

    public String getNumeroCarteFidel() {
        return numeroCarteFidel;
    }

    public void setNumeroCarteFidel(String num) {
        numeroCarteFidel = num;
    }

    public Integer getPointFidelite() {
        return pointFidelite;
    }

    public void setPointFidelite(Integer pts) {
        pointFidelite = pts;
    }

    public Utilisateur getUtilCarte() {
        return utilCarte;
    }

    public void setUtilCarte(Utilisateur util) {
        utilCarte = util;
    }
}
