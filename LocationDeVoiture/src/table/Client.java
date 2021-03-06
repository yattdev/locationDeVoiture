package table;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class Client {
	
	// Attribut
	protected String nom = "";
	protected String prenom = "";
	protected String adress = "";
	protected int tel;
	protected int numPermis;
	protected int numCart;
	protected List<Facture> facture;
	protected List<Location> locations;

	/**
	 * @return the facture
	 */
	public List<Facture> getFacture() {
		return facture;
	}


	/**
	 * @param facture the facture to set
	 */
	public void setFacture(List<Facture> facture) {
		this.facture = facture;
	}


	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	protected Date anneeNaissance;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	protected Date anneeExpCarte;
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}


	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}


	/**
	 * @return the tel
	 */
	public int getTel() {
		return tel;
	}


	/**
	 * @param tel the tel to set
	 */
	public void setTel(int tel) {
		this.tel = tel;
	}


	/**
	 * @return the numPermis
	 */
	public int getNumPermis() {
		return numPermis;
	}


	/**
	 * @param numPermis the numPermis to set
	 */
	public void setNumPermis(int numPermis) {
		this.numPermis = numPermis;
	}


	/**
	 * @return the numCart
	 */
	public int getNumCart() {
		return numCart;
	}


	/**
	 * @param numCart the numCart to set
	 */
	public void setNumCart(int numCart) {
		this.numCart = numCart;
	}


	/**
	 * @return the anneeNaissance
	 */
	public Date getAnneeNaissance() {
		return anneeNaissance;
	}


	/**
	 * @param anneeNaissance the anneeNaissance to set
	 */
	public void setAnneeNaissance(Date anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}


	/**
	 * @return the anneeExpCarte
	 */
	public Date getAnneeExpCarte() {
		return anneeExpCarte;
	}


	/**
	 * @param anneeExpCarte the anneeExpCarte to set
	 */
	public void setAnneeExpCarte(Date anneeExpCarte) {
		this.anneeExpCarte = anneeExpCarte;
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


	// Prepose
	protected Prepose prepose;
	

	public Client() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Client [" + (nom != null ? "nom=" + nom + ", " : "") + (prenom != null ? "prenom=" + prenom + ", " : "")
				+ "tel=" + tel + ", numPermis=" + numPermis + ", numCart=" + numCart + "]";
	}


	/**
	 * @return the locations
	 */
	public List<Location> getLocations() {
		return locations;
	}


	/**
	 * @param locations the locations to set
	 */
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

}
