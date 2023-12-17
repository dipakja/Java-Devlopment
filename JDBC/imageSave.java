// for image

//create table images(id int primary key auto_increment,pic blob);

// binary large object

import java.sql.*;
import java.io.*;

class imageSave
{

public static  void main(String[] args)
{

try{

Class.forName("com.mysql.cj.jdbc.Driver");

String url ="jdbc:mysql://localhost:3306/students";
String username="root";
String password="root";


Connection con=DriverManager.getConnection(url,username,password);


String q = "insert into images(pic) values(?)";

PreparedStatement pstmt=con.prepareStatement(q);

// pstmt.setString(1,"value");






// BLOB can save less that 65kb , images only

FileInputStream fis = new FileInputStream("bag.jpg");

pstmt.setBinaryStream(1,fis,fis.available());
pstmt.executeUpdate();

System.out.println("Image is saved!!");







}catch(Exception e)
{
	e.printStackTrace();
}







}



}