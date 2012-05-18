package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;

public class Photo implements Serializable {

    private static final long serialVersionUID = 3206093459760846969L;
    private String lienPhoto;
    private String description;

    public Photo() {
    }

    public Photo(String link, String uneDescription) {
        lienPhoto = link;
        description = uneDescription;
    }

    public String getLienPhoto() {
        return lienPhoto;
    }

    public void setLienPhoto(String LienPhoto) {
        lienPhoto = LienPhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}