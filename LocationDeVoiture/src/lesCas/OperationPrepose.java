/**
 * 
 */
package lesCas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import table.Client;
import table.Prepose;
import table.Reservation;
import table.Vehicule;

/**
 * @author alassane
 *
 */
public class OperationPrepose {
	private Statement stat;

	public OperationPrepose(Statement stat) {
		// TODO Auto-generated constructor stub
		this.stat = stat;
	}
	
	public void addClient(Client cl) throws SQLException {
		// Add cl into Data Base
		this.stat.executeQuery("INSERT INTO client(nom, prenom, adress, tel, numPermis, numCart)\n" + 
				"VALUES("+
				cl.getNom()+", "+
				cl.getPrenom()+", "+
				cl.getAdress()+", "+
				cl.getTel()+", "+
				cl.getNumPermis()+", "+
				cl.getNumCart()+")"); 
	}
	
	public void addPrepose(Prepose pr) throws SQLException {
		this.stat.executeQuery("INSERT INTO prepose(nom, prenom, username, password)\n" + 
				"VALUES("+
				pr.getNom()+", "+
				pr.getPrenom()+", "+
				pr.getUsername()+", "+
				pr.getPassword()+")"); 
	}
	
	public void addReservation(Reservation re) {
		// add Vehicule
	}
	
	public void addVehicule(Vehicule v) {
		// add Vehicule
	}
	
	public void retourLocation(Vehicule v) {
		// Mise a jour la base de donne pour le vehicule retourner
	}

}
