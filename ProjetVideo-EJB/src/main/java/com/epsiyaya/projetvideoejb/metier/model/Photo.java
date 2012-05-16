package com.epsiyaya.projetvideoejb.metier.model;

public class Photo {

    private String lienPhoto;
    private String description;

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