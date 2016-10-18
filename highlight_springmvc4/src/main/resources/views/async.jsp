<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>servlet async support</title>

</head>
<body>



<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript">

	deferred();//1
	
	function deferred(){
	    $.get('defer',function(data){
	        console.log(data); //2
	        deferred(); //3
	    });
	}


</script>
</body>
</html>