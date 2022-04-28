package fr.m2i.capgemini.java.corrections.distributeur;

import java.util.Scanner;

public class Dab {

	private static Scanner scanner;

	private Compte compte;
	//private Compte[] comptes;

	public Dab(Compte compte) {
		this.compte = compte;
	}

	public Compte getCompte() {
		return compte;
	}

//	public Compte[] getComptes() {
//		return comptes;
//	}

	public void activer() {

		scanner = new Scanner(System.in);

		int saisie = 0;

		do {
			System.out.println(String.format("1 - %s", Menu.Retrait));
			System.out.println(String.format("2 - %s", Menu.Depot));
			System.out.println(String.format("3 - %s", Menu.Solde));
			System.out.println(String.format("4 - %s", Menu.Quitter));

			try {
				System.out.println();
				saisie = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("\nVous devez saisir un entier");
				e.printStackTrace();
				return;
			}

			String affiche = "Vous avez fait le choix ";

			switch (saisie) {
			case 1: {
				System.out.println(affiche + saisie + "\n");
				break;
			}

			case 2:
				System.out.println(affiche + saisie);
				break;

			case 3:
				System.out.println(affiche + saisie);
				break;

			case 4:
				System.out.println(affiche + saisie + "\nMerci et au revoir");
				break;

			default:
				System.out.println("Votre choix ne peut etre prise en compte");
				break;
			}
		} while (saisie != 4);
	}
}
