function getMyRecord()
{
	var a=document.getElementById("nm").value;
	
	AjaxController.getMyStudentRecord(a,stuRecord);
}
function stuRecord(res){
	var temp=""
	if(res!=null){ 
		temp='<tr><td>'+res.sid+'</td><td>'+res.college+'</td><td>'+res.name+'</td></tr>';
		
		document.getElementById("dp").innerHTML+=temp;
	}
	
}
function getAllRecords()
{
	AjaxController.getAllEmployeeRecord(empRecord)
	}
function empRecord(result){
	var temp="";
	if(result!=null && result.length>0){
		for(var i=0;i<result.length;i++)
			{
		temp+='<tr><td>'+result[i].empid+'</td><td>'+result[i].empname+'</td></tr>';
			}
		document.getElementById("cp").innerHTML=temp;
	}
}