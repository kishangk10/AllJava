package Kfi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/kfi","root","root");
		Statement statement= connection.createStatement();
//		statement.executeUpdate("insert into collectiondetails values(01,'KGF','YASH','1000CR')");
//		statement.executeUpdate("insert into collectiondetails values(02,'kantara','R.Shetty','400 CR')");
//		statement.executeUpdate("insert into collectiondetails values(03,'robert','DBOSS','100CR')");
//		statement.executeUpdate("insert into collectiondetails values(04,'rajakumara','Appu','78 CR')");
		statement.executeUpdate("insert into collectiondetails values(05,'kranthi','dboss','150 CR')");
		


		connection.close();
	}
}
