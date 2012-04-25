package com.epsiyaya.projetvideoadmin;

import com.epsiyaya.projetvideoejb.remote.IPannierSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;


public class PanierClient {
	
	private static int cli_id = 1;
	public static final String DEFAULT_JNDI_NAME = "PanierBean";
	
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			
			Object obj = context.lookup(DEFAULT_JNDI_NAME);
			
			IPannierSession pannierSession = (IPannierSession) PortableRemoteObject.narrow(obj, IPannierSession.class);
			
			pannierSession.getPannier(cli_id);
			
			pannierSession.addProduit(1, 9);
			pannierSession.addProduit(2, 6);
			pannierSession.addProduit(3, 10);
			pannierSession.addProduit(4, 2);
			pannierSession.addProduit(1, 5);
			pannierSession.removeProduit(1, 5);
			
			pannierSession.validerPanier();
		} catch(NamingException ne) {
			ne.printStackTrace();
		}
	}
}