package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/db_test";
		String username = "root";
		String password = "123456";
		Connection conn;
		Statement stmt;
		ResultSet rs;
		try {
			Class.forName(driverClassName);
			try {
				conn = DriverManager.getConnection(url, username, password);
				System.out.println("Connect MySql Successful!");
				stmt = conn.createStatement();
				rs = stmt.executeQuery("select * from tb_user");
				while (rs.next()) {
					System.out.println(rs.getString("name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
