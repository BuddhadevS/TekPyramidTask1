package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tek_pyramid", "root", "root");

		PreparedStatement statement = connection.prepareStatement("UPDATE student SET s_name=? WHERE s_id=?");

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a s_name");
		
		
		String s_name = s.next();
		statement.setString(1, s_name);
		
		System.out.println("Enter a s_id");
		
		int s_id = s.nextInt();
		statement.setInt(2, s_id);
		
		
		statement.execute();////--> it return type is boolean
		
		//execute update  for dml & ddl & its return type is int
		
		// execute only for dml
		
		
		System.out.println("Table data update succesfull");
		
		
	}

}
