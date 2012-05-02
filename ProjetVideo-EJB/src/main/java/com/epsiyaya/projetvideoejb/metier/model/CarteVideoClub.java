package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  CarteVideoClub.java
 * Author:  MisterGamer
 * Purpose: Defines the Class CarteVideoClub
 ***********************************************************************/

import java.util.*;

/** @pdOid fc1a7e6c-8d82-40fb-8b2d-efdb341f8223 */
public class CarteVideoClub {
   /** @pdOid 536e6ab8-c16a-4b39-abc4-a49ae3744d97 */
   private String reference;
   /** @pdOid 20ba4061-677e-4042-884d-2375c3e7baa6 */
   private int pointFidelite;
   /** @pdOid 342e5215-7469-44c0-870d-b8ce49f09254 */
   private Float credit;
   
   /** @pdOid c1f0bee7-fce7-4c77-9c3e-86c21efb822c */
   public String getReference() {
      return reference;
   }
   
   /** @param newReference
    * @pdOid f5e0c985-b061-4688-b914-6bef2fd698d4 */
   public void setReference(String newReference) {
      reference = newReference;
   }
   
   /** @pdOid 40461861-da65-4176-85f9-0a68ceb7bdd4 */
   public CarteVideoClub() {
      // TODO: implement
   }

}