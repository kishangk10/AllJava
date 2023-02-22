package Tester_sheela;
import java.sql.*;
public class Sample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement=connection.createStatement();
		boolean e=statement.execute("create database sheela");
		connection.close();
		System.out.println("Data base is created");
		System.out.println(e);
	}
}
