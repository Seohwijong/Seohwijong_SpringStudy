<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="wrapper row4">
  <footer id="footer" class="clear"> 
    <div class="one_quarter first">
      <h6 class="title">맛집 Top7</h6>
      <ul class="nospace">
      <c:forEach var="fvo" items="${foodList }">
		<li><a href="#">${fvo.name }</a></li>
	  </c:forEach>
      </ul>
    </div>

    <div class="one_quarter">
      <h6 class="title">서울 여행 Top7</h6>
      <ul class="nospace">
      <c:forEach var="svo" items="${seoulList }">
		<li><a href="#">${svo.title }</a></li>
	  </c:forEach>
      </ul>
    </div>
    <div class="one_quarter">
      <h6 class="title">로그인</h6>
      <form class="btmspace-30" method="post" action="#">
        <fieldset>
          <legend>Newsletter:</legend>
          <input class="btmspace-15" type="text" value="" placeholder="Email">
          <button type="submit" value="submit">Submit</button>
        </fieldset>
      </form>
      <ul class="faico clear">
        <li><a class="faicon-facebook" href="#"><i class="fa fa-facebook"></i></a></li>
      </ul>
    </div>
  </footer>
</div>
<div class="wrapper row5">
  <div id="copyright" class="clear"> 
    <p class="fl_left">쌍용 강북 교육 센터&nbsp;&nbsp;<a href="https://github.com/Seohwijong">D 강의장</a></p><p class="fl_right">서휘종</p>
  </div>
</div>
</body>
</html>