package com.sist.vo;
import java.util.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpVO {
	private int empno,sal,deptno,comm;
	private String ename,job,mgr,dbday,dbsal;
	private Date hiredate;
}
