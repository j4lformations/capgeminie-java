package fr.m2i.capgemini.java.tab;

import java.util.Arrays;

public class Tableau {

	public static void main(String[] args) {

		// Declaration d'une variable de type tableau
		double[] notes;

		// On initialise le tableau à une taille de 5
		notes = new double[5];

		System.out.println("taille = " + notes.length);

		notes[0] = 15.6;
		notes[1] = 8.3;
		notes[2] = 1;
		notes[3] = 18.3;
		notes[4] = 16;
		// notes[5] = 10; // Leve une exception

		System.out.println(Arrays.toString(notes));

		for (int i = 0; i < notes.length; i++) {
			System.out.println(notes[i]);
		}

		for (double note : notes) {
			System.out.println(note);
		}

		// int carrees[] = { 0, 1, 4, 9, 16, 25 };
		int[] carrees = { 0, 1, 4, 9, 16, 25 };
		System.out.println(Arrays.toString(carrees));

		int[][] comptes = { { 0, 1, 0 }, { 0, 1, 1 }, { -4, 2 }, { 7, -9, 8 }, { 12 }, { 14, 58, 20 } };

//		System.out.println(Arrays.toString(comptes));
		System.out.println(comptes[2][0]);
		System.out.println(comptes[4][0]);
		
	}
}
