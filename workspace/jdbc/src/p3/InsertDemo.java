package p3;

import java.sql.Connection;
import java.sql.PreparedStatement;

import p1.Employee;

public class InsertDemo {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee(105, "John", 1111);
		System.out.println(emp);

		Connection conn = DbConnection.getConnection();

		// Step#3. Write SQL queries
		String sql = "INSERT INTO nepstaff_db.employee (id, name, salary) VALUES (?, ?, ?)";

		// Step#4. Get a carrier
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, emp.getId());
		ps.setString(2, emp.getName());
		ps.setDouble(3, emp.getSalary());

		// Step#5. execute the queries
		ps.executeUpdate();

		// Step#6. close the resources
		ps.close();
		conn.close();

		System.out.println("Insert row DONE!!!!");

	}

}
