package com.epsiyaya.projetvideoejb.metier.model;

public class BandeAnnonce {

    private String lienVideo;
    private String description;

    public BandeAnnonce(String link, String desc) {
        lienVideo = link;
        description = desc;
    }

    public String getLienVideo() {
        return lienVideo;
    }

    public void setLienVideo(String LienVideo) {
        lienVideo = LienVideo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        description = Description;
    }
}