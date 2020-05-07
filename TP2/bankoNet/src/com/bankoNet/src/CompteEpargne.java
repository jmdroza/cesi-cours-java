package com.bankoNet.src;

public class CompteEpargne extends Compte{
	private double tauxInteret;
	
	public CompteEpargne() {
		super();
	}
	
	public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
		super(numero, intitule, solde);
		this.tauxInteret = tauxInteret;
	}
	
	public boolean equals(CompteEpargne cptEpargne) {
		return super.equals(cptEpargne) && this.getTauxInteret() == cptEpargne.getTauxInteret();
	}
	
	public void crediter(double somme) {
		if(somme < 0 ) {
			System.out.println("Vous ne pouvez pas créditer une somme négative");
		}else {
			this.solde += somme;
		}
		
	}
	
	public void debiter(double somme) {
		if(somme > 0) {
			if((this.solde - somme) < 0) {
				System.out.println("Opération non-autorisé, vous n'avez pas assez de liquidité sur ce compte");
			}else {
				this.solde -= somme;
			}
		}
	}
	
	public boolean isDebitAutorise(double somme) {
		if(somme > 0) {
			if((this.solde - somme) < 0) {
				return false;
			}
				return true;
		}
		return false;
	}
	
	public double calculerInteret() {
		return this.solde * this.tauxInteret;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	

}
