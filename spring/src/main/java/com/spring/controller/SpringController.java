package com.spring.controller;

import java.util.ArrayList;

import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.Student;

@Controller
public class SpringController /*extends AbstractController */{

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getIndexPage(){
		ModelAndView mv = new ModelAndView("details");
		return mv;
	} 
	
	
	

	/*@RequestMapping("/admin/{name}/{country}")
	public ModelAndView showPage(@PathVariable("name") String name,@PathVariable("country") String country){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg","welcome in spring mvc "+name+" country "+country);
		return mv;
	} */
	
	/*@RequestMapping("/admin/{name}/{country}")
	public ModelAndView showPath(@PathVariable Map<String, String> var){
		String name = var.get("name");
		String country = var.get("country");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg","welcome in spring mvc "+name+" country "+country);
		return mv;
	} */
	
	/*@RequestMapping(value="/details", method = RequestMethod.GET)
	public ModelAndView inputDetails(){
		ModelAndView mv = new ModelAndView("details");
		return mv;
	}
	*/
	
	/*@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView getDetails(@RequestParam("name") String name,@RequestParam("hobby") String hobby){
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("name",name);
		mv.addObject("hobby",hobby);
		mv.addObject("msg","add Successfully");
		
		return mv;
	}*/
	
	/*@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView getDetails(@RequestParam Map<String,String> var){
	
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("name",var.get("name"));
		mv.addObject("hobby",var.get("hobby"));
		mv.addObject("msg","add Successfully now");
		
		return mv;
	
	}*/
	
	/*@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveDetails(@RequestParam("name") String name1,@RequestParam("hobby") String hobby){
		Student student1 = new Student();
		student1.setName(name1);
		student1.setHobby(hobby);
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("msg",student1);
		return mv;
	}
	*/
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView getDetails(@ModelAttribute("student") Student student, BindingResult res){
		if(res.hasErrors()){
			ModelAndView mv = new ModelAndView("details");
			return mv;
		}
		ModelAndView mv = new ModelAndView("details");
		return mv;
	}
	
	
/*	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[]{"id","name"});
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, "dob",new CustomDateEditor(format, false));
	}*/
	
	
	@ModelAttribute
	public void setHeader(Model model){
		model.addAttribute("res", "Student Registration");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("msg", "Everything is done now");
		return mv;
	}*/

}
