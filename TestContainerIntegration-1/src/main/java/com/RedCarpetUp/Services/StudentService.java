package com.RedCarpetUp.Services;

import java.util.List;

import com.RedCarpetUp.Entity.Student;
import com.RedCarpetUp.Exceptions.StudentExceptions;

public interface StudentService {
	
	List<Student> getAllStudents() throws  StudentExceptions;
	
	Student registerStudent() throws  StudentExceptions;
	
	Student getStudentById() throws  StudentExceptions;
	
	Student deleteStudentById() throws StudentExceptions;

}
