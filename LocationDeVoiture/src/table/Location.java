package table;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class Location {
	
	// Attributs
	protected double kilometrage;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	protected Date dateRetour;

	protected double montantLocattion;
	
	protected Prepose prepose;
	
	protected Client client;
	
	protected List<Vehicule> vehicule;

	public Location() {
		// TODO Auto-generated constructor stub
	}
	
	public void addClient(Client client) {
		this.prepose.getListClient().add(client);
	}

	/**
	 * @return the kilometrage
	 */
	public double getKilometrage() {
		return kilometrage;
	}

	/**
	 * @param kilometrage the kilometrage to set
	 */
	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}

	/**
	 * @return the dateRetour
	 */
	public Date getDateRetour() {
		return dateRetour;
	}

	/**
	 * @param dateRetour the dateRetour to set
	 */
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	/**
	 * @return the montantLocattion
	 */
	public double getMontantLocattion() {
		return montantLocattion;
	}

	/**
	 * @param montantLocattion the montantLocattion to set
	 */
	public void setMontantLocattion(double montantLocattion) {
		this.montantLocattion = montantLocattion;
	}

	/**
	 * @return the prepose
	 */
	public Prepose getPrepose() {
		return prepose;
	}

	/**
	 * @param prepose the prepose to set
	 */
	public void setPrepose(Prepose prepose) {
		this.prepose = prepose;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the vehicule
	 */
	public List<Vehicule> getVehicule() {
		return vehicule;
	}

	/**
	 * @param vehicule the vehicule to set
	 */
	public void setVehicule(List<Vehicule> vehicule) {
		this.vehicule = vehicule;
	}
	
	// Les autre fonction sont parail a celle du Prepose
	// comme add/Supp (Client, Reservation etc...) 

}
