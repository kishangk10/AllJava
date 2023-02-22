package Kfi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DropTableAndDatabase {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kfi","root","root");
		Statement statement =connection.createStatement();
//		to delete a table
//		statement.executeUpdate("drop table collectiondetails");
		
//		to delete a database
		statement.executeUpdate("drop database kfi");
		connection.close();
	}
}
