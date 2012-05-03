package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  Film.java
 * Author:  MisterGamer
 * Purpose: Defines the Class Film
 ***********************************************************************/

import java.util.*;

/** @pdOid 7d0ef445-cbbc-4b7e-a4d6-611401e2fc38 */
public class Film {

   private String nom;
   /** @pdOid 2c8fe78d-8221-4452-969f-7c33b0554bfc */
   private String synopsis;
   /** @pdOid 04e78037-6633-4f90-92ee-48bd07b3e686 */
   private Date dateDeSortie;
   /** @pdOid a15771d0-a697-4f8b-9415-b0e067fc830c */
   private int duree;
   /** @pdOid 064df2cb-d8a6-485f-bc21-23d92906bb8f */
   private String lienFilm;
   /** @pdOid b4a7de94-2f06-4a8e-8dec-db3cbfbe5de0 */
   private String anneeDeProduction;
   /** @pdOid 0055820a-aa8e-45ea-8fed-62ef1b3b9026 */
   private Float prixAchat;
   /** @pdOid a82dca18-bcb1-467d-a88e-fb6f00cb0326 */
   private Float prixLocation;
   
   private ArrayList<BandeAnnonce> bandeAnnonces;
   private ArrayList<Photo> photos;
   
   private ArrayList<Categorie> categorie;
   private Photo affiche;
   
   /** @pdOid 278f0dc7-a585-4746-bf7b-546b2b3fee0b */
   public int getDuree() {
      return duree;
   }
   
   /** @pdOid 01d9e014-920b-44ca-b72e-f5cf4ec632b1 */
   public void setDuree(int Duree) {
      duree = Duree;
   }
   
   
   /** @pdOid 41457181-171f-4878-afc4-c20fe1ab883a */
   public Date getDateDeSortie() {
      return dateDeSortie;
   }
   

   /** @pdOid bc9f4a63-462b-46e1-9789-c45fb3dc463c */
   public void setDateDeSortie(Date DateDeSortie) {
      dateDeSortie = DateDeSortie;
   }
   
   /** @pdOid c8329d13-f15c-44ae-95fb-a1e8af2b5464 */
   public String getLienFilm() {
      return lienFilm;
   }
   

   /** @pdOid ea1bd844-e6bb-456b-b2da-de0f09d5ed6a */
   public void setLienFilm(String LienFilm) {
      lienFilm = LienFilm;
   }
   
   /** @pdOid 63329f02-2e06-40b4-8690-c91094e71695 */
   public String getSynopsis() {
      return synopsis;
   }
   
   
   /**@pdOid f4c95ef0-eb7c-4d7a-b948-3fa86c077a38 */
   public void setSynopsis(String Synopsis) {
      synopsis = Synopsis;
   }
   
   /** @pdOid 5b9f747b-80db-46b8-9819-676e5804dcf4 */
   public String getAnneeDeProduction() {
      return anneeDeProduction;
   }
   
   /** @param newAnneeDeProduction
    * @pdOid c79fdeea-dc18-4edf-8cd3-f7a14c55b6b8 */
   public void setAnneeDeProduction(String newAnneeDeProduction) {
      anneeDeProduction = newAnneeDeProduction;
   }
   
   /** @pdOid ed1790f7-6fa8-4156-b0c0-b33cc8b61d52 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 8a1d0441-f6ad-46d2-bf2e-fd40446dd914 */
   public void setNom(String newNom) {
      nom = newNom;
   }

    public ArrayList getBandeDannoce() {
        return bandeAnnonces;
    }

    public void setBandeDannoce(ArrayList bandeDannoce) {
        this.bandeAnnonces = bandeDannoce;
    }

    public Float getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(Float prixLocation) {
        this.prixLocation = prixLocation;
    }
   
   /** @pdOid 21d1db8e-23cb-4404-b6de-d003b1a33820 */
   public Film() {
      // TODO: implement
       bandeAnnonces = new ArrayList();
       photos= new ArrayList();
   }
   
   public Film(String Nom, String LienFilm, String Synopsis, int Duree, Date DateDeSortie, String AnneeDeProduction, Float PrixAchat, Float PrixLocation, ArrayList<BandeAnnonce> BandeAnnonces, ArrayList<Photo> Photos, Photo Affiche) {
       nom= Nom;
       lienFilm=LienFilm;
       synopsis=Synopsis;
       duree=Duree;
       dateDeSortie=DateDeSortie;
       anneeDeProduction=AnneeDeProduction;
       prixAchat=PrixAchat;
       prixLocation=PrixLocation;
       bandeAnnonces= BandeAnnonces;
       photos=Photos;
       affiche=Affiche;
   }

    public Photo getAffiche() {
        return affiche;
    }

    public void setAffiche(Photo affiche) {
        this.affiche = affiche;
    }

    public ArrayList<BandeAnnonce> getBandeAnnonces() {
        return bandeAnnonces;
    }

    public void setBandeAnnonces(ArrayList<BandeAnnonce> bandeAnnonces) {
        this.bandeAnnonces = bandeAnnonces;
    }

    public ArrayList<Categorie> getCategorie() {
        return categorie;
    }

    public void setCategorie(ArrayList<Categorie> categorie) {
        this.categorie = categorie;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }
   
   public void ajouterBandeAnnoce(BandeAnnonce Bandeannonce)
   {
       bandeAnnonces.add(Bandeannonce);
   }
   
   public void supprimerBandeAnnonce(BandeAnnonce Bandeannonce)
   {
       bandeAnnonces.remove(Bandeannonce);
   }
   
   public void ajouterPhoto(Photo photo)
   {
       photos.add(photo);
   }
   
   public void SupprimerPhoto(Photo photo)
   {
       photos.remove(photo);
   }
   
   

}