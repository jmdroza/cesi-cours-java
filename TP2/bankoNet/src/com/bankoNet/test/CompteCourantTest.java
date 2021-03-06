package com.bankoNet.test;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

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
		System.out.println("--- D�but Test de nbCompteCourant ---");
		//GIVEN - WHEN
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
		//THEN
		Assert.assertTrue(CompteCourant.getNbCompteCourant() == 4);
		System.out.println("--- Fin Test de nbCompteCourant ---");
	}
	
	@Test
	public void crediterMtPositifTest() {
		System.out.println("--- D�but Test de cr�diter montant positif ---");
		//GIVEN
		compteCourant1 = new CompteCourant("003","CompteFamille", 1250, 300);
		//WHEN
		compteCourant1.crediter(5000);
		//THEN
		Assert.assertTrue(compteCourant1.getSolde() == 6250);
		System.out.println("--- Fin Test de cr�diter montant positif ---");
	}
	@Test
	public void crediterMtNegatifTest() {
		System.out.println("--- D�but Test de cr�diter montant n�gatif ---");
		//GIVEN
		compteCourant2 = new CompteCourant("003","CompteFamille", 1250, 300);
		//WHEN
		compteCourant2.crediter(-250);
		//THEN
		Assert.assertTrue(compteCourant2.getSolde() == 1250);
		System.out.println("--- Fin Test de cr�diter montant n�gatif ---");
	}

	
	@Test
	public void debiterMtPositifTest() {
		System.out.println("--- D�but Test de d�biter montant positif ---");
		compteCourant3 = new CompteCourant("005","CompteEtude", 5250, 50);
		compteCourant3.debiter(5000);
		Assert.assertTrue(compteCourant3.getSolde() == 250);
		System.out.println("--- Fin Test de d�biter montant positif ---");
	}
	
	@Test
	public void debiterDepassementSoldeTest() {
		System.out.println("--- D�but Test de d�biter pour d�passer le solde ---");
		compteCourant4 = new CompteCourant("006","CompteEntreprise", 5400, 300);
		compteCourant4.debiter(8000);
		Assert.assertTrue(compteCourant4.getSolde() == 5400);
		System.out.println("--- Fin Test de d�biter pour d�passer le solde ---\n");
	}
	
	@Test
	public void toStringTest() {
		System.out.println("--- D�but Test toString ---");
		compteCourant1 = new CompteCourant("003","CompteFamille", 1250, 300);
		Assert.assertTrue(compteCourant1.toString().contentEquals("Compte n� 003, intitule : CompteFamille votre solde est de 1250.0."));
		System.out.println("--- Fin Test toString ---");
	}
	
	@Test
	public void constructeurEtEqualsTest() {
		System.out.println("--- D�but Test toString ---");
		compteCourant1 = new CompteCourant("003","CompteFamille", -20, -300);
		CompteCourant compteValide = new CompteCourant("003","CompteFamille", 0, 300);
		Assert.assertTrue(compteCourant1.equals(compteValide));
		Assert.assertTrue(compteCourant1.getNumero() == "003");
		Assert.assertTrue(compteCourant1.getIntitule() == "CompteFamille");	
		Assert.assertTrue(compteCourant1.getSolde() == 0.0);
		Assert.assertTrue(compteCourant1.getMontantDecouvertAutorise() == 300);
		System.out.println("--- Fin Test toString ---");
	}
}
