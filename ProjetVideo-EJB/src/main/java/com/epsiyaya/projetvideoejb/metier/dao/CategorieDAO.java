package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.Categorie;

public class CategorieDAO extends BaseHibernateDAO {

    public CategorieDAO() {
    }

    public void saveOrUpdate(Categorie categorie) {
        super.getSessionFactory().saveOrUpdate(categorie);
    }
        
    public void deleteCategorie(Categorie categorie) {
        super.getSessionFactory().delete(categorie);
    }

}
