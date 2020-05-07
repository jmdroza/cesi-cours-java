package com.bankoNet.src;

abstract class Compte {
	protected String numero;
	protected String intitule;
	protected double solde;
	
	protected Compte() {
		
	}
	
	protected Compte(String numero, String intitule, double solde) {
		if(solde < 0) {
			System.out.println("On ne peut pas creer de compte avec un sole negatif.");
			solde = 0;
		}else {
			this.solde = solde;
		}
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
	}
	
	abstract void debiter(double somme);
	
	abstract void crediter(double somme);
	
	@Override
	public String toString() {
		return "Compte n° " + this.numero + ", intitule : " + this.intitule + " votre solde est de " + this.solde+".";
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
