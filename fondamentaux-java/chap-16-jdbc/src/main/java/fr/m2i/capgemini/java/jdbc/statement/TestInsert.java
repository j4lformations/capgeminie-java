package fr.m2i.capgemini.java.jdbc.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import fr.m2i.capgemini.java.jdbc.utils.MaConnexion;

public class TestInsert {

	/*
	 * Permet d'inserer un stagiaire
	 */
	public static void main(String[] args) {
		final String REQUETE = "insert into stagiaire(nom, age) " + "values('Joachim', 53), ('Pelosi', 69)";

		try (Connection connection = MaConnexion.getInstance().getConnection()) {
			Statement statement = connection.createStatement();
			// statement.execute(REQUETE);
			int resultat = statement.executeUpdate(REQUETE);
			
			if(resultat > 0) {
				System.out.println("INSERT OK");;
			}else {
				System.out.println("INSERT NOK");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}