package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jecm5","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student_details values(?,?,?)");
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the id");
		preparedStatement.setInt(1, scanner.nextInt());
		System.out.println("enter the Name");
		preparedStatement.setString(2, scanner.next());
		System.out.println("enter the mock ratings");
		preparedStatement.setString(3, scanner.next());
		preparedStatement.executeUpdate();
		System.out.println("updated");
		connection.close();
}
}
