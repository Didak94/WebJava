package modele;

import java.sql.Date;

public class Vol {

	private int NumeroVol;
	private String Destination;
	private Date DateDepart;
	private int NombrePlaces;
	private int Prix;
	
	
	public Vol(int numeroVol, String destination, Date dateDepart,
			int nombrePlaces, int prix) {
		
		NumeroVol = numeroVol;
		Destination = destination;
		DateDepart = dateDepart;
		NombrePlaces = nombrePlaces;
		Prix = prix;
	}


	@Override
	public String toString() {
		return "Vol [NumeroVol=" + NumeroVol + ", Destination=" + Destination
				+ ", DateDepart=" + DateDepart + ", NombrePlaces="
				+ NombrePlaces + ", Prix=" + Prix + "]";
	}


	public int getNumeroVol() {
		return NumeroVol;
	}


	public void setNumeroVol(int numeroVol) {
		NumeroVol = numeroVol;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}


	public Date getDateDepart() {
		return DateDepart;
	}


	public void setDateDepart(Date dateDepart) {
		DateDepart = dateDepart;
	}


	public int getNombrePlaces() {
		return NombrePlaces;
	}


	public void setNombrePlaces(int nombrePlaces) {
		NombrePlaces = nombrePlaces;
	}


	public int getPrix() {
		return Prix;
	}


	public void setPrix(int prix) {
		Prix = prix;
	}
	
	

}
