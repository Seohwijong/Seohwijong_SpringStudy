package com.sist.main;

import java.sql.Date;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EmpVO {
	private int empno,mgr,sal,deptno,comm;
	private String ename,job;
	private Date hiredate;
	
}
