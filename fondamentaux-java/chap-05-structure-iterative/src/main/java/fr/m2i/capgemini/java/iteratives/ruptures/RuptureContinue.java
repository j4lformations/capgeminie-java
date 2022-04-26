package fr.m2i.capgemini.java.iteratives.ruptures;

public class RuptureContinue {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {

			if (i == 6) {
				continue; // La ruputre de sequence continue
			}
			System.out.println(3 + " x " + i + " = " + (i * 3));
		}
		System.out.println("Fin de la boucle"); 
	}
}
