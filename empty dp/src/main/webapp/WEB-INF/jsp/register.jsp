<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Register Form</h2>
<form action="registerForm.mm">
USERID <input type="text" name=userId><br>
<br>
USERNAME <input type="text" name=userName><br>
<br>
PASSWORD <input type="text" name=password><br>
<br>
OTP <input type="text" name=otp><br>
<br>
<input type="submit">
</form>
</center>
<table>
  <thead>
  </thead>
  <tbody>
  <c:forEach var="ab" items="${es}">
  <tr>
  <td>${ab.id}</td>
  <td>${ab.otp}</td>
  <td>${ab.password}</td>
  <td>${ab.userId}</td>
  <td>${ab.userName}</td>
  </tr>
  </c:forEach>
  </tbody>
  </table>
</body>
</html>