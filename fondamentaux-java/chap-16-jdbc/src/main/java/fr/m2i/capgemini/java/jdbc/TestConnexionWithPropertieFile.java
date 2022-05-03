package fr.m2i.capgemini.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnexionWithPropertieFile {

	static String driver;
	static String url;
	static String username;
	static String password;

	public static void main(String[] args) {

		// Chargement du fichier de propriétés
		ResourceBundle props = ResourceBundle.getBundle("jdbcParams");

		driver = props.getString("mysql.driver");
		try {
			Class.forName(driver);
			System.out.println("driver ok");
		} catch (ClassNotFoundException e) {
			System.out.println("driver nok");
		}
		
		url = props.getString("mysql.url");
		username = props.getString("mysql.username");
		password = props.getString("mysql.password");
		
		try(Connection connection = DriverManager.getConnection(url, username, password)){
			System.out.println("connexion ok");
		} catch (SQLException e) {
			System.out.println("connexion nok");
		}
	}
}
