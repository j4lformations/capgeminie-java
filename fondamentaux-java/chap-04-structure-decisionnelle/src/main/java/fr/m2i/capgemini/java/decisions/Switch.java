package fr.m2i.capgemini.java.decisions;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);

		System.out.print("Saisir un entier : ");
		int val = saisie.nextInt();
		String jourDeLaSemaine;

		switch (val) {
		case 1:
			jourDeLaSemaine = "Lundi";
			break;
		case 2:
			jourDeLaSemaine = "Mardi";
			break;
		case 3:
			jourDeLaSemaine = "Mercredi";
			break;
		case 4:
			jourDeLaSemaine = "Jeudi";
			break;
		case 5:
			jourDeLaSemaine = "Vendredi";
			break;
		case 6:
			jourDeLaSemaine = "Samedi";
			break;
		case 7:
			jourDeLaSemaine = "Dimanche";
			break;
		default:
			jourDeLaSemaine = "Numero nos pris en charge";
			break;
		}
		
		System.out.println(jourDeLaSemaine);
		saisie.close();
	}
}
