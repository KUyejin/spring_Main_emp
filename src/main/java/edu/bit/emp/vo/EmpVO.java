package edu.bit.emp.vo;

import java.sql.Timestamp;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpVO {
	
	private int empno;	     //EMPNO    NOT NULL NUMBER(4)    
	private String ename;	//ENAME   VARCHAR2(10) 
	private String job;	    //JOB VARCHAR2(9)  
	private int mgr;	    //MGR  NUMBER(4)    
	private Timestamp hiredate;	// HIRE  DATEDATE         
	private int sal;	    //SAL NUMBER(7,2)  
	private int comm;	    //COMM NUMBER(7,2)  
	private int deptno;	    //DEPTNO  NUMBER(2)    
	
		
	
	//서버단에서 처리
	public int getPhoto() { 
		Random r = new Random();
		return r.nextInt(5) + 1;
	}
	
	

}
