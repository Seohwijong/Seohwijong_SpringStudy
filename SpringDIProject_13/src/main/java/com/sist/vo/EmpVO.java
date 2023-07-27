package com.sist.vo;
import java.util.*;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class EmpVO {
	private int empno,sal,deptno,comm;
	private String ename,job,dbday;
	private Date hiredate;
	// Join => 포함클래스 ==> 합쳐질 VO를 합칠 VO에 가져온다
	private DeptVO dvo=new DeptVO();
}
