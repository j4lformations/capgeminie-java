package fr.m2i.capgemini.java.declaration;

public class Variable {
	
	static int age;

	public static void main(String[] args) {
		// Une declaration de variable
		int stagiaireId;

		// Assignation de valeur ou une initialisation de varible
		stagiaireId = 12;

		// On affiche le contenu de la variable
		System.out.println(stagiaireId);

		stagiaireId = 25;
		System.out.println(stagiaireId);

		// Pas possible car la variable est de type int
		// stagiaireId = 25.4;

		// On utilse le printf pour formater l'affichage
		System.out.printf("idStagiaire = %s\n", stagiaireId);

		// Une declaration suivie d'une assignation de valeur
		double longueur = 15.2;
		System.out.printf("longueur = %s\n", longueur);

		int var1, var2, var = 3;

		// Utilisation du mot cle var depuis java 10
		var uneAutreVariable = "Joachim";
		System.out.println(uneAutreVariable);
		
		int autreAge = 53;
		
		System.out.printf("age = %s\n", age);
		System.out.printf("autreAge = %s\n", autreAge);
	}
}
