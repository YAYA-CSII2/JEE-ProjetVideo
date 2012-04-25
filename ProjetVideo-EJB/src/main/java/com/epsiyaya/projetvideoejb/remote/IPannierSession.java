package com.epsiyaya.projetvideoejb.remote;

import javax.ejb.Remote;

@Remote
public interface IPannierSession {
	public void getPannier(int id_cli);
	
	public void addProduit(int idProduit, int quantitee);
	
	public void removeProduit(int idProduit, int quantitee);
	
	public void validerPanier();
}
