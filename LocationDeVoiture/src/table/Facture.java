package table;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class Facture {
	
	// Attributs
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	protected Date dateFacture;
	
	protected Client client;

	protected double montant;

	/**
	 * @return the dateFacture
	 */
	public Date getDateFacture() {
		return dateFacture;
	}

	/**
	 * @param dateFacture the dateFacture to set
	 */
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
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
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Facture() {
		// TODO Auto-generated constructor stub
	}

}
