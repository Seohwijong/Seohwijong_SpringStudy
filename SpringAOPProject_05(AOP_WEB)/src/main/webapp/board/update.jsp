<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
		Spring
		= XML (설정파일) 4버전 이하 (유지보수) : setting
		= 자바 = 5버전 (6버전 자바로 설정)
		---------------------------------------------------
		객체 생성 ~ 객체 소멸 (객체의 생명주기 관리) => 클래스(Component) 관리
		DI (의존성 주입) : 스프링에서 동작을 위해 필요한 데이터를 전송
		                 클래스와 클래스간의 연관관계를 설정 (IoC)
		                 = setter DI => setXxx()
		                 = constructor DI => 생성자의 매개변수에 값을 설정
		                 = method DI => 객체생성시(init-method) , 객체소멸시(destory-method)
		                 = 나머지 메소드는 프로그램에 맞게 개발자 호출
		AOP (공통모듈) : 프로그램에서 반복적으로 수행
		   => 자동 호출
		   => 지정 => 어떤 메소드 (PointCut)
		             위치 설정 (JointPoint)
		             ----------------------- Advice => Advice여러개 묶어서 (Aspect)
		             =>기존의 소스에 지정된 위치의 메소드를 묶어주는 역할 => 위빙
		             @Before
		             public void aaa(){}
		             @After
		             public void bbb(){}
		             @AfterThrowing
		             public void ccc(){}
		             @AfterReturning
		             public void ddd(){}
		             @Around
		             public void eee(){}
		             public String display()
		             {
		             	@Before
		             	=> aaa();
		             	try
		             	{
		             		---------------------@Around => eee(); setAutoCommit(false)
		             			소스코딩
		             		---------------------@Around =<> commit();
		             	}catch(Exception ex)
		             	{
		             		@AfterThrowing
		             		=> ccc();
		             	}
		             	return ""; @AfterReturning => ddd();
		             }
		
		MVC : 웹 라이브러리
		
		DispatcherServlet : Front Controller (요청 => 응답)
		 => 설정 (동작을 위한 설정)
		 => web.xml에 등록 (서블릿은 개발자가 호출하는 것이 아니라 톰캣에 의해 호출)
		    -------- 톰캣에서 읽어가는 파일
		 => 사용자 정의 클래스를 등록한 파일 전송 application-*.xml
		 Model (Controller) : 요청에 대한 처리 => 결과값을 모아서 DispatcherServlet으로
		  => 모델찾기 : HandelrMapping
		 View(JSP) : request , session전송 받아서 화면 출력
		  => ViewResolver
		 ----------------- MVC동작을 위한 기본 틀이 만들어져 있다
		 								----- 설정
		 								- 클래스 등록 (XML,Java)
		 								
		 								- 메소드 : @RequestMapping, @GetMapping...
		 클래스 등록 (모든 클래스가 등록되는 것은 아니다)
		 XML
		  <bean class="" id="">
		  <context:component-scan base-package="">
		 어노테이션
		  기능별 구분
		  --------
		  @Component : 일반 클래스 (MainClass , 크롤링 , OpenAPI...)
		  @Repository : DAO(저장소)
		  @Service : DAO+DAO , 의존성이 낮게...
		  @Controller : Model (페이지 관리) => 화면 이동
		  @RestController : Model (데이터 관리) => 화면에 출력할 데이터를 전송
		   ---- 다른 언어와 연동 (JavaScript , Kotlin)
		        ------------ 일반 문자열 , JSON , XML
		         						------ Ajax, VueJS, React => 자동 파싱
		  @ControllerAdvice : Controller클래스 공통으로 사용되는 예외처리
		  ==> 찾기가 빠르다
		  
		  *** 입사 (개발자)
		      1) 소스분석 (회사)
		      web.xml / server.xml / application.xml
		      클래스 (Model => DAO (Service) => JSP)
		  *** React / Vue / MSA (Spring Cloud)
		  	  -------------------------------- CI/CD
		  
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.row {
  margin: 0px auto;
  width:800px;
}
</style>
</head>
<body>
<div class="wrapper row3">
  <main class="container clear">
  <div class="row">
    <h2 class="sectiontitle">고쳐</h2>
     <form method="post" action="../board/update_ok.do">
      <table class="table">
        <tr>
          <th width=20% class="text-right">이름</th>
          <td width=80%>
           <input type=text name=name size=20 class="input-sm"  value="${vo.name }">
           <input type=hidden name=no value="${vo.no }">
          </td>
        </tr>
        <tr>
          <th width=20% class="text-right">제목</th>
          <td width=80%>
           <input type=text name=subject size=50 class="input-sm" value="${vo.subject }">
          </td>
        </tr>
        <tr>
          <th width=20% class="text-right">내용</th>
          <td width=80%>
           <textarea rows="10" cols="52" name="content">${vo.content }</textarea>
          </td>
        </tr>
        <tr>
          <th width=20% class="text-right">비밀번호</th>
          <td width=80%>
           <input type=password name=pwd size=10 class="input-sm">
          </td>
        </tr>
        <tr>
          <td colspan="2" class="text-center">
           <input type=submit value="수정" class="btn btn-sm btn-primary">
           <input type=button value="취소" class="btn btn-sm btn-info"
            onclick="javascript:history.back()">
          </td>
        </tr>
      </table>
      </form>
   </div>
   </main>
</div>
</body>
</html>