package com.bankoNet.src;

abstract class Compte {
	protected String numero;
	protected String intitule;
	protected double solde;
	
	protected Compte() {
		
	}
	
	protected Compte(String numero, String intitule, double solde) {
		if(solde < 0) {
			System.out.println("On ne peut pas creer de compte avec un solde negatif.");
			solde = 0;
		}else {
			this.solde = solde;
		}
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
	}
	
	public void debiter(double somme) {
		if(isDebitAutorise(somme)) {
			solde -= somme;
		}
	}
	
	abstract void crediter(double somme);
	
	abstract boolean isDebitAutorise(double somme);
	
	@Override
	public String toString() {
		return "Compte n° " + this.numero + ", intitule : " + this.intitule + " votre solde est de " + this.solde+".";
	}
	
	@Override
	public boolean equals(Object cpt) {
		Compte cpt1 = (Compte) cpt;
		if(this.intitule == cpt1.intitule && this.numero == cpt1.numero && this.solde == cpt1.solde) {
			return true;
		}else {
			return false;
		}
	}

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
	
}
