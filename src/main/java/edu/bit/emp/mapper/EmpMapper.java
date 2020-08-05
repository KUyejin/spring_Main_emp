package edu.bit.emp.mapper;

import java.util.List;

import edu.bit.emp.vo.EmpVO;
import edu.bit.emp.vo.jqueryVO;


public interface EmpMapper {
	
	List<EmpVO> getList();
	// ArrayList 안쓰고  왜 List로 적어주나?
	//폴리몰티즘 활용하려고 arrayList부모인 List를 사용하는 것 ->유연성을 위해서

	List<jqueryVO> getList2();
}
