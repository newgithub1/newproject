<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

<script type="text/javascript" src="dwr/interface/AjaxController.js"></script>
<script type="text/javascript" src="dwr/engine.js"></script>
<script src="js/myRecords.js"></script>
</head>
<body >
<button onclick="getData()">Button</button>
<table>
<thead>
<tr>
<th>sid</th>
<th>college</th>
<th>nm_fk</th>
<th>name</th>
</tr>
</thead>
<tbody id="dp"></tbody>

</table>
</body>
</html>