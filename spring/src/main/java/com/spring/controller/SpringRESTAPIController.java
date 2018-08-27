package com.spring.controller;

import java.util.ArrayList;

import org.springframework.core.SpringVersion;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Student;

@RestController
public class SpringRESTAPIController {
	/* @ResponseBody */
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
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

	@RequestMapping(value = "/list/{name}")
	public Student getStudentInfo(@PathVariable("name") String name) {
		Student student = new Student();
		student.setName(name);
		student.setId(20);
		return student;
	}

	/*@RequestMapping(value = "/update/{name}", method = RequestMethod.PUT)
	public boolean updateStudent(@PathVariable("name") String name, @RequestBody Student student) {
		 return true;
	}*/
	
	
	/*@RequestMapping(value = "/update/{name}", method = RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateStudent(@PathVariable("name") String name, @RequestBody Student student) {
		 return true;
	}*/
	
	/*@RequestMapping(value="/update/{name}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> update(@PathVariable("name") String name,@RequestBody Student student){
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}*/
	
	
	/*@RequestMapping(value="/update/{name}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> update(@PathVariable("name") String name,@RequestBody Student student){
		return new ResponseEntity<Boolean>(HttpStatus.OK);
		
	}*/
	
	@RequestMapping(value="/update/{name}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> update(@PathVariable("name") String name,@RequestBody Student student){
	
		HttpHeaders httpHeaders  = new HttpHeaders();
		httpHeaders.add("key1", "Value1");
		httpHeaders.add("key1", "Value1");
		httpHeaders.add("key1", "Value1");
		return new ResponseEntity<Boolean>(true,httpHeaders,HttpStatus.OK);
		
	}

}
