
package com.epsiyaya.projetvideoejb.metier.dao;

import com.epsiyaya.projetvideoejb.metier.model.CarteVideoClub;


/**
 *
 * @author BaLoU
 */
public class CarteVideoClubDAO extends BaseHibernateDAO{

    public CarteVideoClubDAO() {
    }
    
    public void saveOrUpdate(CarteVideoClub carteVideo) {
        super.getSessionFactory().saveOrUpdate(carteVideo);
    }
        
    public void deleteCarteVideoClub(CarteVideoClub carteVideo) {
        super.getSessionFactory().delete(carteVideo);
    }
    
}
