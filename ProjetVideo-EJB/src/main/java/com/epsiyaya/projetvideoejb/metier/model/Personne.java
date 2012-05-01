package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  Personne.java
 * Author:  MisterGamer
 * Purpose: Defines the Class Personne
 ***********************************************************************/

import java.util.*;

/** @pdOid 40982581-5428-4fc0-86ea-37b0c896ce00 */
public class Personne {
   /** @pdOid b3081544-3216-44d2-a5de-6f228827abf8 */
   private String nom;
   /** @pdOid 59badf83-a307-48dd-9632-760d767c8c3b */
   private String prenom;
   /** @pdOid 0cfb73aa-543c-4615-a445-2baa51315be9 */
   private Date dateDeNaissance;
   /** @pdOid 724e39db-6f7d-43d7-a44d-1f687d3b5bff */
   private String description;
   
   /** @pdOid ece00660-a66c-4b0f-981b-a7821d167e98 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 1d9266d0-5107-4696-adc7-270213272ef9 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid e97db204-b043-4dca-bf38-7e697c8a852d */
   public String getPrenom() {
      return prenom;
   }
   
   /** @param newPrenom
    * @pdOid acf3a371-f99d-455b-bd42-3c3b5c5394f0 */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   /** @pdOid c2f0060b-c741-4362-a6b0-fd619e6ebacf */
   public Date getDateDeNaissance() {
      return dateDeNaissance;
   }
   
   /** @param newDateDeNaissance
    * @pdOid 2590db15-4faf-41aa-a67d-4b648efdaaf0 */
   public void setDateDeNaissance(Date newDateDeNaissance) {
      dateDeNaissance = newDateDeNaissance;
   }
   
   /** @pdOid b2ac9bf0-ed00-4bcc-bc20-f21eb1121045 */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid 64213eb1-059a-419b-8b03-7de9d327ac2d */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   /** @pdOid 01123b62-4638-42a0-92a8-b4b38eaab255 */
   public Personne() {
      // TODO: implement
   }

}