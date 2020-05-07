package com.bankoNet.test;
import com.bankoNet.src.CompteEpargne;
import org.junit.Test;
import org.junit.Assert;

public class CompteEpargneTest {
	CompteEpargne compteEpargne1;
	CompteEpargne compteEpargne2;
	
	@Test
	public void crediterTest() {
		compteEpargne1 = new CompteEpargne("025", "CompteRetraite", 2850, 0.10);
		compteEpargne1.crediter(150);
		Assert.assertTrue(compteEpargne1.getSolde() == 3000);
	}
	
	@Test
	public void debiterTest() {
		compteEpargne2 = new CompteEpargne("026", "CompteSecret", 6000, 0.05);
		compteEpargne2.debiter(50);
		Assert.assertTrue(compteEpargne2.getSolde() == 5950);
	}
	
	@Test
	public void contructeurEtEqualsTest() {
		compteEpargne1 = new CompteEpargne("025", "CompteRetraite", 2850, 0.10);
		compteEpargne2 = new CompteEpargne("025", "CompteRetraite", 2850, 0.10);
		Assert.assertTrue(compteEpargne1.equals(compteEpargne2));
		Assert.assertTrue(compteEpargne1.getNumero() == "025");
		Assert.assertTrue(compteEpargne1.getIntitule() == "CompteRetraite");
		Assert.assertTrue(compteEpargne1.getSolde() == 2850);
		Assert.assertTrue(compteEpargne1.getTauxInteret() == 0.10);
	}

}
