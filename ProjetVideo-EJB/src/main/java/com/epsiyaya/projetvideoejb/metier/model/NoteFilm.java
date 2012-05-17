package com.epsiyaya.projetvideoejb.metier.model;

import java.io.Serializable;

public class NoteFilm implements Serializable {

    private Utilisateur util;
    private Integer note;
    private String description;

    public NoteFilm() {
    }

    public NoteFilm(Utilisateur user, int n, String desc) {
        util = user;
        note = n;
        description = desc;
    }

    public void setUtil(Utilisateur util) {
        this.util = util;
    }

    public Utilisateur getUtil() {
        return util;
    }

    public int getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        description = desc;
    }
}