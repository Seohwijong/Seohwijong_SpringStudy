<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container{
   margin-top: 50px;
}
.row {
  margin: 0px auto;
  width:450px;
}
</style>
</head>
<body>
 <div class="container">
  <div class="row">
	<table class="table">
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>직위</th>
			<th>입사일</th>
			<th>사번</th>
		</tr>
		<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.empno }</td>
			<td>${vo.ename }</td>
			<td>${vo.job }</td>
			<td>${vo.dbday }</td>
			<td>${vo.deptno }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>