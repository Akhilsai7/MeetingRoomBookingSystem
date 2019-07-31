package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import com.mysql.cj.protocol.Resultset;

public class FMDAO {
	static Connection con=ConnectionProvider.getCon(); 

	public static boolean AddUser(Adminbean ab) {
		// TODO Auto-generated method stub
		try
		{
			if(Pattern.matches(" ((?=.*[a-z])(?=.*\\\\d)(?=.*[A-Z])(?=.*\\\\W)).{8,40}",ab.getPassword()))
			{
			PreparedStatement stmt=con.prepareStatement("insert into Login_details values(?,?,?)"); 
			stmt.setString(1,ab.getUser());
			stmt.setString(2, ab.getPassword());
			stmt.setString(3, ab.getRole());
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
			else
			{
				return false;
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		return true;
	}
	public static boolean DeleteUser(Adminbean ab)
	{
		try
		{
			
			PreparedStatement stmt=con.prepareStatement("delete from Meeting_Request where user=?");
			stmt.setString(1,ab.getUser());
			int j=stmt.executeUpdate();
			PreparedStatement stmt1=con.prepareStatement("delete from Meeting_Room where Booked_by=?");
			stmt1.setString(1, ab.getUser());
			int k=stmt1.executeUpdate();
			PreparedStatement stmt2=con.prepareStatement("delete from Resource_usage where Used_by=?");
			stmt2.setString(1, ab.getUser());
			int l=stmt2.executeUpdate();
			PreparedStatement stmt4=con.prepareStatement("delete from Login_details where user=?"); 
			stmt4.setString(1,ab.getUser());
			
			 int i=stmt4.executeUpdate();
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
	public static boolean ApproveReject(MRbean mr, int flag) {
		// TODO Auto-generated method stub
		ResultSet rs;
		if(flag==1)
		{
			
			try {
				
				PreparedStatement stmt=con.prepareStatement("update meeting_request set status=? where ID=?");
				stmt.setString(1,"ACCEPTED");
				stmt.setInt(2, mr.getId());
				int i=stmt.executeUpdate();
				if(i!=0)
				{
					
				PreparedStatement stmt1=con.prepareStatement("select * from meeting_request where status=? and ID=?");
				stmt1.setString(1,"ACCEPTED");
				stmt1.setInt(2, mr.getId());
				rs=stmt1.executeQuery();
				rs.next();
				String date= rs.getString("Date");
				String start=rs.getString("Start_time");
				String end=rs.getString("end_time");
				int room=rs.getInt("MR_no");
				String user=rs.getString("user");
				int resource=rs.getInt("resource");
				
				PreparedStatement stmt2=con.prepareStatement("insert into meeting_room values(?,?,?,?,?)");
				stmt2.setInt(1,room);
				System.out.println(room);
				stmt2.setString(2,date);
				stmt2.setString(3,start);
				stmt2.setString(4,end);
				stmt2.setString(5,user);
				int l=stmt2.executeUpdate();
				PreparedStatement stmt3=con.prepareStatement("insert into resource_usage values(?,?,?,?,?,?,?)");
				stmt3.setInt(1,resource);
				if(resource==1)
				{
					stmt3.setString(2, "Projector");
				}
				if(resource==2)
				{
					stmt3.setString(2,"Whiteboard");
				}
				if(resource==3)
				{
					stmt.setString(2, "speakers");
				}
				stmt3.setString(3,date);
				stmt3.setString(4,start);
				stmt3.setString(5,end);
				stmt3.setString(6, user);
				stmt3.setInt(7, room);
				int k=stmt3.executeUpdate();
				if(k!=0&&l!=0)
				{
					return true;
				}
				else
				{
					return false;
				}
				
				}
				else
				{
					System.out.println("Hello1");
					return false;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(flag==2)
		{
			try {
				PreparedStatement stmt=con.prepareStatement("update meeting_request set status=? where ID=?");
				stmt.setString(1,"REJECTED");
				stmt.setInt(2, mr.getId());
				
				int i=stmt.executeUpdate();
				if(i!=0)
				{
					return true;
				}
				else
				{
					return false;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	public static ResultSet Accept_or_Reject() {
		// TODO Auto-generated method stub
		try
		{
		PreparedStatement stmt=con.prepareStatement("select * from meeting_request where status=?");
		stmt.setString(1,"NEW");
		ResultSet rs = stmt.executeQuery();
		if(rs!=null)
		{
			
			return rs;
		}
		return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public static int NoofRequest(MRbean mb) {
		// TODO Auto-generated method stub
		int x = 0;
		try
		{
		PreparedStatement stmt=con.prepareStatement("select count(*) from meeting_request where date=?");
		stmt.setString(1,mb.getDate());
		ResultSet rs= stmt.executeQuery();
		 while(rs.next())
		 {
			 x= rs.getInt(1);
			 //System.out.println(x);
		 }
		return x;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	public static int Noofbookings(MRbean mb) {
		// TODO Auto-generated method stub
		int x=0;
		try {
			PreparedStatement stmt=con.prepareStatement("select count(*) from meeting_room where MR_no=?");
			stmt.setInt(1,mb.getMR_no());
			ResultSet rs= stmt.executeQuery();
			while(rs.next())
			 {
				 x= rs.getInt(1);
				 
				// System.out.println(x);
			 }
			return x;
			}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public static int MostUsedresource() {
		// TODO Auto-generated method stub
		int x=0,y=0,z=0;
		try {
			PreparedStatement stmt=con.prepareStatement("select  Res_no from resource_usage");
			ResultSet rs= stmt.executeQuery();
			while(rs.next())
			{
				if(rs.getInt(1)==1)
				{
					x++;
				}
				if(rs.getInt(1)==2)
				{
					y++;
				}
				if(rs.getInt(1)==3)
				{
					z++;
				}
				
			}
			if(x>y&&x>z)
				return 1;
			if(y>x&&y>z)
				return 2;
			if(z>x&&z>y)
				return 3;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

}
