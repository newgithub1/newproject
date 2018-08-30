<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <title>Insert title here</title>
   <script src="https://apis.google.com/js/platform.js" async defer></script>
   <meta name="google-signin-client_id" content="897217605849-j8gao3gtfra1rkmbo81q9direlee879t.apps.googleusercontent.com">
</head>
<body>
   
  <h1>WELCOME</h1>
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