<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="dwr/interface/AjaxController.js"></script>
<script type="text/javascript" src="dwr/engine.js"></script>
<script src="js/innerjoin.js"></script>
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
</thead>
<tbody>
<c:forEach var="ab" items="${dp}" onclick="mymethod()">
<tr>
<td>${ab[0]}</td>
<td>${ab[1]}</td>
<td>${ab[2]}</td>
<td>${ab[3]}</td>
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>