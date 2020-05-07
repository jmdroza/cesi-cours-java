package com.bankoNet.src;

import com.bankoNet.src.Compte;

public class CompteCourant extends Compte{
	public static int nbCompteCourant = 0;
	private double montantDecouvertAutorise;
	
	public CompteCourant() {
		super();
	}
	
	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		super(numero, intitule, solde);
		nbCompteCourant++;
		if(montantDecouvertAutorise < 0) {
			this.montantDecouvertAutorise = -montantDecouvertAutorise;
		}else {
			this.montantDecouvertAutorise= montantDecouvertAutorise;
		}
	}
	
	public void afficher() {
		System.out.println(this.toString());
	}
	public void crediter(double somme) {
		if(somme < 0 ) {
			System.out.println("Vous ne pouvez pas créditer une somme négative");
		}else {
			this.solde += somme;
		}
		
	}
	
	public boolean equals(CompteCourant cptCourant) {
		return super.equals(cptCourant) && this.getMontantDecouvertAutorise() == cptCourant.getMontantDecouvertAutorise();
	}
	
	public boolean isDebitAutorise(double somme) {
		if(somme > 0) {
			if((this.solde - somme) < - this.montantDecouvertAutorise) {
				return false;
			}
				return true;
		}
		return false;
	}
	
	//Getter & Setter
	public static int getNbCompteCourant() {
		return nbCompteCourant;
	}

	public double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

}
