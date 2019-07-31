<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accept or Reject</title>
<style>
body {
        background-image: url("https://images.unsplash.com/photo-1557682233-43e671455dfa?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
      	 height: 500px; 
  	background-position: center; 
  	background-repeat: no-repeat;
   	background-size: cover;
} 
 
</style>
</head>

<body style="text-align:center;background-color:skyblue;font-size:20px;">


<form style="text-align:center" method="post" action="ApproveRejectServlet">
<table style=text-align:"center" border="3S" >
<thead>
<h2 style='text-align:center;'>ACCEPT OR REJECT THE REQUEST</h2>
<br>
<tr>

<th>ID</th>
<th>DATE</th>
<th>START TIME</th>
<th>END TIME</th>
<th>USER</th>
<th>MR.NO</th>
<th>RESOURCE</th>
<th>STATUS</th>
</tr>
</thead>

<%
ResultSet rs=(ResultSet)request.getAttribute("rs");
if(rs!=null){
%>
<%
while(rs.next()){
out.println("<tr><td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getDate(2)+"</td>"+"<td>"+rs.getTime(3)+"</td>"+"<td>"+rs.getTime(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getInt(6)+"</td>"+"<td>"+rs.getInt(7)+"</td>"+"<td>"+rs.getString(8)+"</td>"+"</tr>");

}
}
%>

</table>
<br>
<br>
</form>
<form name="ApproveReject" action="ApproveRejectServlet" method="post">
<table align="center">
<tr><td><input type="number"  name="requestid" value=""></td></tr>
<tr><td><input type="submit" name="approve_reject" value="approverequest"></td></tr>  
<tr><td><input type="submit" name="approve_reject" value="rejectrequest"></td></tr>
</table>
</form>
</body>
</html>