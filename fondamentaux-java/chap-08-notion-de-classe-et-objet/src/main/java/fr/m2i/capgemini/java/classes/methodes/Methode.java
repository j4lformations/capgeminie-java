package fr.m2i.capgemini.java.classes.methodes;

public class Methode {

	public static void main(String[] args) {
		// On fait appelle à la methode
//		salut("Antoine");
//		salut("Tarek");
//		salut("Ndeye");
//		salut(null);
//		salut();
//
//		double carre = calculCarre(5);
//		System.out.println(carre * carre%4);
		
		salut("25");
		
		Methode m = new Methode();
		m.autreCalculCarre("25");
	}

	/*
	 * Une methode est une fonction Elle donc un nom Elle peut ou non avoir des
	 * arguments Si elle possede des args, ils doivent etre definis avec des types
	 * precis
	 */
	static void salut(String prenom) {
		if (prenom != null) {
			System.out.println("Bonjour " + prenom);
		}
	}

	/*
	 * On fait une surcharge de methode
	 */
	static void salut() {
		System.out.println("Bonjour JAVA");
	}

	static void salut(int age) {
		System.out.println("Bonjour, vous avez " + age);
	}

	static void salut(String prenom, int age) {
		System.out.println("Bonjour, vous avez " + age);
	}

	static double calculCarre(double nombre) {
		// Les instructions
		// Et seulement apres les instructions, le return
		return Math.pow(nombre, 2);
	}
	
	double autreCalculCarre(String chaine) {
		return Double.parseDouble(chaine);
	}
}
