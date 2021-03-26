package table;

import java.util.HashSet;
import java.util.List;

import lesCas.OperationPrepose;

import java.lang.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Prepose extends PersonneLoation {

	// Attributs
	protected List<Client> listClient;
	
	protected List<Reservation> listReservations;

	private Connection connexion; 
	private OperationPrepose operation;
	
	public Prepose(Connection conn) {
		this.connexion = conn;
		try {
			this.operation =  new OperationPrepose(this.connexion.createStatement());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @return the listClient
	 */
	public List<Client> getListClient() {
		return listClient;
	}

	/**
	 * @param listClient the listClient to set
	 */
	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}

	public Prepose(String nom, String prenom, String username, String password) {
		this.setNom(nom);
		this.setPrenom(prenom);;
		this.setUsername(username);
		this.setPassword(password);
	}
	
	public void AddClient(Client cl) throws SQLException {
		boolean correct = this.verifyClient(cl);
		if(correct)
			this.operation.addClient(cl);
	}
	
	public boolean verifyClient(Client cl){
		// Make verification here !!!
		return true; // if client info valide
	}
	
	public void supprimerClient(Client cl) {
		this.getListClient().remove(cl);
	}
	
	public void addReservation(Reservation re) {
		this.operation.addReservation(re);
	}
	
	public void supprimerReservation(Reservation re) {
		this.getListReservations().remove(re);
	}
	
	public void retourLocation(Location l) {
		for(Vehicule v: l.getVehicule()) {
			this.operation.retourLocation(v);
		}
	}

	/**
	 * @return the listReservations
	 */
	public List<Reservation> getListReservations() {
		return listReservations;
	}

	/**
	 * @param listReservations the listReservations to set
	 */
	public void setListReservations(List<Reservation> listReservations) {
		this.listReservations = listReservations;
	}

}
