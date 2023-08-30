package com.sist.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import com.sist.dao.*;
import com.sist.vo.*;
@Aspect //공통모듈 메모리할당하는애가 아님
@Component // 메모리할당
public class FooterAspect {
  @Autowired
  private AspectDAO dao;
  
  @After("execution(* com.sist.web.*Controller.*(..))")
  public void footerData()
  {
	  // => 매개변수에 값을 채워준다 (DispatcherServlet)
	  // => @Controller, @RestController에서만 가능 
	  HttpServletRequest request= ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	  // PageContext
	  
	  List<FoodVO> flist=dao.foodTop7Data();
	  List<String> slist=dao.seoulTop7Data();
	  List<String> rlist=dao.recipeTop7Data();
	  
	  request.setAttribute("flist", flist);
	  request.setAttribute("slist", slist);
	  request.setAttribute("rlist", rlist);
	  	
  }
}
