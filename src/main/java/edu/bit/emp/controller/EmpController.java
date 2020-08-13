package edu.bit.emp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.emp.HomeController;
import edu.bit.emp.service.EmpService;
import edu.bit.emp.vo.DeptEmpVO;
import edu.bit.emp.vo.EmpVO;
import edu.bit.emp.vo.jqueryVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j //자동으로 logger생성해줌
@AllArgsConstructor
public class EmpController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private EmpService empservice; 
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
		
	
	@GetMapping("/list") //get방식으로 받겠다
	public String list(Model model) {
		log.info("list");
		
		List<EmpVO> empList = empservice.empList();
		log.info(empList);
		
		model.addAttribute("emps",empList);		
			
		return "list";		
	}
	
	@GetMapping("/jQueryList") //get방식으로 받겠다
	public String jQuerylist(Model model) {
		log.info("jQuerylist");		
		
		List<jqueryVO> jqueryList = empservice.jqueryList();
		model.addAttribute("jquery", jqueryList); 
		
		return "jQueryList";
							
	}
	
	@GetMapping("/index") //get방식으로 받겠다
	public String list2(Model model) {
		log.info("index");		
		
		List<EmpVO> empList = empservice.empList();
		model.addAttribute("list", empList); 
		
		return "index";							
	}
	
	
	@GetMapping("/index/{deptno}") //restful
	public String listDeptEmp(@PathVariable("deptno") int deptno, Model model) {
		log.info("listDeptEmp");
		
        DeptEmpVO deptEmp = empservice.deptEmpList(deptno);
		System.out.println(deptEmp.getEmpList());
		
		model.addAttribute("list", deptEmp.getEmpList());		
			
		return "index";		
	}
	

}
