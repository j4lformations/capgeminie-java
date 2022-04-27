package fr.m2i.capgemini.java.caracteres;

public class Chaine {

	public static void main(String[] args) {

		char unChar = '8';
		System.out.println(unChar);
		
		String uneChaine = "Joachim"; 
		System.out.println(uneChaine);
		
		System.out.println(uneChaine.length());
		System.out.println(uneChaine.trim().length());
		
		for (int i = 0; i < uneChaine.length(); i++) {
			System.out.println(uneChaine.charAt(i));
		}
		
		String kim = new String("Kim");
		System.out.println(kim);
		
		String kimkim = new String("Kim");
		System.out.println(kimkim);
		
		System.out.println(kim == kimkim);
		System.out.println(kim.equals(kimkim));
		
		
		String autreChaine = "Joachim";
		System.out.println(autreChaine);
		
		System.out.println(uneChaine == autreChaine);
		
		
	}
}
