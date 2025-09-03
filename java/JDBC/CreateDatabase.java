package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
			Statement statement = connection.createStatement();
			statement.execute("create database jdbc_table1");
			System.out.println("Database is reated");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("database not reated");
		}
	}

}
