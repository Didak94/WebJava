package persistance;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionBD {
	
private static Connection connect;
	
	static {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//DriverManager.registerDriver(new oracle.jdbc.OracleDriver()));
			A l'IUT 
			//connect = DriverManager.getConnection("jdbc:oracle:thin:@vs-oracle2:1521:ORCL","GRP202US10","GRP202US10");
			//Chez soi
			//connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jacko", "alpha14");
	
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connect;
	}
	
	
}
