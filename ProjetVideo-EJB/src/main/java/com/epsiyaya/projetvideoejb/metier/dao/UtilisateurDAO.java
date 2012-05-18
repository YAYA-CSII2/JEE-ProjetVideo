package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.Utilisateur;

public class UtilisateurDAO extends BaseHibernateDAO {

    public UtilisateurDAO() {
    }

    public void saveOrUpdate(Utilisateur utilisateur) {
        super.getSessionFactory().saveOrUpdate(utilisateur);
    }

    public void deleteUtilisateur(Utilisateur utilisateur) {
        super.getSessionFactory().delete(utilisateur);
    }

    public Object getUtilisateur(Integer idUtil) {
        return super.getSessionFactory().get(Utilisateur.class, idUtil);
    }
}
