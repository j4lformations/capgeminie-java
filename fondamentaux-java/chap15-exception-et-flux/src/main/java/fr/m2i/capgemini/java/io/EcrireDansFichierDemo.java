package fr.m2i.capgemini.java.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EcrireDansFichierDemo {

	public static void main(String[] args) {
		/*
		 * L'API java fourni plusieurs classes que nous pouvons utiliser pour ecrire des
		 * données dans un fichier et aussi lire des données depuis un fichier.
		 * 
		 * On pourra utiliser par exemple la PrintWriter et eventuellement la classe
		 * FileWriter
		 */

		PrintWriter pw = null;
		try {

//			// Permet de creer un fichier s'il n'existe pas
//			PrintWriter fichierSortie = new PrintWriter("datasStagaires.txt");
//
//			fichierSortie.println("Joachim");
//			fichierSortie.println("Tarek");
//			fichierSortie.println("Pierrot");
//			fichierSortie.println("Rasha");
//			fichierSortie.println("Manou");
//
//			/*
//			 * On ferme la ressource, ce qui a pour effet de mettre a jour le fichier
//			 */
//			fichierSortie.close();

			/*
			 * Dans certains cas, on souhaite garder notre fichier avec son contenu et
			 * ecrire à la suite
			 */

			FileWriter fw = new FileWriter("mesAmis.txt", true);
			pw = new PrintWriter(fw);

			pw.println("Kim ");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			pw.close();
		}

	}
}