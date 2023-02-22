package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sample1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jecm5","root","root");
		Statement statement=connection.createStatement();
		statement.execute("create table student_details(id integer primary key,name varchar(20) not null,mock varchar(10))");
		connection.close();
	}
}