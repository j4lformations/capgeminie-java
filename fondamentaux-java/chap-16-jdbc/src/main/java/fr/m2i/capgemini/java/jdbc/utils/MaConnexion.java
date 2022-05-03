package fr.m2i.capgemini.java.jdbc.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Singleton permettant de gerer une et une seule instance de la classe
 * @author Joachim
 *
 */
public class MaConnexion {
	
	private static MaConnexion instance;
	private Connection connection;

	private MaConnexion() throws ClassNotFoundException, SQLException {
		SimpleDataSource.init("jdbcParams");
		connection = SimpleDataSource.getConnection();
	}

	public static MaConnexion getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new MaConnexion();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}
}