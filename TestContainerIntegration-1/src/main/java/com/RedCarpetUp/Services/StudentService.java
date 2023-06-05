package com.RedCarpetUp.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.RedCarpetUp.Entity.Student;
import com.RedCarpetUp.Exceptions.StudentExceptions;


public interface StudentService {
	
	List<Student> getAllStudents() throws  StudentExceptions;
	
	Student registerStudent(Student st) throws  StudentExceptions;
	
	Student getStudentById(Integer id) throws  StudentExceptions;
	
	Student deleteStudentById(Integer id) throws StudentExceptions;

}
