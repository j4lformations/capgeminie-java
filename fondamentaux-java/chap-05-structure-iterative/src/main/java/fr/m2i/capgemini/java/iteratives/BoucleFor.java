package fr.m2i.capgemini.java.iteratives;

public class BoucleFor {

	public static void main(String[] args) {
		int val = 3;

		for (int compteur = 1; compteur <= 10; compteur++) {
			System.out.printf("%s\t", compteur * val);
		}
	}
}
