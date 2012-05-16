package com.epsiyaya.projetvideoejb.distant.bean;

import com.epsiyaya.projetvideoejb.distant.remote.IPannierSession;
import com.epsiyaya.projetvideoejb.metier.dao.*;
import com.epsiyaya.projetvideoejb.metier.model.*;
import com.epsiyaya.projetvideoejb.util.HibernateUtil;
import java.util.HashSet;
import javax.ejb.Stateful;
import org.joda.time.DateTime;
import java.util.Set;

@Stateful
public class PanierBean implements IPannierSession {
    
    @Override
    public void test() {
      //  PersonnaliteDAO personnaliteDAO = new PersonnaliteDAO();
        UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
      //  FilmDAO filmDAO = new FilmDAO();
       // NoteFilmDAO uneNoteDAO = new NoteFilmDAO();
        CarteVideoClubDAO uneCarteDAO = new CarteVideoClubDAO();
      //  PhotoDAO photoDAO = new PhotoDAO();
   //     BandeAnnonceDAO bandeAnnonceDAO= new BandeAnnonceDAO();
    //   CategorieDAO categorieDAO= new CategorieDAO();
       //FilmLoueDAO filmLoueDAO= new FilmLoueDAO();
        
        
      //  personnaliteDAO.setSessionFactory(HibernateUtil.getSessionFactory());
      //  filmDAO.setSessionFactory(HibernateUtil.getSessionFactory());
      //  photoDAO.setSessionFactory(HibernateUtil.getSessionFactory());
     //   uneNoteDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        utilisateurDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        uneCarteDAO.setSessionFactory(HibernateUtil.getSessionFactory());

     //   bandeAnnonceDAO.setSessionFactory(HibernateUtil.getSessionFactory());
      //  categorieDAO.setSessionFactory(HibernateUtil.getSessionFactory());
       // filmLoueDAO.setSessionFactory(HibernateUtil.getSessionFactory());
        
        
        Utilisateur user = new Utilisateur("login", "mdp", "nom", "prenom", "adresse", "codepostal", "pays", true);
        DateTime d = new DateTime();
        CarteVideoClub uneCarte = new CarteVideoClub("7897878765", 10);
        user.setCarteVideoClub(uneCarte);
        
      //  Personnalite perso = new Personnalite("nomPersonnalite", "prenomPersonnalite", d, "Description du mec");
      //  Personnalite perso2 = new Personnalite("nomPersonnalite2", "prenomPersonnalite2", d, "Description du mec2");
       // Film f = new Film("NomDuFilm", "LienDuFilm", "Synopsis du film", 200, d, "2012", (float)20.2, (float)3.5, "leinAfficher", perso);
      //  Utilisateur utilisateur= new Utilisateur("root", "root", "root", "root", "root", "root", "root", Boolean.FALSE);*/
       // BandeAnnonce bandeAnnonce= new BandeAnnonce("c\\:azerty", "azerty");
       // BandeAnnonce bandeAnnonce2= new BandeAnnonce("c\\:yooouuuuppii", "j aime le caca");
       // HashSet desBandeAnnonces = new HashSet();
       // desBandeAnnonces.add(bandeAnnonce);
       // Categorie categorieAction= new Categorie("Action");
       // HashSet desCategories = new HashSet();
       // desCategories.add(categorieAction);
        
        //HashSet desActeurs = new HashSet();
        //desActeurs.add(perso);
       // desActeurs.add(perso2);
      //  Photo unePhoto = new Photo("lien photo", "une photo comme les autres");
      //  HashSet desPhotos = new HashSet();
       // desPhotos.add(unePhoto);
        
    //     NoteFilm uneNote = new NoteFilm(user, 8, "un bon film");
    //    HashSet desNotes = new HashSet();
    //    desNotes.add(uneNote);
        
        
    //    Film unFilm = new Film("Un poulet", desNotes);
        
    //    DateTime uneDate = new DateTime();
    //    unFilm.setDateTimeDeSortie(uneDate);
        
       // FilmLoue filmLoue= new FilmLoue(f, utilisateur, d, Integer.SIZE);
        
        
        
      //  f.addActeur(perso);
       // f.addActeur(perso2);
       // f.ajouterBandeAnnoce(bandeAnnonce);
       // f.ajouterBandeAnnoce(bandeAnnonce2);
        
        
        
       // personnaliteDAO.saveOrUpdate(perso2);
       // filmDAO.saveOrUpdate(f);
       // categorieDAO.saveOrUpdate(categorieAction);
    //    filmDAO.saveOrUpdate(unFilm);
       // bandeAnnonceDAO.saveOrUpdate(bandeAnnonce);
       // photoDAO.saveOrUpdate(unePhoto);
     //   uneNoteDAO.saveOrUpdate(uneNote);
        uneCarteDAO.saveOrUpdate(uneCarte);
        utilisateurDAO.saveOrUpdate(user);
        
        
       /* categorieDAO.saveOrUpdate(categorie);
        filmLoueDAO.saveOrUpdate(filmLoue);*/
        
        //Effectuer toutes les requetes précédentes sur la BDD
        HibernateUtil.flushSession();
        
       /* for (Object o: f.getActeurs()) {
            Personnalite p = (Personnalite)o;
            System.out.println(p.getNom());
        }*/
      /*  for (Object o: f.getBandeAnnonces()) {
            BandeAnnonce b = (BandeAnnonce)o;
            System.out.println(b.getDescription());
        }
        /*System.out.println(utilisateur.getNom());
        System.out.println(categorie.getNom());
        System.out.println(filmLoue.getDuree());*/
        
        
        
       /* filmDAO.deleteFilm(f);
        personnaliteDAO.deletePerso(perso);
        personnaliteDAO.deletePerso(perso2);
        utilisateurDAO.deleteUtilisateur(utilisateur);*/
       // bandeAnnonceDAO.deleteBandeAnnonce(bandeAnnonce);
       // bandeAnnonceDAO.deleteBandeAnnonce(bandeAnnonce2);
      /*  categorieDAO.deleteCategorie(categorie);
        filmLoueDAO.deleteFilmLoue(filmLoue);*/
        
        
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
