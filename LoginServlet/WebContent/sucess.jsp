<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.io.naveen.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sucess page</title>
</head>
<body>
<h3>Login Page suceessful</h3>
<jsp:useBean id="user" class="org.io.naveen.dto.User" scope="request">
<jsp:setProperty property="username" name="user" value="newUser"/>
</jsp:useBean>

Hello <jsp:getProperty property="username" name="user" />

</body>
</html>