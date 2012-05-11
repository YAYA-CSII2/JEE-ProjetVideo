package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.FilmAchete;

public class FilmAcheteDAO extends BaseHibernateDAO {

    public FilmAcheteDAO() {
    }

    public void saveOrUpdate(FilmAcheteDAO FilmAchete) {
        super.getSessionFactory().saveOrUpdate(FilmAchete);
    }
        public void deleteFilmAchete(FilmAcheteDAO FilmAchete) {
        super.getSessionFactory().delete(FilmAchete);
    }
}