package fr.m2i.capgemini.java.operateurs;

public class Operateurs {

	public static void main(String[] args) {
		/*
		 * Operateurs Arithmetiques => (+,-,*,/,%) Operateurs Relationnels =>
		 * (>,>=,==,!=,<=,<) Operateurs Assignations => (=, ++) Operateur de conversion
		 * ou cast => ()
		 */

		System.out.println(5 + 2.6);
		System.out.println("Joac" + "him");

		// L'operateur + est polymorphe

		int poids = 15;
//		System.out.println("poids = " + poids);
//
//		// ++ operateur post-incrementation : poids++ ==> poids = poids + 1
//		// ++ operateur pre-incrementation : ++poids ==> poids = poids + 1
//
//		System.out.println("poids = " + poids++);
//		System.out.println("poids = " + ++poids);
//		System.out.println(poids);
//
//		// -- operateur post-decrementation : poids-- ==> poids = poids - 1
//		// -- operateur pre-decrementation : --poids ==> poids = poids - 1
//
//		System.out.println("poids = " + poids--);
//		System.out.println("poids = " + --poids);
//		System.out.println(poids);

		/*
		 * Les Operateurs Logiques ( &&, &, ||, |, ^, ! )
		 */

		boolean a = true;
		boolean b = false;

		System.out.printf("b && a = %s%n", b && a);
		System.out.printf("b & a = %s%n", b & a);

		System.out.printf("a || b = %s%n", a || b);
		System.out.printf("a | b = %s%n", a | b);

		a = false;

		System.out.printf("a ^ b = %s%n", a ^ b);
		System.out.printf("!a = %s%n", !a);

		// Priorité de certains operateurs
		int j = 1, k = -5;
		System.out.println("priorité = " + 3 * poids++ * --j + k++);

		System.out.println("==================================");

		System.out.println(5 + 3);
		System.out.println("5" + "3");
		System.out.println("5" + 3);
		System.out.println(5 + "3");

		System.out.println(5 + "10" + 5);

		System.out.println(16 / 2);
		System.out.println(15. / 2);
		//System.out.println(15 / 0);
		System.out.println(15. / 0);
		System.out.println(0 / .0);		
	}
}
