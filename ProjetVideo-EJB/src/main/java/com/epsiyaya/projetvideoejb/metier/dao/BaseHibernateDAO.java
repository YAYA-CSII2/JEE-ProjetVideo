package com.epsiyaya.projetvideoejb.metier.dao;

import org.hibernate.Session;

public class BaseHibernateDAO {

    private Session session;
    
    public BaseHibernateDAO() {
    }
    
    public Session getSessionFactory() {
        return session;
    }
    
    public void setSessionFactory(Session s) {
        session = s;
    }
}
