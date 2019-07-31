<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Cancel Meeting Request</title>
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
<form name="Newrequest" style="text-align:center" method="post" action="CancelRequestServlet">
<h2 align="center" >Cancel Your Meeting Request</h2>
<table align="center" >
<tr><td>RequestID:</td><td><input type="number" name="id" value=""></td></tr>
<tr><td><input type="submit" name="SUBMIT" value="submit"></td></tr>
</table>
</form>
</body>
</html>