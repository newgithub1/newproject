<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<script type="text/javascript" src="dwr/interface/AjaxController.js"></script>
<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="js/firstTask.js"></script>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">

		<button type="button" class="btn btn-info btn-sm" data-toggle="modal"
			data-target="#myModal" style="margin-top: 1%;" >Add Student</button>


		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Enter Details</h4>
					</div>
					<div class="modal-body">

						<div class="container-fluid">
							<div class="form-horizontal">

								<div class="form-group">
									<label class="control-label">name</label> <input type="text"
										class="form-control" id="a">
								</div>

								<div class="form-group">
									<label class="control-label">Reg No</label> <input type="text"
										class="form-control"id="b">
								</div>

								<div class="form-group">
									<label class="control-label">Location</label> <input
										type="text" class="form-control" id="c">
								</div>
								
								<div class="form-group">
									<label class="control-label">Status</label> 
									<input	type="text" class="form-control" id="d">
								</div>


							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" onclick="addStudentData()">Save</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>

			</div>
		</div>


		<div class="table-responsive" style="margin-top: 1%;">

			<table class="table table-bordered">

				<thead>
					<th>Sl.No</th>
					<th>Name</th>
					<th>Reg.No</th>
					<th>Location</th>
					<th>Status</th>
				</thead>

				<tbody id="po">
				<forEach var="ab">
					<tr>
						<td>${ab.sl_NO}</td>
						<td>${ab.location}</td>
						<td>${ab.name}</td>
						<td>${ab.reg_NO}</td>
						<td>${ab.status}</td>
					</tr>
					</forEach>
				</tbody>
				

			</table>

		</div>



	</div>

</body>
</html>
