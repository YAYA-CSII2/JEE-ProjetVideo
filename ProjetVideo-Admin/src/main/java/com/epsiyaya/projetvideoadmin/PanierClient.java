package com.epsiyaya.projetvideoadmin;

import com.epsiyaya.projetvideoejb.distant.remote.IFilmLoueSession;
import com.epsiyaya.projetvideoejb.distant.remote.IPannierSession;
import com.epsiyaya.projetvideoejb.metier.model.*;
import java.util.HashSet;
import java.util.Set;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

public class PanierClient {

    public static final String DEFAULT_JNDI_NAME = "com.epsiyaya.projetvideoejb.distant.remote.IPannierSession";

    public static void main(String[] args) {
        try {
            IPannierSession flSession = (IPannierSession) new InitialContext().lookup(DEFAULT_JNDI_NAME);


            Utilisateur util = flSession.getUtil();
            System.out.println("Nom: " + util.getNom());
            Film f = flSession.getTenLast();
            System.out.println("Nom film: " + f.getNom());
            System.out.println("Nom relisateur: " + f.getRealisateur().getNom());
            for (Object o : f.getActeurs()) {
                Personnalite acteur = (Personnalite) o;
                System.out.println("Nom acteur: " + acteur.getNom());
            }
            for (Object o : f.getBandeAnnonces()) {
                BandeAnnonce bd = (BandeAnnonce) o;
                System.out.println("LienVideo: " + bd.getLienVideo());
            }
            for (Object o : f.getCategories()) {
                Categorie categ = (Categorie) o;
                System.out.println("Categorie: " + categ.getNom());
            }
            for (Object o : f.getNotesDuFilm()) {
                NoteFilm nf = (NoteFilm) o;
                System.out.println("Note Film: " + nf.getNote());
            }
            for (Object o : f.getPhotos()) {
                Photo ph = (Photo) o;
                System.out.println("LienPhoto: " + ph.getLienPhoto());
            }
            /*
             * for (Object object : t) { FilmLoue fl = (FilmLoue)object; }
             */

        } catch (NamingException nex) {
            nex.printStackTrace();
        }

    }
}