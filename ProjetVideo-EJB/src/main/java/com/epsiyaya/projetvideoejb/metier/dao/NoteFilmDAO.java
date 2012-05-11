package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.NoteFilm;

public class NoteFilmDAO extends BaseHibernateDAO {

    public NoteFilmDAO() {
    }

    public void saveOrUpdate(NoteFilm noteFilm) {
        super.getSessionFactory().saveOrUpdate(noteFilm);
    }
        public void deleteNoteFilm(NoteFilm noteFilm) {
        super.getSessionFactory().delete(noteFilm);
    }
}