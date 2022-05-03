package fr.m2i.capgemini.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexion {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			// 1 => Chargement du Driver en memoire par la JVM
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DRIVER OK");

			// 2 => Localisation de la BDD
			final String URL = "jdbc:mysql://localhost:3306/";
			final String USERNAME = "root";
			final String PASSWORD = "";

			// 3 => On etablit la connexion vers le SGBDR
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("CONNEXION OK");			
			
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER NOK");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("CONNEXION NOK");
			e.printStackTrace();
		}finally {
			// 4 => On ferme la connexion ici
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}