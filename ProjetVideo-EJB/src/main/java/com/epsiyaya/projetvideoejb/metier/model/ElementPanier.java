package com.epsiyaya.projetvideoejb.metier.model;

import java.util.ArrayList;
import org.apache.jasper.tagplugins.jstl.ForEach;

public class ElementPanier implements java.io.Serializable {
	private ArrayList<FilmLoue> filmsLoues;
	private float prix;
	
	
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public ElementPanier(ArrayList<FilmLoue> FilmsLoues) {
		super();
		filmsLoues=FilmsLoues;
                prix=0;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer("ElementPanier:");
		sb.append("idProduit:").append(filmsLoues);
		sb.append("\tprix:").append(prix);
		return sb.toString();
	}
        public void calculerPrix()
        {
            prix=0;
            for(FilmLoue f : filmsLoues)
            {
                prix=prix+(f.getDuree()*f.getFilmLoue().getPrixAchat());
            }
        }
        
        public boolean verifierDejaFilmAchate(String FilmALouer)
        {
            boolean filmDejaAchete=false;
            for(FilmLoue f : filmsLoues)
            {
                if(f.getFilmLoue().getNom().equals(FilmALouer))
                    filmDejaAchete=true;
            }
            
            return filmDejaAchete;
        }
	
	
}
