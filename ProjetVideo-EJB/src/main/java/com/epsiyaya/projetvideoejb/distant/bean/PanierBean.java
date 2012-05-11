package com.epsiyaya.projetvideoejb.distant.bean;

import com.epsiyaya.projetvideoejb.distant.remote.IPannierSession;
import com.epsiyaya.projetvideoejb.metier.dao.FilmDAO;
import com.epsiyaya.projetvideoejb.metier.dao.PersonnaliteDAO;
import com.epsiyaya.projetvideoejb.metier.model.Film;
import com.epsiyaya.projetvideoejb.metier.model.Personnalite;
import com.epsiyaya.projetvideoejb.metier.model.Utilisateur;
import com.epsiyaya.projetvideoejb.metier.dao.UtilisateurDAO;
import com.epsiyaya.projetvideoejb.metier.model.BandeAnnonce;
import com.epsiyaya.projetvideoejb.metier.dao.BandeAnnonceDAO;
import com.epsiyaya.projetvideoejb.metier.model.Categorie;
import com.epsiyaya.projetvideoejb.metier.dao.CategorieDAO;
import com.epsiyaya.projetvideoejb.metier.model.FilmLoue;
import com.epsiyaya.projetvideoejb.metier.dao.FilmLoueDAO;
import com.epsiyaya.projetvideoejb.util.HibernateUtil;
import java.util.HashSet;
import javax.ejb.Stateful;
import org.joda.time.DateTime;
import java.util.Set;

@Stateful
public class PanierBean implements IPannierSession {
    
    @Override
    public void test() {
        PersonnaliteDAO personnaliteDAO = new PersonnaliteDAO();
        UtilisateurDAO utilisateurDAO= new UtilisateurDAO();
        FilmDAO filmDAO = new FilmDAO();
        BandeAnnonceDAO bandeAnnonceDAO= new BandeAnnonceDAO();
        CategorieDAO categorieDAO= new CategorieDAO();
        FilmLoueDAO filmLoueDAO= new FilmLoueDAO();
        
        
        personnaliteDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        filmDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        utilisateurDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        bandeAnnonceDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        categorieDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        filmLoueDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        
        
        //Utilisateur user = new Utilisateur("login", "mdp", "nom", "prenom", "adresse", "codepostal", "pays", true);
        DateTime d = new DateTime();
        
        Personnalite perso = new Personnalite("nomPersonnalite", "prenomPersonnalite", d, "Description du mec");
        Personnalite perso2 = new Personnalite("nomPersonnalite2", "prenomPersonnalite2", d, "Description du mec2");
        Film f = new Film("NomDuFilm", "LienDuFilm", "Synopsis du film", 200, d, "2012", (float)20.2, (float)3.5, "leinAfficher", perso);
        Utilisateur utilisateur= new Utilisateur("root", "root", "root", "root", "root", "root", "root", Boolean.FALSE);
        BandeAnnonce bandeAnnonce= new BandeAnnonce("c\\:azerty", "azerty", f);
        BandeAnnonce bandeAnnonce2= new BandeAnnonce("c\\:azerty", "azerty", f);
        Categorie categorie= new Categorie("Action");
        FilmLoue filmLoue= new FilmLoue(f, utilisateur, d, Integer.SIZE);
        
        
        
        f.addActeur(perso);
        f.addActeur(perso2);
        f.ajouterBandeAnnoce(bandeAnnonce);
        f.ajouterBandeAnnoce(bandeAnnonce2);
        
        
        personnaliteDAO.saveOrUpdate(perso);
        personnaliteDAO.saveOrUpdate(perso2);
        filmDAO.saveOrUpdate(f);
        utilisateurDAO.saveOrUpdate(utilisateur);
        bandeAnnonceDAO.saveOrUpdate(bandeAnnonce);
        categorieDAO.saveOrUpdate(categorie);
        filmLoueDAO.saveOrUpdate(filmLoue);
        
        //Effectuer toutes les requetes précédentes sur la BDD
        HibernateUtil.flushSession();
        
        for (Object o: f.getActeurs()) {
            Personnalite p = (Personnalite)o;
            System.out.println(p.getNom());
        }
        for (Object o: f.getBandeAnnonces()) {
            BandeAnnonce b = (BandeAnnonce)o;
            System.out.println(b.getDescription());
        }
        System.out.println(utilisateur.getNom());
        System.out.println(categorie.getNom());
        System.out.println(filmLoue.getDuree());
        
        
        
        filmDAO.deleteFilm(f);
        personnaliteDAO.deletePerso(perso);
        personnaliteDAO.deletePerso(perso2);
        utilisateurDAO.deleteUtilisateur(utilisateur);
        bandeAnnonceDAO.deleteBandeAnnonce(bandeAnnonce);
        bandeAnnonceDAO.deleteBandeAnnonce(bandeAnnonce2);
        categorieDAO.deleteCategorie(categorie);
        filmLoueDAO.deleteFilmLoue(filmLoue);
        
        
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
