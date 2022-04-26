package fr.m2i.capgemini.java.conversions;

public class Conversion {

	public static void main(String[] args) {

		byte unByte = 45;
//		System.out.println(unByte);

		int unInt, grandEntier;

		unInt = 45;
//		System.out.println(unInt);

		unInt = unByte; // Conversion implicite
		System.out.println(unInt);

		unByte = (byte) unInt; // Conversion explicite
		System.out.println(unByte);

		grandEntier = 1234567;
		unByte = (byte) grandEntier;
		System.out.println(unByte);

		int monEntier = 12;
		System.out.println(monEntier);

		monEntier = monEntier + 1;
		System.out.println(monEntier);

		byte b = 95;
		// b = b + 1; // ne compile pas en java
		b += 1; // ==> b = b + 1;
		b++;
		System.out.println(b);
	}

}
