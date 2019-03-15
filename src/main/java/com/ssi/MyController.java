package com.ssi;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

	@RequestMapping("testing")
	public void test(){
		System.out.println("working");
	}
	
	@RequestMapping("/inputpage")
	public String show(){
		System.out.println("Checking");
		return "details.jsp";
	}
}
