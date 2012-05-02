package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  Film.java
 * Author:  MisterGamer
 * Purpose: Defines the Class Film
 ***********************************************************************/

import java.util.*;

/** @pdOid 7d0ef445-cbbc-4b7e-a4d6-611401e2fc38 */
public class Film {
   /** @pdOid 1bcc4e67-d0ef-45f4-b0ce-18535a6a3a2b */
   private String reference;
   /** @pdOid cb5996f1-b369-4ac0-a319-53fb63842105 */
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
   
   /** @pdOid 278f0dc7-a585-4746-bf7b-546b2b3fee0b */
   public int getDuree() {
      return duree;
   }
   
   /** @param newDuree
    * @pdOid 01d9e014-920b-44ca-b72e-f5cf4ec632b1 */
   public void setDuree(int newDuree) {
      duree = newDuree;
   }
   
   /** @pdOid e451d6ae-e4f4-407a-ac56-5b3c6958d698 */
   public String getReference() {
      return reference;
   }
   
   /** @param newReference
    * @pdOid 8ffddd36-2a3f-4689-8f6d-f52b9fc850aa */
   public void setReference(String newReference) {
      reference = newReference;
   }
   
   /** @pdOid 41457181-171f-4878-afc4-c20fe1ab883a */
   public Date getDateDeSortie() {
      return dateDeSortie;
   }
   
   /** @param newDateDeSortie
    * @pdOid bc9f4a63-462b-46e1-9789-c45fb3dc463c */
   public void setDateDeSortie(Date newDateDeSortie) {
      dateDeSortie = newDateDeSortie;
   }
   
   /** @pdOid c8329d13-f15c-44ae-95fb-a1e8af2b5464 */
   public String getLienFilm() {
      return lienFilm;
   }
   
   /** @param newLienFilm
    * @pdOid ea1bd844-e6bb-456b-b2da-de0f09d5ed6a */
   public void setLienFilm(String newLienFilm) {
      lienFilm = newLienFilm;
   }
   
   /** @pdOid 63329f02-2e06-40b4-8690-c91094e71695 */
   public String getSynopsis() {
      return synopsis;
   }
   
   /** @param newSynopsis
    * @pdOid f4c95ef0-eb7c-4d7a-b948-3fa86c077a38 */
   public void setSynopsis(String newSynopsis) {
      synopsis = newSynopsis;
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
   
   /** @pdOid 21d1db8e-23cb-4404-b6de-d003b1a33820 */
   public Film() {
      // TODO: implement
   }
   
   public Film(String Nom, String LienFilm, String Synopsis, int Duree, Date DateDeSortie, String AnneeDeProduction, Float PrixAchat, Float PrixLocation) {
      // TODO: implement
       reference=Nom+DateDeSortie.toString();
       nom= Nom;
       lienFilm=LienFilm;
       synopsis=Synopsis;
       duree=Duree;
       dateDeSortie=DateDeSortie;
       anneeDeProduction=AnneeDeProduction;
       prixAchat=PrixAchat;
       prixLocation=PrixLocation;
   }
   

}