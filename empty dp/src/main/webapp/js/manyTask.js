function againObject(){
	AjaxController.getObjectRecords(stu1Records);
}
function stu1Records(res){

	var temp="";
	for(var i=0;i<res.length;i++){
		temp+='<tr><td>'+res[i][0]+'</td><td>'+res[i][1]+'</td><td>'+res[i][2]+'</td><td>'+res[i][3]+'</td><td>'+res[i][4]+'</td></tr>';
	}
	document.getElementById("object").innerHTML=temp;
}