package p3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {

	public static void main(String[] args) throws Exception {

		Connection conn = DbConnection.getConnection();

		// Step#3. Write SQL queries
		String sql = "SELECT * FROM employee";

		// Step#4. Get a carrier
		PreparedStatement ps = conn.prepareStatement(sql);

		// Step#5. execute the queries
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");

			System.out.println(id + " : " + name + " : " + salary);
		}

		// Extract data from ResultSet

		// Step#6. close the resources
		rs.close();
		ps.close();
		conn.close();

		System.out.println("Delete row DONE!!!!");

	}

}
