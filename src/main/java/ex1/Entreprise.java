package ex1;

/** classe de définition d'entitée Entreprise
 * 
 * @author Poyatos Rémi
 * 
 */

import java.util.Date;

public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date date_Creation;
	
	public static final int CAPITAL_MAX = 3000000;
	
	public void Afficher_statut(){
		
	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDate_Creation() {
		return date_Creation;
	}

	public void setDate_Creation(Date date_Creation) {
		this.date_Creation = date_Creation;
	}
	
}
