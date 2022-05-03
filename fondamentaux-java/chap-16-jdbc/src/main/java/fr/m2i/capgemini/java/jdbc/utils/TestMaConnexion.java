package fr.m2i.capgemini.java.jdbc.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class TestMaConnexion {

	public static void main(String[] args) {
		try (Connection connection = MaConnexion.getInstance().getConnection()) {
			System.out.println("CONNEXION OK");
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException e) {
			System.err.format("SQLState: %s\ns%", e.getMessage(), e.getCause());
		}
	}
}
