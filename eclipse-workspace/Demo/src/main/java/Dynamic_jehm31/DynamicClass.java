package Dynamic_jehm31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicClass {
	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement =connection.createStatement();
		statement.execute("create database jehm31");
		connection.close();
	}
}
