package Kfi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DelectTheDataInThetable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kfi","root","root");
		Statement statement=connection.createStatement();
		statement.executeUpdate("delete from collectiondetails where no=1");
		connection.close();
	}
}
