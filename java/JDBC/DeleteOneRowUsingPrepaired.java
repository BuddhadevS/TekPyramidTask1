package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOneRowUsingPrepaired {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tek_pyramid", "root", "root");
		PreparedStatement statement = connection.prepareStatement("DELETE FROM student WHERE s_id = ?");

            Scanner s = new Scanner(System.in);
            System.out.println("Enter student id to delete: ");
            int id = s.nextInt();
            statement.setInt(1, id);

            
           statement.execute();
           System.out.println("Row deleted done");
	}
	

}
