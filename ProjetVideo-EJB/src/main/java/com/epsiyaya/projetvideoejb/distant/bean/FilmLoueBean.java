package com.epsiyaya.projetvideoejb.distant.bean;

import com.epsiyaya.projetvideoejb.distant.remote.IFilmLoueSession;
import com.epsiyaya.projetvideoejb.metier.dao.FilmLoueDAO;
import com.epsiyaya.projetvideoejb.metier.model.FilmLoue;
import com.epsiyaya.projetvideoejb.util.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateless
public class FilmLoueBean implements IFilmLoueSession {

    @Override
    public FilmLoue getTenLast() {
        FilmLoueDAO flDAO = new FilmLoueDAO();

        flDAO.setSessionFactory(HibernateUtil.getSessionFactory());

        FilmLoue fl = (FilmLoue) flDAO.getFilmLoue(25);

        Set<FilmLoue> t = new HashSet<FilmLoue>();
        t.add(fl);

        for (FilmLoue fl2 : t) {
            System.out.println("Film: " + fl2.getMonFilmLoue().getNom());
        }
        
        return fl;
    }
}
