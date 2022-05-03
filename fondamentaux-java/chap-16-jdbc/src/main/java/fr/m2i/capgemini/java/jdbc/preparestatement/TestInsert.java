package fr.m2i.capgemini.java.jdbc.preparestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import fr.m2i.capgemini.java.jdbc.utils.MaConnexion;

public class TestInsert {

	public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Entrez votre nom : ");
		String nom = saisie.nextLine();
		
		System.out.println();
				
		System.out.print("Entrez votre âge : ");
		int age = saisie.nextInt();
		
		final String REQUETE = "insert into stagiaire(nom, age) values(?, ?)";
		try (Connection connection = MaConnexion.getInstance().getConnection()) {

			PreparedStatement ps = connection.prepareStatement(REQUETE);

			ps.setString(1, nom);
			ps.setInt(2, age);

			int resultat = ps.executeUpdate();
			
			if(resultat > 0) {
				System.out.println("INSERT OK");
			}else {
				System.out.println("INSERT NOK");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		saisie.close();
	}
}