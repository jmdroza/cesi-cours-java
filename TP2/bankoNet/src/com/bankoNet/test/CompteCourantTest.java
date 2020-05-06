package com.bankoNet.test;
import java.util.*;
import com.bankoNet.src.CompteCourant;

public class CompteCourantTest{
	@org.junit.Test
	public void methodeDeTest() {
		System.out.println("--- Début Test de nbCompteCourant ---");
		CompteCourant compteCourant1 = new CompteCourant("003","CompteFamille", 1250, 300);
		CompteCourant compteCourant2 = new CompteCourant("004","CompteEntreprise", 6500, 600);
		CompteCourant compteCourant3 = new CompteCourant("005","CompteEtude", 250, 50);
		
		ArrayList<CompteCourant> listeCompte = new ArrayList<CompteCourant>();
		listeCompte.add(compteCourant1);
		listeCompte.add(compteCourant2);
		listeCompte.add(compteCourant3);
		
		for(CompteCourant compte : listeCompte) {
			compte.afficher();
		}
		org.junit.Assert.assertTrue(CompteCourant.getNbCompteCourant() == 3);
		System.out.println("--- Fin Test de nbCompteCourant ---");
	}
	@org.junit.Test
	public void crediterTest() {
		System.out.println("--- Début Test de créditer ---");
		CompteCourant compteCourant1 = new CompteCourant("006","CompteEntreprise", 5400, 300);
		compteCourant1.crediter(5000);
		org.junit.Assert.assertTrue(compteCourant1.solde == 10400);
		System.out.println("--- Fin Test de créditer ---");
	}
	
	@org.junit.Test
	public void debiterTest() {
		System.out.println("--- Début Test de débiter ---");
		CompteCourant compteCourant1 = new CompteCourant("007","CompteEntreprise", 5400, 300);
		compteCourant1.debiter(5000);
		org.junit.Assert.assertTrue(compteCourant1.solde == 400);
		System.out.println("--- Fin Test de débiter ---");
	}
}
