package com.bankoNet.src;

import java.util.List;

public class Client {
	private String identifiant;
	private String nom;
	private String prenom;
	
	private List<CompteCourant> lstCptCourant;
	private List<CompteEpargne> lstCptEpargne;
	
	public Client(String identifiant, String nom, String prenom, CompteCourant cptCourant, CompteEpargne cptEpargne) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		
		if(cptCourant != null) {
			this.lstCptCourant.add(cptCourant);
		}
		if(cptEpargne != null) {
			this.lstCptEpargne.add(cptEpargne);
		}
	}
	
	@Override
	public String toString() {
		return "Client id: " + this.identifiant + ", nom : " + this.nom + " prenom : " + this.prenom+" avoir total : "+ this.calculerAvoirGlobal();
	}
	
	public double calculerAvoirGlobal () {
		double avoir = 0;
		if(this.lstCptCourant!=null && !this.lstCptCourant.isEmpty()) {
			for(CompteCourant cptCourant : this.lstCptCourant) {
				avoir += cptCourant.getSolde();
			}
		}
		if(this.lstCptEpargne!=null && !this.lstCptEpargne.isEmpty()) {
			for(CompteEpargne cptEpargne : this.lstCptEpargne) {
				avoir += cptEpargne.getSolde();
			}
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


	
	
}
