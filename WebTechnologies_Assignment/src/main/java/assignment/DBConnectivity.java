package assignment;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {
	public static Connection createConnection() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/std_data");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}
}
