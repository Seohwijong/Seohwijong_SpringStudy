package com.sist.aop;
/*
 *     aspect : AOP는 OOP를 대체하는 프로그램이 아니다
 *              OOP를 보완
 *              *** OOP => 콜백함수가 존재하지 않는다
 *                         ------ 시스템에 의해 자동 호출되는 함수 (main , service)
 *              => 한개 , 두개의 공통으로 사용되는 내용 => 메소드로 처리
 *                 getConnection , disConnection
 *              => 여러개가 공통으로 사용되는 내용 => 클래스
 *                 CreateDataBase
 *              --------------------- 공통모듈
 *      스프링에서는 반복적인 코딩을 모아서 관리 => 필요시에 의해 자동으로 호출
 *      -------------------------------------------------------- AOP
 *      *** 사용자 정의는 많이 사용하지 않는다
 *      
 *      AOP
 *      ---
 *       어떤 메소드에 적용 : PointCut (메소드명을 지정)
 *       => pointcut="execution(* com.sist.main.*.*(..))"
 *       					   리턴형			클래스명 메소드명 (..)
 *       												  매개변수
 *       					   
 *       호출되는 위치 설정
 *       
 *                         
 */
import java.util.*;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sist.dao.*;
@Aspect
@Component
public class EmpAspect {
	@Autowired
	private EmpDAO dao;
	
	@Before(value= "execution(* com.sist.dao.EmpDAO.emp*(..))") //try 시작과 동시에 호출
	public void getConnection()
	{
		System.out.println("오라클 연결");
		dao.getConnection();
	}
	@After("execution(* com.sist.dao.EmpDAO.emp*(..))") // finally에서 호출
	public void disConnection()
	{
		System.out.println("오라클 해제");
		dao.disConnection();
	}
	@AfterReturning(value= "execution(* com.sist.dao.EmpDAO.emp*(..))",returning="obj") //정상 수행 => return값을 받아서 처리
	public void print(Object obj)
	{
		List<EmpVO> list=(List<EmpVO>)obj;
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getDbday()+" "+vo.getSal());
		}
	}
//	@AfterThrowing(value= "execution(* com.sist.dao.EmpDAO.emp*(..))",throwing="obj") //catch절 수행시 수행
//	public void exception(Throwable ex)
//	{
//		System.out.println("에러 발생");
//		ex.printStackTrace();
//	}
}
