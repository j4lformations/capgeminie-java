package fr.m2i.capgemini.java.classes.test;

import java.time.LocalDate;

import fr.m2i.capgemini.java.classes.Personne;

public class Main {

	public static void main(String[] args) {
//
//		Compte compte;// Declaration d'une variable de type Compte
//
//		/*
//		 * Initialisation de la variable compte Le mot cle new permet de construire un
//		 * objet compte On dit qu'on crée une instance de compte. Puis on l'affecte à la
//		 * variable compte
//		 */
//		compte = new Compte();
//		compte = new Compte("CPT01");
//		compte = new Compte("CPT01", 1500);
//
//		/*
//		 * Permet d'affiche une variable sous forme textuelle dans la console
//		 */
//		System.out.println(compte);
//
//		// On accede aux information de l'objet par la notation pointée
//		System.out.println("N° = " + compte.numero);
//		System.out.println("Solde = " + compte.solde);
//		
//		// On modifie l'eta de l'objet compte
//		compte.numero = "CPT01";
//		compte.solde = 500;
//		
//		System.out.println("N° = " + compte.numero);
//		System.out.println("Solde = " + compte.solde);
//		
//		compte.numero = "CPT02";
//		compte.solde = -500;
//		
//		System.out.println("N° = " + compte.numero);
//		System.out.println("Solde = " + compte.solde);
//
//		// compte.initiliseCompte("CPT01");
//
//		System.out.println("N° = " + compte.getNumero());
//		System.out.println("Solde = " + compte.getSolde());
//		
//		compte.setSolde(-5000);
//		
//		System.out.println("N° = " + compte.getNumero());
//		System.out.println("Solde = " + compte.getSolde());
//
//		System.out.println(compte.affiche());
		
		Personne alex = new Personne("Alex", LocalDate.of(1995, 05, 15));
				
//		System.out.println(alex.getPrenom());
//		System.out.println(alex.getDdn());
		System.out.println(alex);
		System.out.println(Personne.getCompteur());
		
		System.out.println();
		
		Personne aline = new Personne("Aline", LocalDate.of(2000, 06, 20));
		System.out.println(Personne.getCompteur());
		System.out.println(Personne.getCompteur());
		
		aline.seMarier(alex);
		
//		System.out.println(aline.getConjoint().getPrenom());
//		System.out.println(alex.getConjoint().getPrenom());
		
		System.out.println(aline);	
		System.out.println(alex);
		
	}
}