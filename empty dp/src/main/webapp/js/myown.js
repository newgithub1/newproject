function showMyData(){
	var NM_FK=document.getElementById("mp").value;
	var COLLEGE=document.getElementById("cp").value;
	if(NM_FK=="" || COLLEGE==""){
		alert("This is your data:");
	}else{
		alert("Wrong data");
		document.getElementById("dp").submit();
	}
		
}