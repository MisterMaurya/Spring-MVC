package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController /*extends AbstractController */{

	@RequestMapping("/")
	public ModelAndView getIndexPage(){
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("msg","Hello, How are you today");
		return mv;
	} 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("msg", "Everything is done now");
		return mv;
	}*/

}
