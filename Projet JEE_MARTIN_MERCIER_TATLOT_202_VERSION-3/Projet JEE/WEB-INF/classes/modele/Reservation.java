package modele;

public class Reservation {
	
	private int NumeroRes;
	private String Login;
	private int NumeroVol;
	private int NombrePlaces;
	private String Confirmation;
	
	
	public Reservation(int numeroRes, String login, int numeroVol,
			int nombrePlaces, String confirmation) {
		
		NumeroRes = numeroRes;
		Login = login;
		NumeroVol = numeroVol;
		NombrePlaces = nombrePlaces;
		Confirmation = confirmation;
	}
	
	
	public Reservation(int numeroRes, String login, int numeroVol,
			int nombrePlaces) {
	
		NumeroRes = numeroRes;
		Login = login;
		NumeroVol = numeroVol;
		NombrePlaces = nombrePlaces;
		Confirmation = "Non";
	}


	public int getNumeroRes() {
		return NumeroRes;
	}


	public void setNumeroRes(int numeroRes) {
		NumeroRes = numeroRes;
	}


	public String getLogin() {
		return Login;
	}


	public void setLogin(String login) {
		Login = login;
	}


	public int getNumeroVol() {
		return NumeroVol;
	}


	public void setNumeroVol(int numeroVol) {
		NumeroVol = numeroVol;
	}


	public int getNombrePlaces() {
		return NombrePlaces;
	}


	public void setNombrePlaces(int nombrePlaces) {
		NombrePlaces = nombrePlaces;
	}


	public String getConfirmation() {
		return Confirmation;
	}


	public void setConfirmation(String confirmation) {
		Confirmation = confirmation;
	}
	
	public void setConfirmation() {
		
		if (Confirmation.trim().toLowerCase().equals("non")){
			Confirmation = "Oui";
		 }else{
			 Confirmation = "Non";
		 }
	}
	
	
	
	

}
