package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; 

public class InsertTheData {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tek_pyramid", "root","root");
		Statement statement = connection.createStatement();
		statement.execute("insert into student values (1,'polu',24,'sahu@1234','female',7001780123)");
		statement.execute("insert into student values (2,'arnab',2,'arnab@1234','male',7001356212)");
		statement.execute("insert into student values (3,'kalu',26,'kalu@1234','male',7005123455)");
		statement.execute("insert into student values (4,'tatai',20,'tatai@1234','male',8250378123)");
		statement.execute("insert into student values (5,'indra',30,'indra@1234','male',9535717253)");
		statement.execute("insert into student values (6,'remi',20,'sahu@1234','female',7067242781)");
		System.out.println("column create done");
		
	}

}
