
// This is first Program for the JDBC

import java.sql.*;



// C:\Users\HP\AppData\Local\Programs\Eclipse Adoptium\jdk-17.0.7.7-hotspot\bin  



class FirstJDBC
{
	public static void main(String[] args)
	{

try
{

// load the driver

	Class.forName("com.mysql.cj.jdbc.Driver");
// Creating a connection


String url ="jdbc:mysql://localhost:3306/students";
String username="root";
String password="root";


Connection con=DriverManager.getConnection(url,username,password);

if(con.isClosed())
{
	System.out.println("Connections still closed");
}else {
	System.out.println("connection created..");
}



}catch(Exception e)
{
	e.printStackTrace();
}





	}
}