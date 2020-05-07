package com.bankoNet.src;

public class Client {
	private String identifiant;
	private String nom;
	private String prenom;
	
	private CompteCourant cptCourant;
	private CompteEpargne cptEpargne;
	
	public Client(String identifiant, String nom, String prenom, CompteCourant cptCourant, CompteEpargne cptEpargne) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.cptCourant = cptCourant;
		this.cptEpargne = cptEpargne;
	}
	
	@Override
	public String toString() {
		return "Client id: " + this.identifiant + ", nom : " + this.nom + " prenom : " + this.prenom+" avoir total : "+ this.calculerAvoirGlobal();
	}
	
	public double calculerAvoirGlobal () {
		double avoir = 0;
		if(this.cptCourant!=null) {
			avoir += this.cptCourant.getSolde();
		}
		if(this.cptEpargne != null){
			avoir += this.cptEpargne.getSolde();
		}
		return avoir;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public CompteCourant getCptCourant() {
		return cptCourant;
	}

	public void setCptCourant(CompteCourant cptCourant) {
		this.cptCourant = cptCourant;
	}

	public CompteEpargne getCptEpargne() {
		return cptEpargne;
	}

	public void setCptEpargne(CompteEpargne cptEpargne) {
		this.cptEpargne = cptEpargne;
	}
	
	
}
