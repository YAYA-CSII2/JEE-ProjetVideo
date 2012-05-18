package com.epsiyaya.projetvideoejb.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
/*import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;*/

public class HibernateUtil {
    
    private static final Session session = buildSessionFactory();
    
    private HibernateUtil() {
    }
    
    private static Session buildSessionFactory() {
        HibernateUtil hibernateUtil = new HibernateUtil();
        Configuration configuration = new Configuration();
        
        
        /*configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
        SessionFactory sf = configuration.buildSessionFactory(serviceRegistry);*/

        SessionFactory sf = configuration.configure().buildSessionFactory();

        return sf.openSession();
    }
    
    public static Session getSessionFactory() {
        return session;
    }
    
    public static void flushSession() {
        session.flush();
    }
}
