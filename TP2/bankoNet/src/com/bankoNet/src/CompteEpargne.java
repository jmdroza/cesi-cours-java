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
	
	public void crediter(double somme) {
		if(somme < 0 ) {
			System.out.println("Vous ne pouvez pas créditer une somme négative");
		}else {
			this.solde += somme;
		}
		
	}
	
	public void debiter(double somme) {
		this.solde -= somme;
	}
	
	public double calculerInteret() {
		return this.solde * this.tauxInteret;
	}

}
