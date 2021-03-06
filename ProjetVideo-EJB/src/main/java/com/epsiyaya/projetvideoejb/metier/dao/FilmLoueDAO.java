package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.FilmLoue;

public class FilmLoueDAO extends BaseHibernateDAO {

    public FilmLoueDAO() {
    }

    public void saveOrUpdate(FilmLoue filmLoue) {
        super.getSessionFactory().saveOrUpdate(filmLoue);
    }

    public void deleteFilmLoue(FilmLoue filmLoue) {
        super.getSessionFactory().delete(filmLoue);
    }
    
    public Object getFilmLoue(Integer idFilm) {
        return super.getSessionFactory().get(FilmLoue.class, idFilm);
    }
}