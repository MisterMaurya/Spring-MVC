package com.spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController /*extends AbstractController */{

	@RequestMapping("/")
	public ModelAndView getIndexPage(){
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("msg","Hello, How are you today");
		return mv;
	} 
	
	
	

	/*@RequestMapping("/admin/{name}/{country}")
	public ModelAndView showPage(@PathVariable("name") String name,@PathVariable("country") String country){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg","welcome in spring mvc "+name+" country "+country);
		return mv;
	} */
	
	@RequestMapping("/admin/{name}/{country}")
	public ModelAndView showPath(@PathVariable Map<String, String> var){
		String name = var.get("name");
		String country = var.get("country");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg","welcome in spring mvc "+name+" country "+country);
		return mv;
	} 
	
	@RequestMapping(value="/details", method = RequestMethod.GET)
	public ModelAndView inputDetails(){
		ModelAndView mv = new ModelAndView("details");
		return mv;
	}
	
	
	/*@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView getDetails(@RequestParam("name") String name,@RequestParam("hobby") String hobby){
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("name",name);
		mv.addObject("hobby",hobby);
		mv.addObject("msg","add Successfully");
		
		return mv;
	}*/
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView getDetails(@RequestParam Map<String,String> var){
	
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("name",var.get("name"));
		mv.addObject("hobby",var.get("hobby"));
		mv.addObject("msg","add Successfully now");
		
		return mv;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("msg", "Everything is done now");
		return mv;
	}*/

}
