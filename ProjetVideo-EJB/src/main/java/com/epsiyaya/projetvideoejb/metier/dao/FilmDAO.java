package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.Film;

public class FilmDAO extends BaseHibernateDAO {

    public FilmDAO() {
    }

    public void saveOrUpdate(Film film) {
        super.getSessionFactory().saveOrUpdate(film);
    }
        
    public void deleteFilm(Film film) {
        super.getSessionFactory().delete(film);
    }

    /*
     * public Personnalite getById(Integer id) { Personnalite perso =
     * (Personnalite) session.get(Personnalite.class, id); return perso; }
     */
}
