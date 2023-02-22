package Switch_Case;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AllinOne {
	public static void main(String[] args) throws SQLException {
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm31","root","root");
	Scanner scanner =new Scanner(System.in);
	boolean flag=true;
	while(flag){
		System.out.println("1.Add student \n2.Update student java mock \n3.Update requriments \n4.Remove student \n5.Exit");
		switch (scanner.nextInt()) {
		case 1:{
			PreparedStatement preparedStatement=connection.prepareStatement("insert into mock_details values(?,?,?,?,?,?)");
			System.out.println("Add Student id into the table....>>");
			preparedStatement.setInt(1, scanner.nextInt());
			System.out.println("Add Student name into the table....>>");
			preparedStatement.setString(2, scanner.next());
			System.out.println("Add Student java_mock_rating into the table....>>");
			preparedStatement.setString(3, scanner.next());
			System.out.println("Add Student SQl_mock_rating into the table....>>");
			preparedStatement.setString(4, scanner.next());
			System.out.println("Add Student web_mock_rating into the table....>>");
			preparedStatement.setString(5, scanner.next());
			System.out.println("Add Student No_of_requirements into the table....>>");
			preparedStatement.setString(6, scanner.next());
			preparedStatement.executeUpdate();
			System.out.println(">>>>>>>>>  Inserted  <<<<<<<<<<<");
		}break;
		case 2:{
			PreparedStatement preparedStatement=connection.prepareStatement("update mock_details set java_mock_ratings =? where Sid=?");
			System.out.println("enter the student id to Modify the java_mock_Ratings ....>>");
			preparedStatement.setInt(2, scanner.nextInt());
			System.out.println("Modify java mock rating ....>>");
			preparedStatement.setString(1, scanner.next());
			preparedStatement.executeUpdate();
			System.out.println(">>>>>>>>>  Modifyed the Java mock rating  <<<<<<<<<<<");
		}
		break;
		case 3:{
			PreparedStatement preparedStatement=connection.prepareStatement("update mock_details set No_of_requirement =? where Sid=?");
			System.out.println("enter the student id to Modify the requriment ....>>");
			preparedStatement.setInt(2, scanner.nextInt());
			System.out.println("Modify No of Requirements ....>>");
			preparedStatement.setString(1, scanner.next());
			preparedStatement.executeUpdate();
			System.out.println(">>>>>>>>>  Modifyed the no of requirements  <<<<<<<<<<<");
		}break;
		case 4:{
			PreparedStatement preparedStatement=connection.prepareStatement("delete from mock_details where Sid=?");
			System.out.println("Delete the student ");
			preparedStatement.setInt(1, scanner.nextInt());
			preparedStatement.executeUpdate();
			System.out.println(">>>>>>>>>  Delete the record in the table  <<<<<<<<<<<");
		}break;
		case 5:{
			flag =false;
			System.out.println("Thank you -------<(-_-)>");
		}
		default:
			System.out.println("Invalid option");
			break;
		}
	}
	connection.close();
	}
}
