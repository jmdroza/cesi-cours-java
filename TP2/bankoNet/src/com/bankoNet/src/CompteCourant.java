package com.bankoNet.src;

public class CompteCourant {
	private String numero;
	private String intitule;
	private double solde;
	private double montantDecouvertAutorise;
	public static int nbCompteCourant = 0;
	
	public CompteCourant() {
		nbCompteCourant++;
	}
	
	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		this();
		if(solde < 0) {
			System.out.println("On ne peut pas creer de compte avec un sole negatif.");
			solde = 0;
		}else {
			this.solde = solde;
		}
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}
	
	@Override
	public String toString() {
		return "Compte n� " + this.numero + ", intitule : " + this.intitule + " votre solde est de " + this.solde+".";
	}
	
	
	public void afficher() {
		System.out.println(this.toString());
	}
	
	public void crediter(double somme) {
		if(somme < 0 ) {
			System.out.println("Vous ne pouvez pas cr�diter une somme n�gative");
		}else {
			this.solde += somme;
		}
		
	}
	
	public void debiter(double somme) {
		double soldeTmp = 0;
		if((soldeTmp = this.solde - somme) < - this.montantDecouvertAutorise) {
			System.out.println("Op�ration non-autoris�, la somme a d�bit� d�passe le montant d�couvert autoris�");
		}else {
			this.solde -= somme;
		}
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
