package com.epsiyaya.projetvideoejb.model;

public class Produit {
	private int id;
	private String nom;
	private String codeBarre;
	private String description;
	private String lienPhoto;
	private float prix;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCodeBarre() {
		return codeBarre;
	}
	public void setCodeBarre(String codeBarre) {
		this.codeBarre = codeBarre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLienPhoto() {
		return lienPhoto;
	}
	public void setLienPhoto(String lienPhoto) {
		this.lienPhoto = lienPhoto;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Produit(String nom, String codeBarre, String description,
			String lienPhoto, float prix) {
		super();
		this.nom = nom;
		this.codeBarre = codeBarre;
		this.description = description;
		this.lienPhoto = lienPhoto;
		this.prix = prix;
	}
	public Produit() {
		super();
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Produit:");
		sb.append("id: ").append(this.getId()).append("\t");
		sb.append("nom: ").append(this.getNom()).append("\t");
		sb.append("description: ").append(this.getDescription()).append("\t");
		sb.append("code barre: ").append(this.getCodeBarre()).append("\t");
		sb.append("lien photo: ").append(this.getLienPhoto()).append("\t");
		sb.append("prix: ").append(this.getPrix());
		return sb.toString();
	}
	
	
}
