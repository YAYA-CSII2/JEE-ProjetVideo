package com.epsiyaya.projetvideoejb.distant.bean;

import com.epsiyaya.projetvideoejb.distant.remote.IPannierSession;
import com.epsiyaya.projetvideoejb.metier.dao.FilmDAO;
import com.epsiyaya.projetvideoejb.metier.dao.PersonnaliteDAO;
import com.epsiyaya.projetvideoejb.metier.model.Film;
import com.epsiyaya.projetvideoejb.metier.model.Personnalite;
import com.epsiyaya.projetvideoejb.metier.model.Utilisateur;
import com.epsiyaya.projetvideoejb.util.HibernateUtil;
import javax.ejb.Stateful;
import org.joda.time.DateTime;

@Stateful
public class PanierBean implements IPannierSession {
    
    @Override
    public void test() {
        PersonnaliteDAO personnaliteDAO = new PersonnaliteDAO();
        personnaliteDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        FilmDAO filmDAO = new FilmDAO();
        filmDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        
        
        //Utilisateur user = new Utilisateur("login", "mdp", "nom", "prenom", "adresse", "codepostal", "pays", true);
        DateTime d = new DateTime();
        
        Personnalite perso = new Personnalite("nomPersonnalite", "prenomPersonnalite", d, "Description du mec");
        Personnalite perso2 = new Personnalite("nomPersonnalite2", "prenomPersonnalite2", d, "Description du mec2");
        Film f = new Film("NomDuFilm", "LienDuFilm", "Synopsis du film", 200, d, "2012", (float)20.2, (float)3.5, "leinAfficher", perso);
        f.addActeur(perso);
        f.addActeur(perso2);
        
        
        personnaliteDAO.saveOrUpdate(perso);
        personnaliteDAO.saveOrUpdate(perso2);
        filmDAO.saveOrUpdate(f);
        
        
        HibernateUtil.flushSession();
        
        for (Object o: f.getActeurs()) {
            Personnalite p = (Personnalite)o;
            System.out.println(p.getNom());
        }
        
        filmDAO.deleteFilm(f);
        personnaliteDAO.deletePerso(perso);
        personnaliteDAO.deletePerso(perso2);
        HibernateUtil.flushSession();
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
