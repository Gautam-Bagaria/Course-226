import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ProjectDBConnection {
	static Connection con;
	static String dbUrl = "jdbc:mysql://localhost/classicmodels?user=root&password=password";
	static String dbClass = "com.mysql.jdbc.Driver";
	public static void ConnectionCon() throws ClassNotFoundException, SQLException
	{
		Class.forName(dbClass);
		con = DriverManager.getConnection(dbUrl);
	}

}
