package MedSys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 

@RequestMapping("/patient/")


public class Patientcontroller {

	
	
	@RequestMapping ("/")
	
	public String patientPage() { 
		
		return "/WEB-INF/views/landing.jsp";		
		
	}

	
	
	
	
	
	
	
}
