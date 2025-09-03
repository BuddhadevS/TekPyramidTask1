package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTheData {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tek_pyramid", "root","root");
		Statement statement = connection.createStatement();
		statement.execute("update student set s_name='sonu' where s_id = 1");
		
		
		System.out.println("column u done");
		
	}

}
