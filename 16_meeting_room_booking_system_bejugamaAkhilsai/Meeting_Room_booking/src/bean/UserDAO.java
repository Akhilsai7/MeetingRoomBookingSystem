package bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.cj.protocol.Resultset;

public class UserDAO {
	static Connection con=ConnectionProvider.getCon(); 
	public static int  MrRequest(MRbean mb) {
		// TODO Auto-generated method stub
		try
		{
			ResultSet rs;
			PreparedStatement stmt=con.prepareStatement("insert into Meeting_Request(Date,Start_time,end_time,user,MR_no,resource,status) values(?,?,?,?,?,?,?)"); 
			stmt.setString(4,mb.getUser());
			stmt.setString(1,mb.getDate());
			stmt.setString(2,mb.getStart_time());
			stmt.setString(3, mb.getEnd_time());
			stmt.setInt(5, mb.getMR_no());
			stmt.setInt(6,mb.getResource());
			stmt.setString(7, mb.getStatus());
			int i=stmt.executeUpdate();
//			PreparedStatement stmt1=con.prepareStatement("insert into Resource_usage values(?,?,?,?,?,?,?)");
//			stmt1.setInt(1, mb.getResource());
//			if(mb.getResource()==1)
//			{
//				stmt1.setString(2, "projector");
//			}
//			else if(mb.getResource()==2)
//			{
//				stmt1.setString(2, "WhiteBoard");
//			}
//			else if(mb.getResource()==3)
//			{
//				stmt1.setString(2, "speakers");
//				
//			}
//			stmt1.setString(3,mb.getDate());
//			stmt1.setString(4, mb.getStart_time());
//			stmt1.setString(5, mb.getEnd_time());
//			stmt1.setString(6, mb.getUser());
//			stmt1.setInt(7, mb.getMR_no());
//			int j=stmt1.executeUpdate();
			
		  if(i!=0)
			{
			  PreparedStatement stmt1=con.prepareStatement("select ID from Meeting_Request where user=? and Date=?");
			  stmt1.setString(1,mb.getUser());
			  stmt1.setString(2, mb.getDate());
			  
			  rs=stmt1.executeQuery();
			  rs.next();
			  int x=rs.getInt(1);
			  return x;
			  
			}
			else
			{
				return 0;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return 0;
	}
	public static boolean MrCancel(MRbean mb) {
		// TODO Auto-generated method stub
		try
		{
			ResultSet rs;
			PreparedStatement stmt=con.prepareStatement("Update Meeting_Request set status=? where user=? and id=?");
			stmt.setString(1, "CANCELLED");
			stmt.setString(2, mb.getUser());
			stmt.setInt(3, mb.getId());
			int i=stmt.executeUpdate();
			if(i!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
}
