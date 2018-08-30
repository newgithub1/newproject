function showError(){
	var USERNAME=document.getElementById("dp").value;
	var PASSWORD=document.getElementById("cp").value;
	if(USERNAME==" " ||PASSWORD==" "){
		alert("Login faild");
	}else{
		alert("Please enter valid details");
		document.getElementById("mp").submit();
	}
		
}