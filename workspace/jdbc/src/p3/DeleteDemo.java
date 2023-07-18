package p3;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {

		int id = 105;

		Connection conn = DbConnection.getConnection();

		// Step#3. Write SQL queries
		String sql = "DELETE FROM employee WHERE id =?";

		// Step#4. Get a carrier
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);

		// Step#5. execute the queries
		ps.executeUpdate();

		// Step#6. close the resources
		ps.close();
		conn.close();

		System.out.println("Delete row DONE!!!!");

	}

}
