package com.epsiyaya.projetvideoejb.metier.dao;

/***********************************************************************
 * Module:  FilmAchete.java
 * Author:  MisterGamer
 * Purpose: Defines the Class FilmAchete
 ***********************************************************************/

import java.util.*;

/** @pdOid 0572020f-2d51-4912-bd80-b26a9a0f7c21 */
public class FilmAchete {
   /** @pdOid d0bde323-a3c9-4a38-9f6e-8a28d10fcdc0 */
   private Date dateAchat;
   
   /** @pdOid 68cbe502-2e3c-42fa-8539-08344f0c03d8 */
   public Date getDateAchat() {
      return dateAchat;
   }
   
   /** @param newDateAchat
    * @pdOid e196f4be-ba2c-460e-b6b0-cbb248ed19b2 */
   public void setDateAchat(Date newDateAchat) {
      dateAchat = newDateAchat;
   }
   
   /** @pdOid 2d7eed91-66fc-424d-ad1c-e935e21ce0c2 */
   public FilmAchete() {
      // TODO: implement
   }

}