package org.demo.Java.SpringMVCTEST5.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/hi2")
	public ModelAndView test2(HttpServletResponse response) throws IOException{
		return new ModelAndView("home2","msg","vinay g");
	}
}
