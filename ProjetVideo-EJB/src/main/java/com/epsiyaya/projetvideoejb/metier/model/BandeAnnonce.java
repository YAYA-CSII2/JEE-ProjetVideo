package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  BandeAnnonce.java
 * Author:  MisterGamer
 * Purpose: Defines the Class BandeAnnonce
 ***********************************************************************/

import java.util.*;

/** @pdOid 9de742e2-7549-4fec-b830-ba154100e0a2 */
public class BandeAnnonce {
   /** @pdOid 1da52f1d-ac12-4e41-bc27-429512ccda0e */
   private String reference;
   /** @pdOid 84e53a21-f840-469c-9948-ce22ef3eeda0 */
   private String lienVideo;
   /** @pdOid d665c55a-e331-4a86-b55e-ed2fe09c890a */
   private String description;
   
   /** @pdOid dd42a4da-9950-42d1-b0b8-e73fcc3406b2 */
   public String getReference() {
      return reference;
   }
   
   /** @param newReference
    * @pdOid d5470fdc-4690-49a8-880d-72a6cd92f95b */
   public void setReference(String newReference) {
      reference = newReference;
   }
   
   /** @pdOid 1b64db30-e50d-4108-8ceb-a1f117bdd4d6 */
   public String getLienVideo() {
      return lienVideo;
   }
   
   /** @param newLienVideo
    * @pdOid 7f616872-aaca-47c2-8184-4228f0ef4b2c */
   public void setLienVideo(String newLienVideo) {
      lienVideo = newLienVideo;
   }
   
   /** @pdOid b08ac774-649c-4fc0-bf8d-36587ece241d */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid 28af0821-e140-4de5-9956-c534d4b6d0c2 */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   /** @pdOid 8f93960c-b50b-48d9-a4de-d19a497acb72 */
   public BandeAnnonce() {
      // TODO: implement
   }

}