package fr.m2i.capgemini.java.jdbc.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import fr.m2i.capgemini.java.jdbc.model.Stagiaire;
import fr.m2i.capgemini.java.jdbc.utils.MaConnexion;

public class TestSelectAll {

	public static void main(String[] args) {
		final String REQUETE = "SELECT * FROM stagiaire";

		try (Connection connection = MaConnexion.getInstance().getConnection()) {

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(REQUETE);
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String nom = rs.getString("nom");
				int age = rs.getInt("age");
				Timestamp created_at = rs.getTimestamp("created_at");
				
				Stagiaire stagiaire = new Stagiaire(id, nom, age, created_at.toLocalDateTime());
				System.out.println(stagiaire);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
