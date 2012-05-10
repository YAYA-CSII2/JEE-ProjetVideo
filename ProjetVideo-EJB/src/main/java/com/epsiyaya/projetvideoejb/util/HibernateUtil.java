package com.epsiyaya.projetvideoejb.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final Session session = buildSessionFactory();

    private HibernateUtil() {
    }

    private static Session buildSessionFactory() {
        HibernateUtil hibernateUtil = new HibernateUtil();
        Configuration config = new Configuration();

        SessionFactory sf = config.configure().buildSessionFactory();

        return sf.openSession();
    }

    public static Session getSessionFactory() {
        return session;
    }

    public static void flushSession() {
        session.flush();
    }
}