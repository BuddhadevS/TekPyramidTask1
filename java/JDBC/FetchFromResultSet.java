package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchFromResultSet {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tek_pyramid", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet  resultSet =statement.executeQuery("select * from student");
		while (resultSet.next()) {
			System.out.println("id is "+ resultSet.getInt(1)+" Name is "+resultSet.getString(2)+" Age is "+ resultSet.getInt(3)+""
					+"  Email  "+resultSet.getString(4)+"  Gender "+resultSet.getString(5)+" Ph_no  "+ resultSet.getString(6));
		}
	}

}
