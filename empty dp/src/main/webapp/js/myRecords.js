function getData(){
	AjaxController.getMyAllRecord(myDatas);
}
function myDatas(res){
	alert(res);
	temp="";
	if(res!=null && res.length>0){
		for(var i=0;i>res.length;i++){
			temp='<tr><td>'+ res[i].sid+'</td><td>'+res[i].college+'</td><td>'+res[i].nm_fk+'</td><td>'+res[i].name+'</td></tr>';
		}
	}
	document.getElemntById("dp").innerHTML=temp;
	document.getElementById("demo").innerHTML=temp;
}
