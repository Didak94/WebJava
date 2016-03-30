package modele;

public class Compte {
	
	private String Login;
	private String Mdp;
	private String Nom;
	private String Prenom;
	private String Role;
	
	
	public Compte(String login, String mdp, String nom, String prenom,
			String role) {
		
		Login = login;
		Mdp = mdp;
		Nom = nom;
		Prenom = prenom;
		Role = role;
	}
	
	public Compte(String login, String mdp, String nom, String prenom) {
		
		Login = login;
		Mdp = mdp;
		Nom = nom;
		Prenom = prenom;
		Role = "Client";
	}


	public String getLogin() {
		return Login;
	}


	public void setLogin(String login) {
		Login = login;
	}


	public String getMdp() {
		return Mdp;
	}


	public void setMdp(String mdp) {
		Mdp = mdp;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}
		
	public void setRole() {
		
		 if (Role.trim().toLowerCase().equals("client")){
			 Role = "Administrateur";
		 }else{
			 Role = "Client";
		 }
	}
	
	
}
