package com.epsiyaya.projetvideoejb.metier.dao;

/***********************************************************************
 * Module:  FilmLoue.java
 * Author:  MisterGamer
 * Purpose: Defines the Class FilmLoue
 ***********************************************************************/

import java.util.*;

/** @pdOid 9ceecd20-6b65-47b7-824e-65d6b7080366 */
public class FilmLoue {
   /** @pdOid 4c6749fa-5be3-411c-90ef-13d34bd1914a */
   private Date dateLocation;
   /** @pdOid 82121ccb-3a21-4aaa-b5f0-b6611f539847 */
   private int duree;
   
   /** @pdOid 92804197-e806-4791-b8ea-f7a7afab8295 */
   public Date getDateLocation() {
      return dateLocation;
   }
   
   /** @param newDateLocation
    * @pdOid d36bb63d-913c-4118-868f-41549f6c0efd */
   public void setDateLocation(Date newDateLocation) {
      dateLocation = newDateLocation;
   }
   
   /** @pdOid 58bff57d-e7d3-4a10-a535-bd8b2bd48716 */
   public int getDuree() {
      return duree;
   }
   
   /** @param newDuree
    * @pdOid 57201870-32fe-4ea0-903b-09f9a0c91789 */
   public void setDuree(int newDuree) {
      duree = newDuree;
   }
   
   /** @pdOid 78817d5e-c4fe-4a56-b4b7-e4c6129e2b3d */
   public FilmLoue() {
      // TODO: implement
   }

}