package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.Personnalite;

public class PersonnaliteDAO extends BaseHibernateDAO {

    public PersonnaliteDAO() {
    }

    public void saveOrUpdate(Personnalite perso) {
        super.getSessionFactory().saveOrUpdate(perso);
    }

    public void deletePerso(Personnalite perso) {
        super.getSessionFactory().delete(perso);
    }
}
