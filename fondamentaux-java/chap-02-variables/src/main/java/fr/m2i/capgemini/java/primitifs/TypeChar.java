package fr.m2i.capgemini.java.primitifs;

public class TypeChar {

	public static void main(String[] args) {
		/*
		 * Un char est un entier non signé et codé sur 2 octets soit 16 bits
		 * La notion de char va au dela du caratecre imprimable que nous connaissons
		 */

		System.out.println("==========Type Char==========");

		char unChar = 'f';
		System.out.printf("unChar = %s", unChar);

		System.out.println();

		char charMin = Character.MIN_VALUE;
		System.out.printf("charMin = %s", charMin);

		System.out.println();

		charMin = '\u0000';
		System.out.printf("charMin = %s\n", charMin);

		char charMax = Character.MAX_VALUE;
		System.out.printf("charMax = %s", charMax);

		System.out.println();

		charMax = '\uffff';
		System.out.printf("charMax = %s", charMax);
		
		char autreChar = 200;
		System.out.println(autreChar);

	}

}
