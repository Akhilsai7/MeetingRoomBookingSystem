package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
public class LoginDao {  
  
public static String validate(LoginBean bean){  
boolean status=false;  
try{  
Connection con=ConnectionProvider.getCon();  
              
PreparedStatement ps=con.prepareStatement(  
    "select * from Login_details where user=? and password=?");  
  
ps.setString(1,bean.getName());  
ps.setString(2, bean.getPass());  

              
ResultSet rs=ps.executeQuery();  
 if(rs.next())
 {
	 return rs.getString("role");
 }
}
catch(Exception e)
{
	System.out.println(e);
}
return "";

}

}
  