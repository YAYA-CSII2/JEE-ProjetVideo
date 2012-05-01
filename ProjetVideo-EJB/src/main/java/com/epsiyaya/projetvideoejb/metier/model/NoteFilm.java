package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  NoteFilm.java
 * Author:  MisterGamer
 * Purpose: Defines the Class NoteFilm
 ***********************************************************************/

import java.util.*;

/** @pdOid 211682da-70a7-4548-b87b-3f8c3e4e8deb */
public class NoteFilm {
   /** @pdOid 1d3a172c-90f0-4903-ad0c-614d776c2af9 */
   private int note;
   /** @pdOid be814b00-1c24-42b7-8d97-dbc52d0e2683 */
   private String description;
   
   /** @pdOid 217ffc1c-3b50-4339-a09a-8ddc88063609 */
   public int getNote() {
      return note;
   }
   
   /** @param newNote
    * @pdOid 32dd66e8-977b-45a6-a8ea-fe3dee21cf07 */
   public void setNote(int newNote) {
      note = newNote;
   }
   
   /** @pdOid db6b5f4c-f36d-4305-9271-1da444905a5f */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid 73cd7c75-4f8c-4563-b3ce-ab4f89f2ea21 */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   /** @pdOid e1f32749-9bb8-48bc-b0b7-9d724eeef36e */
   public NoteFilm() {
      // TODO: implement
   }

}