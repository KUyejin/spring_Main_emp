package edu.bit.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.emp.mapper.EmpMapper;
import edu.bit.emp.vo.EmpVO;
import edu.bit.emp.vo.jqueryVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
@AllArgsConstructor
public class EmpServiceImpl implements EmpService {
		
	EmpMapper empMapper; //생성자 자동주입

	@Override
	public List<EmpVO> empList() {
		return empMapper.getList();
	}

	@Override
	public List<jqueryVO> jqueryList() {
		return empMapper.getList2();
	}

    


}
