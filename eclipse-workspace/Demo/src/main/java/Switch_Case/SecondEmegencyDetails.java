package Switch_Case;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SecondEmegencyDetails {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm31","root","root");
//		PreparedStatement preparedStatement=connection.prepareStatement("create table Emergency_Details(USN varchar(10) primary key,Name varchar(20) not null,branch varchar(20),College_Name varchar(30) Not Null,CGPA varchar(15))");
//		preparedStatement.execute();
//		connection.close();
		
//		Statement statement=connection.createStatement();
//		statement.execute("Drop table emergency_details");
//		connection.close();
		
		Scanner scanner=new Scanner(System.in);
		boolean flag=true;
		while (flag) {
			System.out.println("1.Add \n2.Update Branch by taking USN \n3.Update CGPA by taking USN \n4.Fetch the student details by taking USN \n5.Delete the student by taking USN \n6.Fetch all the Studet Present in the table \n7.Delete all the Student Present in the Table. \n8.Exit");
			switch (scanner.nextInt()) {
			case 1:{
				PreparedStatement preparedStatement=connection.prepareStatement("insert into emergency_details values(?,?,?,?,?)");
				System.out.println("Enter the Student usn ....>>");
				preparedStatement.setString(1, scanner.next());
				System.out.println("Enter the Student Name ....>>");
				preparedStatement.setString(2, scanner.next());				
				System.out.println("Enter the Student Branch ....>>");
				preparedStatement.setString(3, scanner.next());
				System.out.println("Enter the Student CollegeName ....>>");
				preparedStatement.setString(4, scanner.next());
				System.out.println("Enter the Student CGPA ....>>");
				preparedStatement.setString(5, scanner.next());
				preparedStatement.executeUpdate();
				System.out.println("------< Student details Add into table >-------");
			}break;
			case 2:{
				PreparedStatement preparedStatement=connection.prepareStatement("update emergency_details set branch=? where USN=?");
				System.out.println("Enter the Student USN so you can update the 'Branch'. ");
				preparedStatement.setString(2, scanner.next());
				System.out.println("Enter the New Branch Name");
				preparedStatement.setString(1, scanner.next());
				preparedStatement.executeUpdate();
				System.out.println("------< Branch details Updated in the table >-------");

			}break;
			case 3:{
				PreparedStatement preparedStatement=connection.prepareStatement("update emergency_details set CGPA=? where USN=?");
				System.out.println("Enter the Student USN so you can update the 'CGPA'. ");
				preparedStatement.setString(2, scanner.next());
				System.out.println("Enter the New CGPA Name");
				preparedStatement.setString(1, scanner.next());	
				preparedStatement.executeUpdate();
				System.out.println("------< CGPA Updated in the table >-------");
			}break;
			case 4:{
				PreparedStatement preparedStatement=connection.prepareStatement("select * from emergency_details where USN=?");
				System.out.println("Enter the Student USN to fetch the Student Details. ");
				preparedStatement.setString(1, scanner.next());
				ResultSet resultSet=preparedStatement.executeQuery();	
				resultSet.next();
				System.out.println("USN :- "+resultSet.getString(1)+" Name :- "+resultSet.getString(2)+" Branch :- "+resultSet.getString(3)+" College Name :- "+resultSet.getString(4)+" CGPA :- "+resultSet.getString(5));
				System.out.println("!----------------------------------!");
			}break;
			case 5:{
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emergency_details where USN=?");
				System.out.println("Enter the Student USN to delete the Student Record. ");
				preparedStatement.setString(1, scanner.next());
				preparedStatement.executeUpdate();
				System.out.println("------< Deleted Student Record  in the table >-------");
			}break;
			case 6:{
				PreparedStatement preparedStatement=connection.prepareStatement("Select * from emergency_details");
				System.out.println("The Data inside the table is ......>>");
				ResultSet resultSet=preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println("USN :- "+resultSet.getString(1)+" Name :- "+resultSet.getString(2)+" Branch :- "+resultSet.getString(3)+" College Name :- "+resultSet.getString(4)+" CGPA :- "+resultSet.getString(5));
				}
				System.out.println("!----------------------------!");
			}break;
			case 7:{
				PreparedStatement preparedStatement=connection.prepareStatement("Delete from emergency_details");
				preparedStatement.executeUpdate();
				System.out.println("-------All the records are Delete inside the table------");
			}break;
			case 8:{
				flag=false;
				System.out.println("-----<( Thank You )>------");
			}break;

			default:
				System.out.println("----------<(-_-)>----------");
				break;
			}
		}
		
	}
}
