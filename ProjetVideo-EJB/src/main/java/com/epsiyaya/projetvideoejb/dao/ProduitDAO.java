package com.epsiyaya.projetvideoejb.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.epsiyaya.projetvideoejb.model.ElementPanier;
import com.epsiyaya.projetvideoejb.model.Produit;
import java.sql.*;

public class ProduitDAO {
	
	Connection conn = null;
	
	public Produit getProduit(DataSource ds, int idProduit) {
		// pr�paration des ressources utilis�es
		Statement stmt = null;
		ResultSet rs = null;
		String request = "select * from produit where id = "+idProduit;
		try {
			//ex�cution de la requ�te
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(request);
			
			//parcours du r�sultat
			if(rs.next()) {
				Produit produit = new Produit();
				produit.setId(rs.getInt(1));
				produit.setNom(rs.getString("nom"));
				produit.setDescription(rs.getString("description"));
				produit.setCodeBarre(rs.getString("codebarre"));
				produit.setLienPhoto(rs.getString("lienphoto"));
				produit.setPrix(rs.getFloat("prix"));
				return produit;
			}
			
		} catch (SQLException e) {
			System.out.println("exception lors de l'ex�cution de la requ�te:"+e.getMessage());
		} finally {
			//fermeture des ressources
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("exception lors de la fermeture des ressources:"+e.getMessage());
			}
		}
		return null;
	}
	
	public List<Produit> getListProduits(DataSource ds) {
		// pr�paration des ressources utilis�es
		List<Produit> liste = new ArrayList<Produit>();
		Statement stmt = null;
		ResultSet rs = null;
		String request = "select * from produit";
		try {
			//ex�cution de la requ�te
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(request);
			
			//parcours du r�sultat
			while(rs.next()) {
				Produit produit = new Produit();
				produit.setId(rs.getInt(1));
				produit.setNom(rs.getString("nom"));
				produit.setDescription(rs.getString("description"));
				produit.setCodeBarre(rs.getString("codebarre"));
				produit.setLienPhoto(rs.getString("lienphoto"));
				produit.setPrix(rs.getFloat("prix"));
				liste.add(produit);
			}
			
		} catch (SQLException e) {
			System.out.println("exception lors de l'ex�cution de la requ�te:"+e.getMessage());
		} finally {
			//fermeture des ressources
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("exception lors de la fermeture des ressources:"+e.getMessage());
			}
		}
		return liste;
	}

	public void insereProduit(DataSource ds, Produit produit) {
		// pr�paration des ressources utilis�es
		PreparedStatement ps = null;
		String request = "insert into produit (nom, description, codebarre, lienphoto, prix) values (?,?,?,?,?)";
		try {
			//ex�cution de la requ�te d'insertion
			conn = ds.getConnection();
			ps = conn.prepareStatement(request);
			ps.setString(1, produit.getNom());
			ps.setString(2, produit.getDescription());
			ps.setString(3, produit.getCodeBarre());
			ps.setString(4, produit.getLienPhoto());
			ps.setFloat(5, produit.getPrix());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("exception lors de l'ex�cution de la requ�te:"+e.getMessage());
		} finally {
			//fermeture des ressources
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("exception lors de la fermeture des ressources:"+e.getMessage());
			}
		}
	}

	public Map<Integer, ElementPanier> getPannier(DataSource ds, int clientId) {
		// pr�paration des ressources utilis�es
		Map<Integer, ElementPanier> panier = new HashMap<Integer, ElementPanier>();
		Statement stmt = null;
		ResultSet rs = null;
		String request = "SELECT * FROM elementpanier WHERE id_cli = " + clientId;
		
		try {
			//ex�cution de la requ�te
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(request);
			//parcours du r�sultat
			while(rs.next()) {
				ElementPanier ep = new ElementPanier(rs.getInt("id_prod"), rs.getInt("quantite"), rs.getFloat("prix"));
				panier.put(ep.getIdProduit(), ep);
			}
			
		} catch (SQLException e) {
			System.out.println("exception lors de l'ex�cution de la requ�te:"+e.getMessage());
		} finally {
			//fermeture des ressources
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("exception lors de la fermeture des ressources:"+e.getMessage());
			}
		}
		return panier;
	}
	
	public void addToPanier(DataSource ds, ElementPanier ep, int clientId) {
		// pr�paration des ressources utilis�es
		PreparedStatement ps = null;
		String request = "insert into elementpanier (id_prod, quantite, prix, id_cli) values (?,?,?,?)";
		try {
			//ex�cution de la requ�te d'insertion
			conn = ds.getConnection();
			ps = conn.prepareStatement(request);
			ps.setInt(1, ep.getIdProduit());
			ps.setInt(2, ep.getQuantite());
			ps.setFloat(3, ep.getPrix());
			ps.setInt(4, clientId);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("exception lors de l'ex�cution de la requ�te:"+e.getMessage());
		} finally {
			//fermeture des ressources
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("exception lors de la fermeture des ressources:"+e.getMessage());
			}
		}
	}
	
	public void deletePanier(DataSource ds, int clientId) {
		// pr�paration des ressources utilis�es
		PreparedStatement ps = null;
		String request = "DELETE FROM elementpanier WHERE id_cli = " + clientId;
		try {
			//ex�cution de la requ�te d'insertion
			conn = ds.getConnection();
			ps = conn.prepareStatement(request);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("exception lors de l'ex�cution de la requ�te:"+e.getMessage());
		} finally {
			//fermeture des ressources
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("exception lors de la fermeture des ressources:"+e.getMessage());
			}
		}
	}
}
