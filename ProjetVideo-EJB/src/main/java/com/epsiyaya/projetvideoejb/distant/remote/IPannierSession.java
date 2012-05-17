package com.epsiyaya.projetvideoejb.distant.remote;

import javax.ejb.Remote;

@Remote
public interface IPannierSession {
	/*public Map<Integer, ElementPanier> getPannier(int id_cli);
	
	public void addProduit(int idProduit, int quantitee);
	
	public void removeProduit(int idProduit, int quantitee);
	
	public void validerPanier();*/
    public void test();
}
