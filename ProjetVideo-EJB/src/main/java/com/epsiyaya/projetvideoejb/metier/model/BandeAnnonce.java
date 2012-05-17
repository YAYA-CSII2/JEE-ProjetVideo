package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;

public class BandeAnnonce implements Serializable {

    private String lienVideo;
    private String description;
    //private Film monFilm;

    public BandeAnnonce() {
    }

    public BandeAnnonce(String link, String desc) {
        lienVideo = link;
        description = desc;
        // monFilm = MonFilm;
    }
    /*
     * public Film getMonFilm() { return monFilm; }
     *
     * public void setMonFilm(Film monFilm) { this.monFilm = monFilm;
    }
     */

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