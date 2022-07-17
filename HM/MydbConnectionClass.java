package HM;
import java.sql.*;
public class MydbConnectionClass {
	public  static Connection getConnection() {
		Connection con=null;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","root@1");
				} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		 
	}	
}

