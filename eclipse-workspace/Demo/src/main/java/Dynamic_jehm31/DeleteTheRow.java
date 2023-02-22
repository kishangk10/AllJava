package Dynamic_jehm31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTheRow {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/jehm31","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement
				("delete from studentdetails where id=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row to delete .......>> ");
		preparedStatement.setInt(1, sc.nextInt());
		preparedStatement.executeUpdate();
		System.out.println("the row is deleted .....>>");
		connection.close();
	}
}
