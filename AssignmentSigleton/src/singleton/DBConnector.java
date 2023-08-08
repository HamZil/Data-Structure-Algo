package singleton;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnector {
		
	static Connection conn = null;
	   
	public static Connection getInstance() {
	      if (conn != null) return conn;
	      String database = "singleton";
	      String Username = "root";
	      String password = "admin";
	      return getConnection(database, Username, password);
	   }
	   
	private static Connection getConnection(String databaseName, String UserName, String password) {
	      try {
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection("jdbc:mysql://localhost/" + databaseName + "?user=" + UserName + "&password=" + password);
	         System.out.println("connected with "+databaseName);
	         
	         
	         //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/singleton","root","admin"); another way

	         
	      }
	      catch (Exception e) {
	         e.printStackTrace();
	      }
	      return conn;
	   }
	
	
	
}
	
