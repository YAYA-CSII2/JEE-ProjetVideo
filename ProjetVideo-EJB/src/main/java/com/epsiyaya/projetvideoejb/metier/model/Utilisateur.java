package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  MisterGamer
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/

import java.util.*;

/** @pdOid e1a1382a-ac78-4c46-b8fc-5e121317009f */
public class Utilisateur {
   /** @pdOid 6238b730-99ce-4860-a33b-2ee253502c0f */
   private String login;
   /** @pdOid 45dc7492-ac1c-46db-ab98-8da0f87efd1a */
   private String motDePasse;
   /** @pdOid 775eec02-1a67-40fb-9eda-04f97de31f60 */
   private String nom;
   /** @pdOid a50b9cc9-cc9d-4809-9132-251ded42cfad */
   private String prenom;
   /** @pdOid b312aa2a-2395-4950-b88a-8ca1e381176b */
   private ArrayList<String> numeroCarteCredit;
   /** @pdOid c0a110a2-f847-4342-aff1-7ab10e966a0b */
   private String adresse;
   /** @pdOid 98dbe12f-7ba6-4c22-8153-12dc50f0e37e */
   private String codePostale;
   /** @pdOid f1176a60-045a-44b2-9592-0eb7dbdbaf66 */
   private String pays;
   
   /** @pdOid 74aab90e-4250-4351-ad40-2d745f25252b */
   public String getLogin() {
      return login;
   }
   
   /** @param newLogin
    * @pdOid 7ccb8431-0d99-45d3-9bff-05f8de228756 */
   public void setLogin(String newLogin) {
      login = newLogin;
   }
   
   /** @pdOid 6e808ef7-d222-462c-9d74-f187c4aed249 */
   public String getMotDePasse() {
      return motDePasse;
   }
   
   /** @param newMotDePasse
    * @pdOid 5d96ab9b-c5b6-4a07-a802-cbfe0ea75afa */
   public void setMotDePasse(String newMotDePasse) {
      motDePasse = newMotDePasse;
   }
   
   /** @pdOid 7c4f740f-36ef-418c-906b-14513f602559 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 297dada0-6b43-42fb-9ae4-6d923b25971e */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 522fa4c7-e467-437c-abd0-f356b0dc3e32 */
   public String getPrenom() {
      return prenom;
   }
   
   /** @param newPrenom
    * @pdOid e3b37b3c-e633-41b5-9093-e3715dead1b5 */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   /** @pdOid 06ce8c0d-28e4-4a17-97da-9d5849e21ce7 */
   public ArrayList<String> getNumeroCarteCredit() {
      return numeroCarteCredit;
   }
   
   /** @param newNumeroCarteCredit
    * @pdOid 83a7281a-c2a7-4815-b948-07d48c25b0cd */
   public void setNumeroCarteCredit(ArrayList<String> newNumeroCarteCredit) {
      numeroCarteCredit = newNumeroCarteCredit;
   }
   
   /** @pdOid 23376071-90b0-4888-8a5c-38a69bfabed9 */
   public String getAdresse() {
      return adresse;
   }
   
   /** @param newAdresse
    * @pdOid b13f702a-69c9-4a55-a429-bf03e7007fcb */
   public void setAdresse(String newAdresse) {
      adresse = newAdresse;
   }
   
   /** @pdOid 3af4b740-70bf-4e21-828e-9a64a894bfbd */
   public String getCodePostale() {
      return codePostale;
   }
   
   /** @param newCodePostale
    * @pdOid c39ab11c-56bd-473c-839d-773044065a5a */
   public void setCodePostale(String newCodePostale) {
      codePostale = newCodePostale;
   }
   
   /** @pdOid 0d49d358-53f4-4b56-839d-cfb18611890e */
   public String getPays() {
      return pays;
   }
   
   /** @param newPays
    * @pdOid cd13f633-6d7d-4cf7-b61a-56bd6c0e6b84 */
   public void setPays(String newPays) {
      pays = newPays;
   }
   
   /** @pdOid 9c717cdb-fbad-4dec-bca4-eecd71b4d6f4 */
   public Utilisateur() {
      // TODO: implement
   }

}