<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<marquee direction="right" scrollamount="12"  behavior="scroll">MEETING ROOM BOOKING SYSTEM</marquee>
<meta charset="ISO-8859-1">
<title>Delete User</title>
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
<form name="NewUser" style="text-align:center" method="post" action="DeleteUserServlet">
<h2 align="center" >Deleting A User</h2>
<table align="center" >
<tr><td>UserName:</td><td><input type="text" name="user" value=""></td></tr>
<tr><td><input type="reset" name="index_clear" value="Clear"></td>
<td><input type="submit" name="index_validate" value="submit"></td></tr>
</table>
<c:if test="${not empty message}">
    <h3 style='color:green'>${message}</h3>
    <c:remove var="message"/>
</c:if>
</form>
</body>
</html>