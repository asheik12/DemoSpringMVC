<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${modelAtt.userName} Logged In</title>
</head>
<body>

<%-- <h3>Your Username : ${param.getUserName}</h3>
<h3>Your Password : ${param.getPassword}</h3> --%>

<h3>Your Username : ${modelAtt.userName}</h3>
<h3>Your Password : ${modelAtt.password}</h3>

</body>
</html>