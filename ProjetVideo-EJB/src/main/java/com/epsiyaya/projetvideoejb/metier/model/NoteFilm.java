package com.epsiyaya.projetvideoejb.metier.model;

public class NoteFilm {

    private Utilisateur util;
    private Integer note;
    private String description;

    public NoteFilm(Utilisateur user, int n, String desc) {
        util = user;
        note = n;
        description = desc;
    }

    public Utilisateur getUtil() {
        return util;
    }

    public int getNote() {
        return note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        description = desc;
    }
}