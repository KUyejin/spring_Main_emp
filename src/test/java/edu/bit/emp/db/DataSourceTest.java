package edu.bit.emp.db;

import static org.junit.Assert.*;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.emp.service.EmpService;
import lombok.extern.log4j.Log4j;


@RunWith(SpringRunner.class) //IOC�����̳ʸ� ����� �� - ��Ĺ�������ص���
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //<-�긦 �ҷ��о�� dataSource�о����
@Log4j
//Ctrl+shift +o(5?) �� ġ�� �ڵ����� import��
public class DataSourceTest {

	@Inject
	DataSource dataSource;
	
	@Inject
	EmpService EmpService;
	
	@Test
	public void testDatasource() {
		log.info(dataSource); 
	}
	
	@Test
	public void EmpService() {
		log.info(EmpService.empList()); 
	}

}
