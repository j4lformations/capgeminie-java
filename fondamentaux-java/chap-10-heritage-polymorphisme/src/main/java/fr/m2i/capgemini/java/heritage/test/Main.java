package fr.m2i.capgemini.java.heritage.test;

import java.time.LocalDate;

import fr.m2i.capgemini.java.classes.Personne;
import fr.m2i.capgemini.java.heritage.Stagiaire;
import fr.m2i.capgemini.java.heritage.StagiaireSalarie;

public class Main extends Object {

	public static void main(String[] args) {
		Stagiaire pierrot = new Stagiaire("Pierrot", "POE CAPGEMINI", LocalDate.of(1996, 05, 05));

		System.out.println(pierrot.getFormation());
		System.out.println(pierrot.getPrenom());
		// System.out.println(pierrot.getAge()); //==> methode private

		Stagiaire pierrette = new Stagiaire("Pierrette", "POE ATOS", LocalDate.of(1996, 05, 05));
		System.out.println(pierrette);

		System.out.println();

		// pierrette.seMarier(pierrot);

		// System.out.println(pierrot.affiche());

		Personne nicolas = new Personne("Nicolas", LocalDate.of(1960, 03, 03));

		System.out.println("\n============================================\n");

		System.out.println(nicolas);

		nicolas = pierrot;

		pierrette = (Stagiaire) nicolas;

		System.out.println(nicolas.getClass().getSimpleName());

		System.out.println(nicolas instanceof Stagiaire);
		
		//Stagiaire kim = (Stagiaire) new Personne("Kim", LocalDate.of(1971, 04, 01)); 
		//System.out.println(kim);// ==> Ne compilera pas

		/*
		 * La methode affiche est dite polymorphe *
		 */

		// int[] entiers = { 1, 2, 3, 4 };

		StagiaireSalarie ss = new StagiaireSalarie("Manou", "Science PO", LocalDate.of(1976, 01, 01), 120000);

		// System.out.println(ss.affiche());
		
		Personne[] personnes = { pierrot, pierrette, nicolas, ss };

		for (Personne personne : personnes) {
			System.out.println(personne);
			System.out.println();
		}
		
		Personne a = new Personne("Alain", LocalDate.now());
		Personne b = new Personne("alain", LocalDate.now());
		
		
		// Pour pouvoir comparer egalitairement 2 objets, il faut redefinir la methode equals 
		System.out.println(a.equals(b));
		
		System.out.println(a.plus(b));
		
		
		String prenom = "Joachim";
		String autrePrenom = "Joachim";		
		System.out.println(prenom == autrePrenom);		
		
		prenom = new String("Joachim");
		autrePrenom = new String("Joachim");
		System.out.println(prenom == autrePrenom);	
		System.out.println(prenom.equals(autrePrenom));	
	}
}
