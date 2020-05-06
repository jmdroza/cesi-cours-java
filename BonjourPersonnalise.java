import java.util.Scanner; 
import java.util.*;


public class BonjourPersonnalise {

	public static void main(String[] args) {
		String prenom = null;
		try{
			prenom = args[0];
		}catch(Exception e){
			System.out.println("Nombre de parametre invalide");
			System.out.println("Le format attendu est");
			System.out.println("java BonjourPersonnalise prenom");
		}
		if(prenom != null){
			System.out.println("Bonjour " + prenom);
		}
	}

}