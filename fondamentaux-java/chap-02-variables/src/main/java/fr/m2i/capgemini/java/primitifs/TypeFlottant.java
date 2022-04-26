package fr.m2i.capgemini.java.primitifs;

public class TypeFlottant {

	public static void main(String[] args) {
		System.out.println("==========Type float==========");

		float unFloat = -12.01F;
		System.out.println(unFloat);

		System.out.printf("minFloat = %s\n", Float.MIN_VALUE);
		System.out.printf("maxFloat = %s\n", Float.MAX_VALUE);
		
		System.out.println("==========Type double==========");

		double unDouble = -12.01;
		System.out.println(unDouble);

		System.out.printf("minDouble = %s\n", Double.MIN_VALUE);
		System.out.printf("maxDouble = %s\n", Double.MAX_VALUE);
	}
}
