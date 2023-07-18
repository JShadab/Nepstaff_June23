package p3;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() throws Exception

	{
		// Step#1. Load the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step#2. Establish the connection with the DB
		String url = "jdbc:mysql://localhost:3306/nepstaff_db";
		String username = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, username, password);

		return conn;
	}

}
