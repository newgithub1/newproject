function showAllRecords(){
	AjaxController.showAllMyRecords(allRecords);
}
function allRecords(result){
	var temp="";
	if(result!=null && result.length>0){
		for(var a=0;a<result.length;a++){
			temp+='<tr><td>'+result[a].sl_No+'</td><td>'+result[a].location+'</td><td>'+result[a].name+'</td><td>'+result[a].reg_No+'</td><td>'+result[a].status+'</td></tr>';
		}
		document.getElementById("dp").innerHTML=temp;
	}
}