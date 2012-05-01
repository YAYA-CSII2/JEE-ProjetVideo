package com.epsiyaya.projetvideoejb.metier.dao;

/***********************************************************************
 * Module:  Photo.java
 * Author:  MisterGamer
 * Purpose: Defines the Class Photo
 ***********************************************************************/

import java.util.*;

/** @pdOid b4b2c666-591c-4b8c-802a-f5722b4f3d94 */
public class Photo {
   /** @pdOid 2411eadc-e405-44ea-9fbe-12d7499ca956 */
   private String reference;
   /** @pdOid 5859fb16-e6ad-4273-8aef-c6f45bcd8dac */
   private String lienPhoto;
   /** @pdOid 4f913cbe-9be8-4d89-9e74-a0a6eef60ce0 */
   private String description;
   
   /** @pdOid 5c7ae007-0ae2-4ec6-9684-1f540c98e6a4 */
   public String getReference() {
      return reference;
   }
   
   /** @param newReference
    * @pdOid 154cd840-25bb-47a1-8efe-eae2e1734db7 */
   public void setReference(String newReference) {
      reference = newReference;
   }
   
   /** @pdOid d1015c95-2c8d-4316-a4e6-8d7ad5c94c79 */
   public String getLienPhoto() {
      return lienPhoto;
   }
   
   /** @param newLienPhoto
    * @pdOid a596fd04-f5a6-4d51-b61d-db6f95040bf0 */
   public void setLienPhoto(String newLienPhoto) {
      lienPhoto = newLienPhoto;
   }
   
   /** @pdOid 9329d23d-4143-4c8d-b29d-17700f2285ed */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid 298f16cc-f4a7-4b71-ae5f-f9ff5e98dbf1 */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   /** @pdOid 40588bc8-9cd6-4c35-a64a-50e16a2605c7 */
   public Photo() {
      // TODO: implement
   }

}