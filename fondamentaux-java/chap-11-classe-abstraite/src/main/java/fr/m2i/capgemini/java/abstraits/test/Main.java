package fr.m2i.capgemini.java.abstraits.test;

import fr.m2i.capgemini.java.abstraits.Animal;
import fr.m2i.capgemini.java.abstraits.Chien;
import fr.m2i.capgemini.java.concretes.Chat;
import fr.m2i.capgemini.java.concretes.Lion;

public class Main {

	public static void main(String[] args) {
		
		// Animal animal = new Animal("Transparant", 0); //==> Ne compile pas
		Animal animal ;
		
		animal = new Chat("Blanche", 3.5);
		System.out.println(animal);
		
//		System.out.println(animal.getClass().getSimpleName());
//		
//		System.out.println(animal instanceof Animal);
//		System.out.println(animal instanceof Chat);
		
		System.out.println();
		
		animal = new Lion("Fauve", 250.);
		System.out.println(animal);
		
		System.out.println();
		
		animal = new Chien("Tigré", 20.5);
		System.out.println(animal);
		
	}
}
