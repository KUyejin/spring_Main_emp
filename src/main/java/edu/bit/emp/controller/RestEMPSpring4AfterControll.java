package edu.bit.emp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import edu.bit.emp.service.EmpService;
import edu.bit.emp.vo.EmpVO;
import edu.bit.emp.vo.RecVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */

//@RestController //(Controller+@ResponseBody) 예전에 만들었던 기존 문법을 버리는거. 
@Controller
@Log4j
@AllArgsConstructor 
 class RestBoardSpring4AfterController {
   
   
	private EmpService empservice;
   
   //메서드의 리턴타입을 기존과 다르게 처리한다는 것을 명시 
   //@ResponseBody  //@RestController적으면 ResponseBody필요없다.
   @CrossOrigin //같은 로컬접속 
   @RequestMapping("/restful/list")
   public List<EmpVO> before(Model model) { 
 
      log.info("list");
      List<EmpVO> empList = empservice.empList();
      log.info(empList);
      
      model.addAttribute("emps", empList);
     
      return empList;
   }
   
   
   
   
   
   
   
   
   
   //content_view.jsp에서 delete받아내야함
   // @DeleteMapping("/rest/delete/{bId}")//도 가능
   //@RequestMapping(value = "/rest/delete/{bId}", method = RequestMethod.DELETE)
	//public int restDelete(@PathVariable("bId") int bId) {
   	
   //	    log.info("restDelete");
	//	return  boardservice.remove(bId);
	//}
   
   
   @GetMapping("/restful/recArea")
   public String recArea() {
      
      log.info("recArea");
      return "recAjax";
   }
   
   @ResponseBody
   @RequestMapping("/restful/recAjax")
   public Double recArea(RecVO rec) {
      
      log.info("recArea");
      return rec.getArea();
   }
   
   
   
}