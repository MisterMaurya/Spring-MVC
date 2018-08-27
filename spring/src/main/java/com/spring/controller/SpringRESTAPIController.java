package com.spring.controller;

import java.util.ArrayList;

import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Student;

@Controller
public class SpringRESTAPIController {
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ArrayList<Student> getStudentList() {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		student1.setName("Rahul");
		student2.setName("Pawan");
		student3.setName("Deepak");
		student4.setName("Amir");
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		System.out.println("version: " + SpringVersion.getVersion());
		return studentList;

	}

}