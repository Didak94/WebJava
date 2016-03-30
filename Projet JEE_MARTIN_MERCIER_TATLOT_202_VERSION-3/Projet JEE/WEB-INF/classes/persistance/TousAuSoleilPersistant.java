package persistance;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import modele.*;

public class TousAuSoleilPersistant {

	private static Connection connect;
	private static PreparedStatement connectCompte;
	
	
	private static PreparedStatement insertVol;
	
	private static PreparedStatement insertCompte;
	
	private static PreparedStatement insertReservation;
	
	private static PreparedStatement listeVols; 

	private static PreparedStatement listeReservations; 

	
	private static PreparedStatement rechercheReservation;

	
	
	static {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//DriverManager.registerDriver(new oracle.jdbc.OracleDriver()));
			//A l'IUT 
			connect = DriverManager.getConnection("jdbc:oracle:thin:@vs-oracle2:1521:ORCL","GRP202US10","GRP202US10");
			//Chez soi
			//connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jacko","alpha14");
			connectCompte = connect.prepareStatement("SELECT * FROM COMPTES WHERE Login= ? AND Mdp= ?");
			insertVol = connect.prepareStatement("INSERT INTO VOLS VALUES(?,?,?,?,?)");
			
			insertCompte= connect.prepareStatement("INSERT INTO COMPTES VALUES(?,?,?,?,?)");
			
			insertReservation = connect.prepareStatement("INSERT INTO RESERVATIONS VALUES(?,?,?,?,?)");
			
			listeVols = connect.prepareStatement("SELECT * FROM VOLS ");
			listeReservations = connect.prepareStatement("SELECT * FROM RESERVATIONS");
			
			rechercheReservation = connect.prepareStatement("SELECT * FROM RESERVATIONS WHERE Login= ? ");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static List<Vol> chercheVolsParDestination(String destination){
		List<Vol> lesVols = new ArrayList<Vol>();
		try {
			PreparedStatement requete = connect.prepareStatement("select * from vols where destination=?");
			requete.setString(1, destination);
			ResultSet resultat = requete.executeQuery();
			while (resultat.next()){
				lesVols.add(new Vol(resultat.getInt("NumeroVol"), resultat.getString("Destination"),
						resultat.getDate("DateDepart"), resultat.getInt("NombrePlaces"), resultat.getInt("Prix")));
			}
			
			
		} catch (SQLException e) {
			
				e.printStackTrace();
	
		}
		return lesVols;
	}

	
	public static Compte connecterCompte(String login, String mdp) throws SQLException, Exception{
		connectCompte.setString(1, login);
		connectCompte.setString(2, mdp);
		ResultSet res = connectCompte.executeQuery();	
		if(!res.next())
			throw new Exception();
		else
			return new Compte(res.getString("Login"),res.getString("Mdp"),res.getString("Nom"),res.getString("Prenom"),res.getString("Role") );
			
}
		
	
	public static List<Vol> chercheVols() {
		List<Vol> lesVols = new ArrayList<Vol>();
		try {
			//PreparedStatement requete = connect.prepareStatement("select * from vols");
			//requete.setString(1, ville);
			ResultSet resultat = listeVols.executeQuery();
			while (resultat.next()) {
				lesVols.add(new Vol(resultat.getInt("NumeroVol"), resultat.getString("Destination"), resultat.getDate("DateDepart"), resultat.getInt("NombrePlaces"), resultat.getInt("Prix")));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return lesVols;
	}
	
	public static List<Reservation> chercheReservations(String login) {
		List<Reservation> lesReservations = new ArrayList<Reservation>();
		try {
			//PreparedStatement requete = connect.prepareStatement("select * from vols");
			//requete.setString(1, ville);
			rechercheReservation.setString(1, login);
			ResultSet resultat = rechercheReservation.executeQuery();
			while (resultat.next()) {
				lesReservations.add(new Reservation(resultat.getInt(1), resultat.getString(2), resultat.getInt(3), resultat.getInt(4), resultat.getString(5)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return lesReservations;
	}
	
	private static int numer = 10;
	
	public static void ajouterReservation(String log, int num, int places, String conf){
		try {
			
			insertReservation.setInt(1, numer);
			insertReservation.setString(2, log);
			insertReservation.setInt(3, num);
			insertReservation.setInt(4, places);
			insertReservation.setString(4, conf);

            try {
            	

            	int nbMaj = insertReservation.executeUpdate();
            		
            		new Reservation(numer,log, num, places, conf);
            	            	
            	} catch (SQLException e) {
            	
            	e.printStackTrace();
            	
            	}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		numer++;
		 
		
	}


public static void creerCompte(String log, String pass, String name, String prenom, String role){
	try {
		
		
		insertCompte.setString(1, log);
		insertCompte.setString(2, pass);
		insertCompte.setString(3, name);
		insertCompte.setString(4, prenom);
		insertCompte.setString(5, role);
		

        try {
        	

        	int nbMaj = insertCompte.executeUpdate();
        		
        		new Compte(log,pass,name,prenom,role);
        	            	
        	} catch (SQLException e) {
        	
        	e.printStackTrace();
        	
        	}
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
	 
	
}
