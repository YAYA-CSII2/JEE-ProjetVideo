package com.epsiyaya.projetvideoejb.local;


import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Map;
import java.util.HashMap;
import com.epsiyaya.projetvideoejb.remote.IPannierSession;
import com.epsiyaya.projetvideoejb.dao.ProduitDAO;
import com.epsiyaya.projetvideoejb.model.ElementPanier;
import javax.ejb.Stateful;

@Stateful
public class PanierBean implements IPannierSession {

	ProduitDAO pdao = new ProduitDAO();
	Map<Integer, ElementPanier> panier = new HashMap<Integer, ElementPanier>();
	int clientId;
	
	@Resource(mappedName="monappli") DataSource ds;
	
	public void getPannier(int id_cli) {
		clientId = id_cli;
		panier = pdao.getPannier(ds, id_cli);
	}
	
	public void addProduit(int idProduit, int quantitee) {
		float prixTotal;
		ElementPanier ep = panier.get(idProduit);
		
		if (ep == null) {
			prixTotal = quantitee * pdao.getProduit(ds, idProduit).getPrix();
			ep = new ElementPanier(idProduit, quantitee, prixTotal);
			panier.put(idProduit, ep);
		} else {
			ep.setQuantite(ep.getQuantite() + quantitee);
			ep.setPrix(ep.getQuantite() * pdao.getProduit(ds, idProduit).getPrix());
		}
	}

	public void removeProduit(int idProduit, int quantitee) {
		ElementPanier ep = panier.get(idProduit);
		
		if (quantitee >= ep.getQuantite()) {
			panier.remove(idProduit);
		} else {
			ep.setQuantite(ep.getQuantite() - quantitee);
			ep.setPrix(ep.getQuantite() * pdao.getProduit(ds, idProduit).getPrix());
		}
	}

	public void validerPanier() {
		pdao.deletePanier(ds, clientId);
		
		for (ElementPanier ep: panier.values()) {
			pdao.addToPanier(ds, ep, clientId);
		}
	}
	
}
