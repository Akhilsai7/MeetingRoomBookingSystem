<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<marquee direction="right" scrollamount="12"  behavior="scroll">MEETING ROOM BOOKING SYSTEM</marquee>
<meta charset="ISO-8859-1">
<title>Admin MRB</title>
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
<body style="background-color:skyblue;">
<h2 align="center" >Facility Manager Functionalities</h2>
<form>
<table align="center">
<tr><td><a href="AddUser.jsp"><input type="button" name="adduser" value="Add a new User"></a></td></tr>  
<tr><td><a href="DeleteUser.jsp"><input type="button" name="deleteuser" value="Delete a User"></a></td></tr>
<tr><td><a href="AcceptRejectServlet"><input type="button" name="approvereject" value="Approve or Reject a Request"></a></td></tr> 
<tr><td><a href="NoofRequest.jsp"><input type="button" name="noofrequests" value="No of requests on a day"></a></td></tr>
<tr><td><a href="Mrbookingtimes.jsp"><input type="button" name="noofbookings" value="No of meetingrequests in a month"></a></td></tr>
<tr><td><a href="MostUtilisedResourceServlet"><input type="button" name="Mostusedresource" value="Most Used Resource"></a></td></tr>
</table>
</form>
</body>
</html>