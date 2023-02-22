package Tester_sheela;

import java.sql.*;

public class Sample1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sheela","root","root");
		Statement statement=connection.createStatement();
		boolean b=statement.execute("create table monady(id integer primary key,name varchar(20))");
		connection.close();
		System.out.println("Data created");
		System.out.println(b);
	}
}
