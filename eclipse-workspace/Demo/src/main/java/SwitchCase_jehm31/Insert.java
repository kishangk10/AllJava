package SwitchCase_jehm31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm31","root","root");
		Scanner scanner=new Scanner(System.in);
		boolean flag=true;
		while(flag){
			
		System.out.println("1 . add Student \n 2. exit");
		switch (scanner.nextInt()) {
		case 1:{
			PreparedStatement preparedStatement=connection.prepareStatement("insert into studentdetails values(?,?,?)");
			System.out.println("enter the id..>>");
			preparedStatement.setInt(1,scanner.nextInt());
			System.out.println("enter the name....>>");
			preparedStatement.setString(2, scanner.next());
			System.out.println("enter the city .....>>");
			preparedStatement.setString(3, scanner.next());
			System.out.println("city added");
			preparedStatement.execute();
			System.out.println("updated......>>");
		}break;
		case 2:{
			flag=false;
			System.out.println("thank you");
		}
	
		default:
			System.out.println("invalid option");
			break;
		}
		}
		connection.close();
	}
}
