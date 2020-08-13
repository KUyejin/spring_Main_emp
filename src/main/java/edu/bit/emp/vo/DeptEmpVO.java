package edu.bit.emp.vo;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DeptEmpVO { //�ϴ��(1:N) ����� �̸�����
	
	int deptno; 
	String dname;
	String loc;
	
	List<EmpVO> empList;
	

}
