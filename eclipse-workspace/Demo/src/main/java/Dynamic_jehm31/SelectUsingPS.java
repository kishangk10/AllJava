package Dynamic_jehm31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectUsingPS {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/jehm31","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from studentdetails where id=?");
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the row should be selected ..>>");
		preparedStatement.setInt(1, scanner.nextInt());
		ResultSet resultSet =preparedStatement.executeQuery();
		resultSet.next();
		System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
		connection.close();
	}
}
