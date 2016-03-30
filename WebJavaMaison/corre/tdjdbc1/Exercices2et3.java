package tdjdbc1;
import java.sql.*;
import java.util.Scanner;

/* exercice 3 et 4 du td JDBC
 * les vols au départ d'une ville donnée
 * exercice 3 : avec Statement
 * exercice 4 : avec PreparedStatement
 */
public class Exercices2et3 {

	public static void main(java.lang.String[] args) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection c = DriverManager.getConnection ("jdbc:oracle:thin:@vs-oracle2:1521:ORCL","brette","brette");

		Scanner clavier = new Scanner(System.in);
		// saisie de la ville recherchée	
		System.out.println("Ville de votre choix : ");
		String ville = clavier.nextLine();
		clavier.close();
// exercice 3
		//Statement requeteStatique = c.createStatement();		
// exercice 4
PreparedStatement requete = 
 c.prepareStatement("select numvol,heuredepart,villearrivee from vol where villedepart = ?");

// exercice 3
		//ResultSet tableResultat = requeteStatique.executeQuery
		//h		("select numvol,heuredepart,villearrivee from vol where villedepart = '" + ville + "'");
// exercice 4
		requete.setString(1,ville);
		ResultSet tableResultat = requete.executeQuery();
		
// affichage du résultat
		if (!tableResultat.next()) System.out.println("aucun vol au départ de cette ville");
		else
		do {
			System.out.print(tableResultat.getString("numvol")+" ");
			System.out.print(tableResultat.getDate("heuredepart")+" ");
			System.out.println(tableResultat.getString("villearrivee"));
		}
		while (tableResultat.next());
// fermeture de la connexion		
		c.close();	
	}
}
