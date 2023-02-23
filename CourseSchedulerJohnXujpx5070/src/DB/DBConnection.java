package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	private static final String driver = "org.apache.derby.jdbc.ClientDriver";
	private static final String user = "java";
	private static final String password = "java";
	private static final String database = "jdbc:derby://localhost:1527/CourseSchedulerDBJohnXujpx5070";
	
	public static Connection getConnection() {

		try {
			Class.forName(driver);
			return DriverManager.getConnection(database, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void close(Connection conn, PreparedStatement pstmt,
			ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
