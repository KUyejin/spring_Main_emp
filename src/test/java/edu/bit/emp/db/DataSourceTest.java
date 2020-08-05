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


@RunWith(SpringRunner.class) //IOC컨테이너를 만드는 것 - 톰캣구동안해도됨
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //<-얘를 불러읽어들어서 dataSource읽어야함
@Log4j
//Ctrl+shift +o(5?) 를 치면 자동으로 import됨
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
