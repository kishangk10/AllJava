package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement=connection.createStatement();
		statement.execute("create database jecm5");
		connection.close();
	}
}
