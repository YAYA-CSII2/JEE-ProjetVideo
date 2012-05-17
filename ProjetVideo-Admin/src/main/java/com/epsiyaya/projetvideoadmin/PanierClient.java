package com.epsiyaya.projetvideoadmin;

import com.epsiyaya.projetvideoejb.distant.remote.IFilmLoueSession;
import com.epsiyaya.projetvideoejb.distant.remote.IPannierSession;
import com.epsiyaya.projetvideoejb.metier.model.FilmLoue;
import java.util.HashSet;
import java.util.Set;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;


public class PanierClient {

    public static final String DEFAULT_JNDI_NAME = "com.epsiyaya.projetvideoejb.distant.remote.IFilmLoueSession";

    public static void main(String[] args) {
        try {
            Context context = new InitialContext();

            Object obj = context.lookup(DEFAULT_JNDI_NAME);

            IFilmLoueSession flSession = (IFilmLoueSession) PortableRemoteObject.narrow(obj, IFilmLoueSession.class);
            
            flSession.getTenLast();
            
        } catch (NamingException nex) {
            nex.printStackTrace();
        }

    }
}