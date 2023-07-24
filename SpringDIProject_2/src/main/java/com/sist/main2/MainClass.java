package com.sist.main2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 *     객체 생성 , init-method
 *     setter 처리
 *     destory-method
 */
public class MainClass {
	public static void main(String[] args) {
		String[] xml= {"member.xml","sawon.xml","student.xml"};
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app-*.xml");
		Sawon sa=(Sawon)app.getBean("sa");
		sa.init();   
		sa.print();
		Member mem=(Member)app.getBean("mem");
		mem.init();
		mem.print();
		Student std=(Student)app.getBean("std",Student.class);
		std.init();
		std.print();
	}
}
