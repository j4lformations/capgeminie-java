package fr.m2i.capgemini.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LireDepuisUnFichierDemo {

	public static void main(String[] args) {
		
		File monFichier = new File("monFichier.txt");
		Scanner lecture = null;
				
		try {
			monFichier.createNewFile();
			
//			System.out.println(monFichier.exists());
//			System.out.println(System.getProperty("user.dir"));
			
			lecture = new Scanner(monFichier);
			
//			System.out.println(lecture.nextLine());
			while (lecture.hasNextLine()) {
				String ligne = lecture.nextLine();
				System.out.println(ligne);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}