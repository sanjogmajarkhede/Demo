package com.avinash.rathod.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<Student>(Arrays.asList(
			new Student(123, "Avinash", "avinash@gmail.com", "8975791781", "Yavatmal"),
			new Student(124, "Shreyas", "shreyas@gmail.com", "8745962159", "Nagpur"),
			new Student(125, "Saurabh", "saurabh@gmail.com", "9978456128", "Pune"),
			new Student(126, "Sanjog", "sanjog@gmail.com", "8695478921", "Aurangabad"),
			new Student(127, "Tushar", "tushar@gmail.com", "8845972196", "Mumbai"),
			new Student(128, "Jemy", "jemy@gmail.com", "8845972196", "New York")
		));
	
	public List<Student> getAllStudents() {
		return students;
	}
	
	public Student getStudentById(int id) {
		return students.stream().filter(t -> t.getId() == id).findFirst().get();
	}
	
	public boolean addStudent(Student student) {
		students.add(student);
		return students.contains(student);
	}

	public boolean updateStudent(int id, Student student) {
		Student studentrecord;
		studentrecord = students.set(students.indexOf(getStudentById(id)), student);
		
		if (studentrecord != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteStudent(int id) {
		return students.removeIf(s -> s.getId() == id);
	}
}
