package com.epsiyaya.projetvideoejb.metier.model;

/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  MisterGamer
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/

import java.util.*;
import com.epsiyaya.projetvideoejb.metier.model.FilmLoue;

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
   private boolean roleClient;
   private boolean roleAdministrateur;
   private int pontFidelite;

    public boolean isAdministrateur() {
        return roleAdministrateur;
    }

    public void setAdministrateur(boolean RoleAdministrateur) {
        roleAdministrateur = RoleAdministrateur;
    }

    public boolean isClient() {
        return roleClient;
    }

    public void setClient(boolean RoleClient) {
        roleClient=RoleClient;
    }

    public int getPontFidelite() {
        return pontFidelite;
    }

    public void setPontFidelite(int pontFidelite) {
        this.pontFidelite = pontFidelite;
    }
   
   /** @pdOid 74aab90e-4250-4351-ad40-2d745f25252b */
   public String getLogin() {
      return login;
   }
   
   
   /** @pdOid 7ccb8431-0d99-45d3-9bff-05f8de228756 */
   public void setLogin(String Login) {
      login = Login;
   }
   
   /** @pdOid 6e808ef7-d222-462c-9d74-f187c4aed249 */
   public String getMotDePasse() {
      return motDePasse;
   }
   
   
   /** @pdOid 5d96ab9b-c5b6-4a07-a802-cbfe0ea75afa */
   public void setMotDePasse(String MotDePasse) {
      motDePasse = MotDePasse;
   }
   
   /** @pdOid 7c4f740f-36ef-418c-906b-14513f602559 */
   public String getNom() {
      return nom;
   }
   

   /** @pdOid 297dada0-6b43-42fb-9ae4-6d923b25971e */
   public void setNom(String Nom) {
      nom = Nom;
   }
   
   /** @pdOid 522fa4c7-e467-437c-abd0-f356b0dc3e32 */
   public String getPrenom() {
      return prenom;
   }
   

   /** @pdOid e3b37b3c-e633-41b5-9093-e3715dead1b5 */
   public void setPrenom(String Prenom) {
      prenom = Prenom;
   }
   
   /** @pdOid 06ce8c0d-28e4-4a17-97da-9d5849e21ce7 */
   public ArrayList<String> getNumeroCarteCredit() {
      return numeroCarteCredit;
   }
   
   
   /** @pdOid 83a7281a-c2a7-4815-b948-07d48c25b0cd */
   public void setNumeroCarteCredit(ArrayList<String> NumeroCarteCredit) {
      numeroCarteCredit = NumeroCarteCredit;
   }
   
   /** @pdOid 23376071-90b0-4888-8a5c-38a69bfabed9 */
   public String getAdresse() {
      return adresse;
   }
   

   /** @pdOid b13f702a-69c9-4a55-a429-bf03e7007fcb */
   public void setAdresse(String Adresse) {
      adresse = Adresse;
   }
   
   /** @pdOid 3af4b740-70bf-4e21-828e-9a64a894bfbd */
   public String getCodePostale() {
      return codePostale;
   }
   

   /** @pdOid c39ab11c-56bd-473c-839d-773044065a5a */
   public void setCodePostale(String CodePostale) {
      codePostale = CodePostale;
   }
   
   /** @pdOid 0d49d358-53f4-4b56-839d-cfb18611890e */
   public String getPays() {
      return pays;
   }
   

   /** @pdOid cd13f633-6d7d-4cf7-b61a-56bd6c0e6b84 */
   public void setPays(String Pays) {
      pays = Pays;
   }
   
   /** @pdOid 9c717cdb-fbad-4dec-bca4-eecd71b4d6f4 */
   public Utilisateur() {
      // TODO: implement
   }
   
   public Utilisateur(String Login, String MotDePasse, String Nom, String Prenom, String Adresse,
           String CodePostale, String Pays, boolean RoleClient, Boolean RoleAdministrateur) {
      // TODO: implement
       login=Login;
       motDePasse= MotDePasse;
       nom=Nom;
       prenom=Prenom;
       adresse=Adresse;
       codePostale=CodePostale;
       pays=Pays;
       roleClient= RoleClient;
       roleAdministrateur=RoleAdministrateur;
       
   }

}