<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page For Employees</title>
</head>
<body>

<h2><center>Employee login Form</center></h2>
<form:form action="getResult" modelAttribute="modelAtt">
<center>UserName : <form:input type="text" path="UserName"></form:input></center>
<br>
<center>Password : <form:input type="password" path="Password"></form:input></center>
<br>
<center><input type="submit" value="Login"></center>
</form:form>
</body>
</html>