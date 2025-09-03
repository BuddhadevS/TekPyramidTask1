package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tek_pyramid", "root","root");
		Statement statement = connection.createStatement();
		statement.execute("CREATE TABLE student (s_id INT(2) PRIMARY KEY, s_name VARCHAR(30) NOT NULL, Age varchar(20) not null, e_Email varchar(30) not null, Gender varchar(20) not null)");

		System.out.println("Table done");
	}
	
	

}
