package com.epsiyaya.projetvideoejb.metier.model;

public class Photo {

    private String lienPhoto;

    public Photo(String link) {
        lienPhoto = link;
    }

    public String getLienPhoto() {
        return lienPhoto;
    }

    public void setLienPhoto(String LienPhoto) {
        lienPhoto = LienPhoto;
    }
}