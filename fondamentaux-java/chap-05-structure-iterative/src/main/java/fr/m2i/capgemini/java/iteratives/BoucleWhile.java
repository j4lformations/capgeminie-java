package fr.m2i.capgemini.java.iteratives;

public class BoucleWhile {

	public static void main(String[] args) {

		/*
		 * La boucle TantQue en algo
		 */
//		int compteur = 1, val = 3;
//
//		while (compteur <= 10) {
//			// Ici la condition est OK
//			System.out.printf("%s\t", compteur * val);
//			compteur++;
//		}
//		int multiplicateur = 1, table = 1;
//		
//		while(multiplicateur <=10) {
//			System.out.printf(multiplicateur + " x " + table + " = " + "%s\n",multiplicateur*table);
//			
//			multiplicateur++;			
//		}

		// i * j = r

		int i = 11;

		while (i <= 10) {
			System.out.printf("\nTable de %s%n%n", i);

			int j = 1;
			while (j <= 10) {
				System.out.printf("%s x %s = %s%n", i, j, i * j);
				j++;
			}
			i++;
		}
	}
}
