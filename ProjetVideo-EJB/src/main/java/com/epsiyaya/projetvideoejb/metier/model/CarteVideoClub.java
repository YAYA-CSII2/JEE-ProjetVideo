/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epsiyaya.projetvideoejb.metier.model;

/**
 *
 * @author BaLoU
 */
public class CarteVideoClub {
    private String numeroCarteFidel;
    private Integer pointFidelite;

    public CarteVideoClub(String numeroCarteFidel, Integer pointFidelite) {
        this.numeroCarteFidel = numeroCarteFidel;
        this.pointFidelite = pointFidelite;
    }

    public String getNumeroCarteFidel() {
        return numeroCarteFidel;
    }

    public void setNumeroCarteFidel(String numeroCarteFidel) {
        this.numeroCarteFidel = numeroCarteFidel;
    }

    public Integer getPointFidelite() {
        return pointFidelite;
    }

    public void setPointFidelite(Integer pointFidelite) {
        this.pointFidelite = pointFidelite;
    }
    
    
}
