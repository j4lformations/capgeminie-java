package fr.m2i.capgemini.java.corrections.rationnel.test;

import fr.m2i.capgemini.java.corrections.rationnel.Rationnel;

public class Main {

	public static void main(String[] args) {
		Rationnel a = new Rationnel(1, 2);
		Rationnel b = new Rationnel(4, 3);

		System.out.println("==== Question 1 ====\n");
		System.out.println("numA = " + a.getNumerateur());
		System.out.println("denA = " + a.getDenominateur());

		System.out.println("numB = " + b.getNumerateur());
		System.out.println("denB = " + b.getDenominateur());

		System.out.println("\n==== Question 2-a ====\n");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("\n==== Question 2-b ====\n");
		System.out.println("c = " + Rationnel.create(5, 2));
		
		System.out.println("\n==== Question 2-c ====\n");
		System.out.println("d = " + Rationnel.create(5, 2));

	}

}
