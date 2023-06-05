package com.RedCarpetUp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RedCarpetUp.Entity.Student;
import com.RedCarpetUp.Exceptions.StudentExceptions;
import com.RedCarpetUp.Services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService sdao;
	
	@GetMapping("")
	public  ResponseEntity<List<Student>> findAllStudents(){
		List<Student> students = sdao.getAllStudents();
		return new ResponseEntity<List<Student>>(students,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/{getId}")
	public  ResponseEntity<Student> getStudentByIdEntity(@RequestParam("getId") Integer id){
		Student student = sdao.getStudentById(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@GetMapping("/{deleteId}")
	public  ResponseEntity<Student> deleteStudentById(@RequestParam("deleteId") Integer id){
		Student student = sdao.deleteStudentById(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public  ResponseEntity<Student> deleteStudentById(@RequestBody Student student){
		Student student1 = sdao.registerStudent(student);
		return new ResponseEntity<Student>(student1,HttpStatus.OK);
	}
	
	
}
