package com.bankoNet.test;
import java.util.*;
import org.junit.Before;
import org.junit.Test;

import com.bankoNet.src.CompteCourant;

public class CompteCourantTest{
	CompteCourant compteCourant1;
	CompteCourant compteCourant2;
	CompteCourant compteCourant3;
	CompteCourant compteCourant4;
	
	@Before
	public void init() {
		CompteCourant.nbCompteCourant = 0;
	}
	
	@Test
	public void IncrementCompteCourantTest() {
		System.out.println("--- Début Test de nbCompteCourant ---");
		compteCourant1 = new CompteCourant("003","CompteFamille", 1250, 300);
		compteCourant2 = new CompteCourant("004","CompteEntreprise", 6500, 600);
		compteCourant3 = new CompteCourant("005","CompteEtude", 5250, 50);
		compteCourant4 = new CompteCourant("006","CompteEntreprise", 5400, 300);
		ArrayList<CompteCourant> listeCompte = new ArrayList<CompteCourant>();
		listeCompte.add(compteCourant1);
		listeCompte.add(compteCourant2);
		listeCompte.add(compteCourant3);
		listeCompte.add(compteCourant4);
		
		for(CompteCourant compte : listeCompte) {
			compte.afficher();
		}
		org.junit.Assert.assertTrue(CompteCourant.getNbCompteCourant() == 4);
		System.out.println("--- Fin Test de nbCompteCourant ---");
	}
	
	@Test
	public void crediterMtPositifTest() {
		System.out.println("--- Début Test de créditer montant positif ---");
		compteCourant1 = new CompteCourant("003","CompteFamille", 1250, 300);
		compteCourant1.crediter(5000);
		org.junit.Assert.assertTrue(compteCourant1.getSolde() == 6250);
		System.out.println("--- Fin Test de créditer montant positif ---");
	}
	@Test
	public void crediterMtNegatifTest() {
		System.out.println("--- Début Test de créditer montant négatif ---");
		compteCourant2 = new CompteCourant("003","CompteFamille", 1250, 300);
		compteCourant2.crediter(-250);
		org.junit.Assert.assertTrue(compteCourant2.getSolde() == 1250);
		System.out.println("--- Fin Test de créditer montant négatif ---");
	}

	
	@Test
	public void debiterMtPositifTest() {
		System.out.println("--- Début Test de débiter montant positif ---");
		compteCourant3 = new CompteCourant("005","CompteEtude", 5250, 50);
		compteCourant3.debiter(5000);
		org.junit.Assert.assertTrue(compteCourant3.getSolde() == 250);
		System.out.println("--- Fin Test de débiter montant positif ---");
	}
	
	@Test
	public void debiterDepassementSoldeTest() {
		System.out.println("--- Début Test de débiter pour dépasser le solde ---");
		compteCourant4 = new CompteCourant("006","CompteEntreprise", 5400, 300);
		compteCourant4.debiter(8000);
		org.junit.Assert.assertTrue(compteCourant4.getSolde() == 5400);
		System.out.println("--- Fin Test de débiter pour dépasser le solde ---");
	}
}
