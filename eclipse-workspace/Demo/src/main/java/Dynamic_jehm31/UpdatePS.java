package Dynamic_jehm31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePS {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/jehm31","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement
				("update studentdetails set name=? where id=?");
		System.out.println("enter the name tobe updated .......>> ");
		preparedStatement.setString(1, sc.next());
		System.out.println("enter the row number tobe updated ......>>");
		preparedStatement.setInt(2, sc.nextInt());
		preparedStatement.executeUpdate();
		System.out.println("updated......>>");
		connection.close();
	}
}
