package com.RedCarpetUp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.RedCarpetUp.Entity.Student;
import com.RedCarpetUp.Exceptions.StudentExceptions;
import com.RedCarpetUp.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository sRepo;
	
	@Override
	public List<Student> getAllStudents() throws StudentExceptions {
		List<Student> students = sRepo.findAll();
		if(students.isEmpty())throw new StudentExceptions("Students does not exist...");
		else return students;
	}

	@Override
	public Student registerStudent(Student student) throws StudentExceptions {
		Optional<Student> opt = sRepo.findById(student.getStuId());  
		if(opt.isPresent())throw new StudentExceptions("Students already exist...");
		else return sRepo.save(student);
	}

	@Override
	public Student getStudentById(Integer id) throws StudentExceptions {
		Optional<Student> opt = sRepo.findById(id);  
		if(opt.isEmpty())throw new StudentExceptions("Students does not exist...");
		else return opt.get();
	}

	@Override
	public Student deleteStudentById(Integer id) throws StudentExceptions {
		Optional<Student> opt = sRepo.findById(id);  
		if(opt.isEmpty())throw new StudentExceptions("Students does not exist...");
		else {
			Student s = opt.get();
		    sRepo.deleteById(id);
			return s;
		}
	}

}
