package com.bankoNet.test;
import java.util.*;
import com.bankoNet.CompteCourant;

public class CompteCourantTest{
	@org.junit.Test
	public void methodeDeTest() {
		CompteCourant compteCourant1 = new CompteCourant("003","CompteFamille", 1250, 300);
		CompteCourant compteCourant2 = new CompteCourant("025","CompteEntreprise", 6500, 600);
		CompteCourant compteCourant3 = new CompteCourant("037","CompteEtude", 250, 50);
		
		ArrayList<CompteCourant> listeCompte = new ArrayList<CompteCourant>();
		listeCompte.add(compteCourant1);
		listeCompte.add(compteCourant2);
		listeCompte.add(compteCourant3);
		
		for(CompteCourant compte : listeCompte) {
			compte.afficherCompte();
		}
		org.junit.Assert.assertTrue(CompteCourant.getNbCompteCourant() == 3);

	}
}
