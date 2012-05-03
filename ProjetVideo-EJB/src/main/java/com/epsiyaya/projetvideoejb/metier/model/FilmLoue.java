package com.epsiyaya.projetvideoejb.metier.model;

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
   private Film monFilmLoue;

    public Film getFilmLoue() {
        return monFilmLoue;
    }

    public void setFilmLoue(Film FilmLoue) {
        monFilmLoue = FilmLoue;
    }

   
   /** @pdOid 92804197-e806-4791-b8ea-f7a7afab8295 */
   public Date getDateLocation() {
      return dateLocation;
   }
   

   /** @pdOid d36bb63d-913c-4118-868f-41549f6c0efd */
   public void setDateLocation(Date DateLocation) {
      dateLocation = DateLocation;
   }
   
   /** @pdOid 58bff57d-e7d3-4a10-a535-bd8b2bd48716 */
   public int getDuree() {
      return duree;
   }
   

   public void setDuree(int Duree) {
      duree = Duree;
   }
   
   public FilmLoue(Film MonFilmLoue,Date DateLocation, int Duree) {
      // TODO: implement
       monFilmLoue=MonFilmLoue;
       duree=Duree;
       dateLocation=DateLocation;
   }

}