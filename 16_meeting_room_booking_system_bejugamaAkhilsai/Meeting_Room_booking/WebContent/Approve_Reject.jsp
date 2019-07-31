<%@ page import="java.util.*,java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body style="text-align:center;background-color:skyblue;font-size:20px;">


<form style="text-align:center" method="post" action="ApproveRejectServlet">
<table style=text-align:"center" border="3S" >
<thead>
<h2 style='text-align:center;background-color:cyan;'>ACCEPT OR REJECT THE REQUEST</h2>
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
//out.println("<tr><td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getDate(2)+"</td>"+"<td>"+rs.getTime(3)+"</td>"+"<td>"+rs.getTime(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getInt(6)+"</td>"+"<td>"+rs.getInt(7)+"</td>"+"<td>"+rs.getString(8)+"</td>"+"</tr>");
out.println("<tr><td>"+rs.getInt(1)+"</td></tr>");
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