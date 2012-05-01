package com.epsiyaya.projetvideoejb.metier.model;

public class ElementPanier implements java.io.Serializable {
	private int idProduit;
	private int quantite;
	private float prix;
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public ElementPanier(int idProduit, int quantite, float prix) {
		super();
		this.idProduit = idProduit;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer("ElementPanier:");
		sb.append("idProduit:").append(idProduit);
		sb.append("\tquantité").append(quantite);
		sb.append("\tprix:").append(prix);
		return sb.toString();
	}
	
	
}
