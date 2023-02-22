package Tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableinJecm4 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jecm4","root","root");
		Statement statement=connection.createStatement();
		boolean b=statement.execute
("create table student_details(id integer primary key,name varchar(40) not null,Phnumber bigint not null)");
		connection.close();
		System.out.println(b);
	}
}
