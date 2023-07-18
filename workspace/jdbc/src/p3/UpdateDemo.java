package p3;

import java.sql.Connection;
import java.sql.PreparedStatement;

import p1.Employee;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee(105, "John Biden", 1123);
		System.out.println(emp);

		Connection conn = DbConnection.getConnection();
		// Step#3. Write SQL queries
		String sql = "UPDATE employee SET name=?, salary=? WHERE id =?";

		// Step#4. Get a carrier
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(3, emp.getId());
		ps.setString(1, emp.getName());
		ps.setDouble(2, emp.getSalary());

		// Step#5. execute the queries
		ps.executeUpdate();

		// Step#6. close the resources
		ps.close();
		conn.close();

		System.out.println("Update row DONE!!!!");

	}

}
