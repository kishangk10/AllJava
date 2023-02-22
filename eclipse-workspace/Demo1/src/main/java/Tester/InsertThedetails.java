package Tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertThedetails {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jecm4","root","root");
		Statement statement=connection.createStatement();
		int n=statement.executeUpdate("insert into student_details values(03,'Quen',8888888)");
		connection.close();
	}
}
