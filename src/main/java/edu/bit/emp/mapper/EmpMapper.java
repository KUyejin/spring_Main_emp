package edu.bit.emp.mapper;

import java.util.List;

import edu.bit.emp.vo.EmpVO;
import edu.bit.emp.vo.jqueryVO;


public interface EmpMapper {
	
	List<EmpVO> getList();
	// ArrayList �Ⱦ���  �� List�� �����ֳ�?
	//������Ƽ�� Ȱ���Ϸ��� arrayList�θ��� List�� ����ϴ� �� ->�������� ���ؼ�

	List<jqueryVO> getList2();
}
