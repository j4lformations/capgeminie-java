package fr.m2i.capgemini.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexionWithAutoCloseable {

	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String URL = "jdbc:mysql://localhost:3306/";
	final static String USERNAME = "root";
	final static String PASSWORD = "";
	
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			System.out.println("DRIVER OK");
			
			try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
				System.out.println("CONNEXION OK");
			} catch (SQLException e) {
				System.out.println("CONNEXION NOK");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("DRIVER NOK");
		}
	}
}
