package Kfi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TablseintoIT {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kfi","root","root");
		Statement statement=connection.createStatement();
		statement.execute
		("create table CollectionDetails (no integer primary key,MoveName varchar(20),Hero varchar(20),collection varchar(20))");
		connection.close();
	}
}
