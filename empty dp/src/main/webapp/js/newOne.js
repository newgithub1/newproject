function myRecords(){
	var name=document.getElementById("dp").value;
	AjaxController.getParticularRecord(name,stuRecord);
}
function stuRecord(res){
	var temp="";
	if(res!=null){
		temp='<tr><td>'+res.sl_No+'</td><td>'+res.location+'</td><td>'+res.name+'</td><td>'+res.reg_No+'</td><td>'+res.status+'</td></tr>';
	}
	document.getElementById("aa").innerHTML=temp;
}