package MedSys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 

@RequestMapping("/employees/")


public class EmployeeController {

	
	
	@RequestMapping ("/")
	
	public String index() { 
		
		return "/WEB-INF/views/index.jsp";
		
		
	}

	

	
	
	
	
}
