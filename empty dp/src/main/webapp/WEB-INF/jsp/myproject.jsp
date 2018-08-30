<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="dwr/interface/AjaxController.js"></script>
<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="js/myproject.js"></script>
</head>

<body>
<center>
<input type="text" id="nm">
<button type="button" onclick="getMyRecord()">get</button>

<table>
<thead>
<tr>
<th>SID</th>
<th>COLLEGE</th>
<th>NAME</th>
</tr>
</thead>
</center>
<button type="button" onclick="getAllRecords()">GetRecords</button>
<tbody id="dp"></tbody>
<thead>
<tr>
<th>EMPID</th>
<th>EMPNAME</th>
</tr>
</thead>
<tbody id="cp"></tbody>

</table>
</body>
</html>