package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.BandeAnnonce;

public class BandeAnnonceDAO extends BaseHibernateDAO {

    public BandeAnnonceDAO() {
    }

    public void saveOrUpdate(BandeAnnonce bandeAnnonce) {
        super.getSessionFactory().saveOrUpdate(bandeAnnonce);
    }
        
    public void deleteUtilisateur(BandeAnnonce bandeAnnonce) {
        super.getSessionFactory().delete(bandeAnnonce);
    }


}
