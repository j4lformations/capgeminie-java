package fr.m2i.capgemini.java.jdbc.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import fr.m2i.capgemini.java.jdbc.utils.SimpleDataSource;

public class TestCreationDb {

	/*
	 * Creation de la BDD par requete SQL
	 */
	public static void main(String[] args) {

		final String REQUETE = "create database if not exists capgemini_db";

		try {
			SimpleDataSource.init("jdbcParams");
			
			try (Connection connection = SimpleDataSource.getConnection();
					Statement statement = connection.createStatement()) {

				statement.execute(REQUETE);
				
			} catch (SQLException e) {
				System.out.println("CONNEXION NOK");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER NOK");
		}
	}
}
