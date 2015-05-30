package sqlservertest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlServerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=db_test"; 
		String username="sa";
		String password = "123456"; // µÇÂ¼ÓÃ»§Ãû
		Connection conn;
		Statement stmt;
        ResultSet rs;
        
        try {
			Class.forName(driverClassName);
			try {
				conn=DriverManager.getConnection(url, username, password);
				System.out.println("Connect SqlServer Successful!");
				stmt=conn.createStatement();
				rs = stmt.executeQuery("select * from tb_user");
				while(rs.next()){
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
