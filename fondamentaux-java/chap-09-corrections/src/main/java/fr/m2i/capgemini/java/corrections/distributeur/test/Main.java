package fr.m2i.capgemini.java.corrections.distributeur.test;

import fr.m2i.capgemini.java.corrections.distributeur.Compte;
import fr.m2i.capgemini.java.corrections.distributeur.Dab;

public class Main {

	public static void main(String[] args) {
		
		Compte compte = new Compte("001", 1500.);
		
		Dab dab = new Dab(compte);
		
		dab.activer();
	}
}
