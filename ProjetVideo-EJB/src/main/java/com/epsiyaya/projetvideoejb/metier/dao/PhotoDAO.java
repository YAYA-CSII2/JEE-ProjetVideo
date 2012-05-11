package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.Photo;

public class PhotoDAO extends BaseHibernateDAO {

    public PhotoDAO() {
    }

    public void saveOrUpdate(Photo photo) {
        super.getSessionFactory().saveOrUpdate(photo);
    }

    public void deletePerso(Photo photo) {
        super.getSessionFactory().delete(photo);
    }
}
