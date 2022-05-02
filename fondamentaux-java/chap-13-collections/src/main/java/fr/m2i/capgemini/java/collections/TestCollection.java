package fr.m2i.capgemini.java.collections;

import java.util.ArrayList;

public class TestCollection {

	public static void main(String[] args) {
		
		ArrayList maListe = new ArrayList();
		
		maListe.add("Victor");
		maListe.add(10);
		
		System.out.println("taille = " + maListe.size());
		System.out.println(maListe);
		
		String prenom = (String) maListe.get(0);
		int age = (int) maListe.get(1);
		
		System.out.println(maListe.get(0));
	}
}