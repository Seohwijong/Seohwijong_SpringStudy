package com.sist.main;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.*;
import com.sist.vo.*;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		
	}
//	@Test
//	public void locationMain()
//	{
//		ApplicationContext app=
//				new ClassPathXmlApplicationContext("app.xml");
//		LocationDAO dao=(LocationDAO)app.getBean("ldao");
//		List<SeoulLocationVO> list=dao.locationListData();
//		for(SeoulLocationVO vo:list)
//		{
//			System.out.println(vo.getNo()+"."+vo.getTitle());
//		}
//	}
//	@Test
//	public void locationDetail()
//	{
//		Scanner scan=new Scanner(System.in);
//		System.out.print("번호 입력: ");
//		int no=scan.nextInt();
//		ApplicationContext app=
//				new ClassPathXmlApplicationContext("app.xml");
//		LocationDAO dao=(LocationDAO)app.getBean("ldao");
//		SeoulLocationVO vo=dao.locationDetailData(no);
//		System.out.println("번호 :"+vo.getNo());
//		System.out.println("이름 :"+vo.getTitle());
//		System.out.println("주소 :"+vo.getAddress());
//		System.out.println("설명 :"+vo.getMsg());
//	}
	
	
	
	
	
	
	
//	@Test
//	public void natureMain()
//	{
//		ApplicationContext app=
//				new ClassPathXmlApplicationContext("app.xml");
//		NatureDAO dao=(NatureDAO)app.getBean("ndao");
//		List<SeoulNatureVO> list=dao.natureListData();
//		for(SeoulNatureVO vo:list)
//		{
//			System.out.println(vo.getNo()+"."+vo.getTitle());
//		}
//	}
//	@Test
//	public void natureDetailData()
//	{
//		Scanner scan=new Scanner(System.in);
//		System.out.print("번호 입력: ");
//		int no=scan.nextInt();
//		ApplicationContext app=
//				new ClassPathXmlApplicationContext("app.xml");
//		NatureDAO dao=(NatureDAO)app.getBean("ndao");
//		SeoulNatureVO vo=dao.natureDetailData(no);
//		System.out.println("번호 :"+vo.getNo());
//		System.out.println("이름 :"+vo.getTitle());
//		System.out.println("주소 :"+vo.getAddress());
//		System.out.println("설명 :"+vo.getMsg());
//		
//	}
	
	
	
	
	
	
//	@Test
//	public void shopMain()
//	{
//		ApplicationContext app=
//				new ClassPathXmlApplicationContext("app.xml");
//		ShopDAO dao=(ShopDAO)app.getBean("sdao");
//		List<SeoulShopVO> list=dao.shopListData();
//		for(SeoulShopVO vo:list)
//		{
//			System.out.println(vo.getNo()+"."+vo.getTitle());
//		}
//	}
	@Test
	public void shopDetailData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("번호 입력: ");
		int no=scan.nextInt();
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		ShopDAO dao=(ShopDAO)app.getBean("sdao");
		SeoulShopVO vo=dao.shopDetailData(no);
		System.out.println("번호: "+vo.getNo());
		System.out.println("이름: "+vo.getTitle());
		System.out.println("주소: "+vo.getAddress());
		System.out.println("설명: "+vo.getMsg());
	}
}
