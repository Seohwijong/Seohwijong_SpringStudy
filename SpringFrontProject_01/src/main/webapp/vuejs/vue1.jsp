<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 <style type="text/css">
 .container{
 	margin-top: 50px;
 }
 .row {
 	margin: 0px auto;
 	width: 960px;
 }
 </style>
<!--  <script type="text/javascript"> -->
<!-- $(function(){ -->
<!-- 	$('#msg').keyup(function(){ -->
<!-- 		let m=$('#msg').val(); -->
<!-- 	$('#print').text(m); -->
<!-- 	}) -->
<!-- }) -->
<!-- </script> -->
</head>
<body>
<div class="container">
	<div class="row">
		입력:<input type="text" v-model="msg" size="30" class="input-sm">
	
	<div id="print">
	{{msg}}
	</div>
	</div>
</div>
<script>
	new Vue({
		el:'.container',
		data:{
			msg:''
		}
	})
</script>
</body>
</html>