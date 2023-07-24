package com.sist.main;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Setter;

public class MainClass {
	@Setter
	private GoodsDAO dao;
	public static void main(String[] args) {
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		MainClass mc=(MainClass)app.getBean("mc");
//		GoodsDAO dao=(GoodsDAO)app.getBean("dao"); =>이걸로 그냥 하면 안되나? 되네?
		List<String> list=mc.dao.goodsNameList();
		for(String vo:list)
		{
			System.out.println(vo);
		}
	}
}
