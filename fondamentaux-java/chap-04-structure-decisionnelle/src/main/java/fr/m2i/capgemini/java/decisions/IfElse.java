package fr.m2i.capgemini.java.decisions;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// Permet de recuperer une saisie depuis la console
		Scanner saisie = new Scanner(System.in);

		System.out.print("Entrez votre age : ");

		if (saisie.hasNextInt()) {
			// La saisie est OK
			int age = saisie.nextInt();
//			
//			if(age > 18) {
//				System.out.println("Majeur");
//			}else {
//				System.out.println("Mineur");
//			}		
			
//			if(age >= 10 && age <15) {
//				System.out.println("Vous etes en categorie poussin");
//			}else if(age >=15 && age < 18) {
//				System.out.println("Vous etes en categorie mini");
//			}else if(age >=18 && age < 25) {
//				System.out.println("Vous etes en categorie cadet");
//			}else {
//				System.out.println("Vous etes en categorie LC");
//			}
			
			if(age >= 10 && age <15) {
				System.out.println("Vous etes en categorie poussin");
			}

			if(age >=15 && age < 18) {
				System.out.println("Vous etes en categorie mini");
			}
			
			if(age >=18 && age < 25) {
				System.out.println("Vous etes en categorie cadet");
			}else {
				System.out.println("Vous etes en categorie LC");
			}		
			
		}else {
			System.out.println("Attention à votre saisie, un entier est attendu !!!");
		}

		saisie.close();
	}
}