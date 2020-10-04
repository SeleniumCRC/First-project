package dbTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTesting {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String port ="3306";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://" + "localhost" + ":" + port + "/Qadbt", "root", "root");
		Statement s=con.createStatement();

		ResultSet rs=s.executeQuery("select * from Employeeinfo where location ='pune'");
		while(rs.next()) {
			
		
		System.out.println(rs.getString("location"));
	}
	}
}
