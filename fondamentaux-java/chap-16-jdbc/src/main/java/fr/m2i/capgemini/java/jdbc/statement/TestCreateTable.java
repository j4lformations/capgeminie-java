package fr.m2i.capgemini.java.jdbc.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import fr.m2i.capgemini.java.jdbc.utils.MaConnexion;

public class TestCreateTable {

	public static void main(String[] args) {

		final String REQUETE = "create table if not exists stagiaire(" 
				+ "id 	int auto_increment,"
				+ "nom 	varchar(20)	not null," 
				+ "age	int	not null,"
				+ "created_at	datetime default CURRENT_TIMESTAMP," 
				+ "constraint stagiaire_pk primary key(id)" 
				+ ")";
		
		try(Connection connection = MaConnexion.getInstance().getConnection()){
			
			Statement statement = connection.createStatement();
			
			statement.execute(REQUETE);
			statement.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
