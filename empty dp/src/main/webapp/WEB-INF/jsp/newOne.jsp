<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="dwr/interface/AjaxController.js"></script>
<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="js/newOne.js"></script>
<title>Insert title here</title>
</head>
<body>
<input type="text" id="dp">
<button type="button" onclick="myRecords()">Get</button>
<table>
<thead>
<tr>
<th>SNo</th>
<th>Location</th>
<th>Name</th>
<th>RegNo</th>
<th>Status</th>
</tr>
</thead>
<tbody id="aa"></tbody>

</table>

</body>
</html>