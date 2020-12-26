package com.luv2code.springdemo.mvc;

//import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; 

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller to show the initial HTML form	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller to show the HTML form
	
//	@RequestMapping("/processForm")
//	public String processForm() {
//		return "hello-world";
//	}
	
	// below is our MODEL
	//new controller method to read data, process them and add to MODEL
	//then displaying results in the view page
	
//	@RequestMapping("/processForm2")
//	public String letsShoutDude(HttpServletRequest request, Model model) {
//		//read the request from the HTML form
//		String theName = (String) request.getParameter("studentName");
//		//convert data 
//		theName = theName.toUpperCase();
//		//create new message
//		String result = "Welcome " + theName + " !";
//		//add message to the model
//		model.addAttribute("message", result);
//		
//		return "hello-world";
//	}
	
	//other method of getting data from form using RequestParam(paramName in form)
	
	@RequestMapping("/processForm2")
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
		//read the request from the HTML form
		theName = theName.toUpperCase();
		//create new message
		String result = "Welcome " + theName + " !";
		//add message to the model
		model.addAttribute("message", result);
		
		return "hello-world";
	}
	
	
}
