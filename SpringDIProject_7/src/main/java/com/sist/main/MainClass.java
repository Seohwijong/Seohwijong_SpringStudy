package com.sist.main;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.vo.*;
import com.sist.dao.*;
// <bean id="mainClass" class="com.sist.main.MainClass">
// id가 없는 경우에는 class명이 아이디로 설정된다 (첫자만 소문자)
// EmpDAO => empDAO
@Component("mc")
public class MainClass {
	// => getBean()
	@Autowired
	private EmpDAO dao;
	public static void main(String[] args) {
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		MainClass mc=(MainClass)app.getBean("mc");
		List<EmpVO> list=mc.dao.empListData();
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getDbday()+" "+vo.getDbsal().trim());
		}
		System.out.println("==========================");
		Scanner scan=new Scanner(System.in);
		System.out.print("사번 입력: ");
		int empno=scan.nextInt();
		EmpVO vo=mc.dao.empDetailData(empno);
		System.out.println("====사====원====정====보====");
		System.out.println("사번 : "+vo.getEmpno());
		System.out.println("이름 : "+vo.getEname());
		System.out.println("직위 : "+vo.getJob());
		System.out.println("선임 : "+vo.getMgr());
		System.out.println("입사일 : "+vo.getDbday());
		System.out.println("급여 : "+vo.getDbsal().trim());
		System.out.println("뽀나스 : "+vo.getComm());
		System.out.println("부서 번호 : "+vo.getDeptno());
		System.out.println("==========================");
		scan=new Scanner(System.in);
		System.out.print("검색 이름 입력 : ");
		String ename=scan.next();
		list=mc.dao.empFindData(ename);
		System.out.println("====검====색====결====과====");
		for(EmpVO fvo:list)
		{
			System.out.println(fvo.getEmpno()+" "+fvo.getEname()+" "+fvo.getJob()+" "+fvo.getDbday()+" "+fvo.getDbsal().trim());
		}
	}
}
