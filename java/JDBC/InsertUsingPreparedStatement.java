package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPreparedStatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tek_pyramid", "root", "root");
		PreparedStatement statement = connection.prepareStatement("insert into student values (?,?,?,?,?,?)");
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter a s_id");
		int s_id = s.nextInt();
		statement.setInt(1, s_id);
		
		
		System.out.println("enter a s_name");
		String s_name = s.next();
		statement.setString(2, s_name);
		
		System.out.println("enter a age");
		int age = s.nextInt();
		statement.setInt(3, age);
		
		
		System.out.println("enter a s_email");
		String s_email = s.next();
		statement.setString(4, s_email);
		

		System.out.println("enter a gender");
		String gender = s.next();
		statement.setString(5, gender);

		
		System.out.println("enter a ph_no");
		String ph_no = s.next();
		statement.setString(6, ph_no);

		
		statement.execute();

		System.out.println("data inserted done");

	}

}
