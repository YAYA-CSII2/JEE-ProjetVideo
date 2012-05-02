package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  Categorie.java
 * Author:  MisterGamer
 * Purpose: Defines the Class Categorie
 ***********************************************************************/

import java.util.*;

/** @pdOid dfe9ba8b-656d-4f37-98f4-40d2f70a9cf1 */
public class Categorie {
   /** @pdOid 5e6aaa16-168f-499b-86f5-d9a3be4ab4b5 */
   private String nom;
   /** @pdOid d2f8d770-c266-447c-8231-3b0167ffdcf4 */
   private String description;
   
   /** @pdOid 4dd7d389-05d1-403f-8e66-cf7e1d5504f8 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 2449b80d-e63b-4da5-a25d-53470fc04416 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 04d1a57c-8366-4475-96b9-ae376ac41ec0 */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid d6450461-6546-494e-b344-e722cb17d391 */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   /** @pdOid 80e10cc9-a03f-4e37-a6a9-dc961e73fef2 */
   public Categorie() {
      // TODO: implement
   }

}