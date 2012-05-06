package com.epsiyaya.projetvideoejb.distant.bean;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Map;
import java.util.HashMap;
import com.epsiyaya.projetvideoejb.distant.remote.IPannierSession;
import com.epsiyaya.projetvideoejb.metier.dao.ProduitDAO;
import com.epsiyaya.projetvideoejb.metier.model.Film;
import com.epsiyaya.projetvideoejb.metier.model.Personnalite;
import com.epsiyaya.projetvideoejb.metier.model.Utilisateur;
import javax.ejb.Stateful;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.joda.time.DateTime;

@Stateful
public class PanierBean implements IPannierSession {
    
    @Override
    public void test() {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();
        
        //Utilisateur t = new Utilisateur("login", "mdp", "nom", "prenom", "adresse", "codepostal", "pays", true);
        DateTime d = new DateTime();
        
        Personnalite perso = new Personnalite("nomPersonnalite", "prenomPersonnalite", d, "Description du mec");
        Personnalite perso2 = new Personnalite("nomPersonnalite2", "prenomPersonnalite2", d, "Description du mec2");
        Film f = new Film("NomDuFilm", "LienDuFilm", "Synopsis du film", 200, d, "2012", (float)20.2, (float)3.5, "leinAfficher", perso);
        f.addActeur(perso);
        f.addActeur(perso2);
        
        Session session = factory.openSession();
        session.save(perso);
        session.save(perso2);
        session.save(f);
        session.flush();
        
        for (Object o: f.getActeurs()) {
            Personnalite p = (Personnalite)o;
            System.out.println(p.getNom());
        }
        
        session.delete(f);
        session.flush();
    }
    
    
    
    /*ProduitDAO pdao = new ProduitDAO();
    Map<Integer, ElementPanier> panier = new HashMap<Integer, ElementPanier>();
    int clientId;

    @Resource(mappedName="J2EProjetVideo") DataSource ds;

    @Override
    public Map<Integer, ElementPanier> getPannier(int id_cli) {
        clientId = id_cli;
        panier = pdao.getPannier(ds, id_cli);
        return panier;
    }

    @Override
    public void addProduit(int idProduit, int quantitee) {
        float prixTotal;
        ElementPanier ep = panier.get(idProduit);

        if (ep == null) {
            prixTotal = quantitee * pdao.getProduit(ds, idProduit).getPrix();
            ep = new ElementPanier(idProduit, quantitee, prixTotal);
            panier.put(idProduit, ep);
        } else {
            ep.setQuantite(ep.getQuantite() + quantitee);
            ep.setPrix(ep.getQuantite() * pdao.getProduit(ds, idProduit).getPrix());
        }
    }

    @Override
    public void removeProduit(int idProduit, int quantitee) {
        ElementPanier ep = panier.get(idProduit);

        if (quantitee >= ep.getQuantite()) {
            panier.remove(idProduit);
        } else {
            ep.setQuantite(ep.getQuantite() - quantitee);
            ep.setPrix(ep.getQuantite() * pdao.getProduit(ds, idProduit).getPrix());
        }
    }

    @Override
    public void validerPanier() {
        pdao.deletePanier(ds, clientId);

        for (ElementPanier ep : panier.values()) {
            pdao.addToPanier(ds, ep, clientId);
        }
    }*/

}
