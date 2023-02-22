package Dynamic_jehm31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table1 {
	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm31","root","root");
		Statement statement =connection.createStatement();
		statement.execute
("create table studentdetails(id integer primary key,name varchar(20) not null,city varchar(20) not null)");
		
		connection.close();
	}
}
