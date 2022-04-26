package fr.m2i.capgemini.java;

/**
 * Classe permettant d'introduire la decouverte du Java
 * 
 * @author Joachim
 *
 */
public class Bonjour {
	// On ne peut que declarer des variables
	// On ne peut declarer des methodes

	/**
	 * C'est la point d'entrée de tout prog java executable
	 */
	public static void main(String... s) {
		/*
		 * La commande suivante nous permet d'afficher dans la console le message
		 * "Bonjour Java"
		 */
		System.out.println("Bonjour Java");
		System.out.println("Bonjour Cap-Gemini");
		System.out.print(2);
		System.out.println("Joachim");
		System.out.println(4 + 3);
	}
}

/**
 * Possible mais deconseiller. On prefere utiliser un fichier par classe
 * 
 * @author Joachim
 *
 */
class Simple {
	public static void main(String[] args) {
		System.out.println("Autre Bonjour");
	}
}
