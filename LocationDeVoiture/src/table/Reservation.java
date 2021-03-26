package table;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class Reservation {

	// Attributs
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	protected Date dateReservation;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	protected Date dateRetour;
	
	protected double montant;
	
	protected Prepose prepose;

	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the dateReservation
	 */
	public Date getDateReservation() {
		return dateReservation;
	}

	/**
	 * @param dateReservation the dateReservation to set
	 */
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
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
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
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

}
