package Dynamic_jehm31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertintotable {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/jehm31","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement
				("insert into studentdetails values(?,?,?)");
		System.out.println("enter the id");
		preparedStatement.setInt(1, sc.nextInt());
		System.out.println("enter the name");
		preparedStatement.setString(2, sc.next());
		System.out.println("enter the city");
		preparedStatement.setString(3, sc.next());
		preparedStatement.execute();
		System.out.println("updated");
		connection.close();
	}

}
