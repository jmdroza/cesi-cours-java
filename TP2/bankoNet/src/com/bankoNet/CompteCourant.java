package com.bankoNet;

public class CompteCourant {
	public String numero;
	public String intitule;
	public double solde;
	public double montantDecouvertAutorise;
	public static int nbCompteCourant = 0;
	
	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
		this.montantDecouvertAutorise = montantDecouvertAutorise;
		nbCompteCourant++;
	}
	
	public void afficherCompte() {
		System.out.println("Compte n° " + this.numero + ", intitule : " + this.intitule + " votre solde est de " + this.solde+".");
	}
	
	
	//Getter & Setter
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	public static int getNbCompteCourant() {
		return nbCompteCourant;
	}


}
