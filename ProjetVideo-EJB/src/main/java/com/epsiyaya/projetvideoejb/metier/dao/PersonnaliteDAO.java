package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.Personnalite;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class PersonnaliteDAO {

    private SessionFactory session;

    public PersonnaliteDAO() {
    }
    
    private SessionFactory getSessionFactory() {
        return session;
    }

    public void setSessionFactory(SessionFactory sf) {
        session = sf;
    }

    public Personnalite saveIt(Personnalite perso) {
        Session s = session.getCurrentSession();
        s.save(perso);
        return perso;
    }

    /*public Personnalite getById(Integer id) {
        Personnalite perso = (Personnalite) session.get(Personnalite.class, id);
        return perso;
    }*/
}
