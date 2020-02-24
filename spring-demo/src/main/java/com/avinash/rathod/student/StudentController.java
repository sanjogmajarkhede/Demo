package com.avinash.rathod.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("/students")
	public List<Student> getStudents() {
		return service.getAllStudents();
	}
	
	@RequestMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public String addStudents(@RequestBody Student students) {
		if (service.addStudent(students)) {
			return "Student added successfuly.";
		} else {
			return "Error while adding student";
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student student) {

		if (service.updateStudent(id, student)) {
			return "Record updated successfuly.";
		} else {
			return "Error while updating record.";
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	public String deleteStudent(@PathVariable int id) {
		
		if (service.deleteStudent(id)) {
			return "Record deleted successfuly";
		} else {
			return "Error occured while deleting record.";
		}
	}
}
