package com.epsiyaya.projetvideoejb.metier.model;

import java.util.ArrayList;
import org.apache.jasper.tagplugins.jstl.ForEach;

public class ElementPanier implements java.io.Serializable {
	private ArrayList<FilmLoue> filmsLoues;
        private ArrayList<FilmAchete> filmsAchetes;
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
            prix=calculerPrixFilmsLoue()+calculerPrixFilmsAchete();
        }
        
        public float calculerPrixFilmsLoue()
        {
            float prixFilmsLoue=0;
            for(FilmLoue f : filmsLoues)
            {
                prixFilmsLoue=prixFilmsLoue+(f.getDuree()*f.getFilmLoue().getPrixLocation());
            }
            return prixFilmsLoue;
        }
        
        public float calculerPrixFilmsAchete()
        {
            float prixFilmsAchete=0;
            for(FilmAchete f : filmsAchetes)
            {
                prixFilmsAchete=prixFilmsAchete+f.getFilmAchete().getPrixAchat();
            }
            return prixFilmsAchete;
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
        
        public void ajouterFilmLoue(FilmLoue filmLoue)
        {
            filmsLoues.add(filmLoue);
        }
        
        public void ajouterFilmachete(FilmLoue filmAAchete)
        {
            filmsLoues.add(filmAAchete);
        }
        
        public void supprimerFilmLoue(FilmLoue filmASupprimer)
        {
            filmsLoues.remove(filmASupprimer);
        }
        
        public void supprimerFilmachete(FilmAchete filmASupprimer)
        {
            filmsAchetes.remove(filmASupprimer);
        }
	
	
}
