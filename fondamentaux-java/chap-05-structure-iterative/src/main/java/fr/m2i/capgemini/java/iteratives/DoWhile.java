package fr.m2i.capgemini.java.iteratives;

public class DoWhile {

	public static void main(String[] args) {
		int compteur = 11, val = 3;

		do {
			System.out.printf("%s\t", compteur * val);
			compteur++;
		} while (compteur <= 10);
	}
}
