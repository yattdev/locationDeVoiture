package main;
import java.awt.print.Printable;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.Scanner;

import table.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		// 1 Get connextion f=to dataBase
		Connection Connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/locationDB", "alassane", "7678_gone");
		/*
		 * // 4 Process the result set while(resul.next()) {
		 * System.out.println(resul.getString("nom")+", "+ resul.getString("prenom")); }
		 */
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}

	Scanner input = new Scanner(System.in);
	System.out.println("#############################################");;
	System.out.println("1: Ajouter un client\n"
	+ "2: Supprimer un client\n"
	+ "3: Ajouter une location\n"
	+ "4: Ajouter une reservation\n"
	+ "5: Ajouter un vehicule\n"
	+ "6: Supprimerr un vehicule\n"
	+ "");

	System.out.print(" Veillez choisir svp ?:");
	
	String cas = input.nextLine();  // Read user inpu
	switch (cas) {
	case "1":
		// 1 Ajouter un client
		Client newCl = new Client();
		 Class<?> c = newCl.getClass();
		Field[] fields = c.getDeclaredFields();
		System.out.println("Veillez saisir les infos du client ?");
		for (Field field : fields) {
			System.out.println(field.getName()+":");
			String value = input.nextLine();
			if(field.getName().equals("nom"))
				newCl.setNom(value);
			if(field.getName().equals("prenom"))
				newCl.setPrenom(value);
			if(field.getName().equals("adress"))
				newCl.setAdress(value);
			//etc
		}
		
		// ###### Save new client to Data

		break;
	case "2":
		
		break;
	case "3":
		
		break;
	case "4":
		
		break;
	case "5":
		
		break;

	default:
		break;
	}
	}

}
