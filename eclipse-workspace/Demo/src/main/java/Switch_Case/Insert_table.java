package Switch_Case;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_table {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm31","root","root");
		Statement statement=connection.createStatement();
		statement.execute
		("create table Mock_details(Sid integer primary key,SName varchar(20) not null,java_mock_ratings varchar(20) not null, "
				+ "Sql_mock_ratings varchar(20),web_mock varchar(20) not null,No_of_requirement varchar(20) not null)");
		connection.close();
	}
}
