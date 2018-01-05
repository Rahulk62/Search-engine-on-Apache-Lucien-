import java.sql.*;  
import java.io.*;
import java.util.Scanner;
class InsertPrepared{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","tiger");  
  

PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan");  
stmt.setInt(1,3030);
stmt.setString(2,"avinesh");
  
int i=stmt.executeUpdate();  


System.out.println(i+" records inserted");  
System.out.println("if you want to delete the coloumn press y else n \n");
Scanner sc = new Scanner( System.in);
String str = sc.next( );
if(str.equals("y"))
{
	
 stmt=con.prepareStatement("delete from emp where id=?");  
stmt.setInt(1,101);  
  
 i=stmt.executeUpdate();  
System.out.println(i+" records deleted"); 
}

  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  