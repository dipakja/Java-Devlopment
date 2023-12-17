import java.sql.*;
import java.io.*;

class PreapareStm
{

public static void main(String[] args){

try{


Class.forName("com.mysql.cj.jdbc.Driver");

String url="jdbc:mysql://localhost:3306/students";
String username="root";
String password="root";

Connection con=DriverManager.getConnection(url,username,password);


if(con.isClosed())
{
	System.out.println("failed");
}else
{
	System.out.println("successful");
}

//create a query

String q="insert into table1(tName,tCity) values(?,?)";

// // get the preparedStatmenent object

PreparedStatement pstmt=con.prepareStatement(q);



BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


System.out.println("Enter the name: ");

String name =br.readLine();

System.out.println("Enter the city : ");
String city=br.readLine();



// // set the values to query

pstmt.setString(1,name);
pstmt.setString(2,city);
pstmt.executeUpdate();



System.out.println("inserted....");

con.close();



}catch(Exception e)
{
	e.printStackTrace();
}








}



}

