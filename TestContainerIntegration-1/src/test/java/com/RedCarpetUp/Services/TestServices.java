package com.RedCarpetUp.Services;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.RedCarpetUp.Entity.Adderess;
import com.RedCarpetUp.Entity.Student;

@SpringBootTest
public class TestServices {
	
	@Autowired
	private StudentService sService;
	
	@Test
	void testGetStudentById() {
		/*{
		    "stuId" : 1,
		    "name" : "Pradeep singroul",
		    "rollNo" : 1001,
		    "marks" : 956,
		    "address" :{
		        "addressId" : 101,
		        "city" : "Satna",
		        "districk" : "Satna",
		        "pincode" : 485001
		    }

		}*/
		Student s1 = sService.getStudentById(1);
		assertThat(s1.getName()).isEqualTo("Pradeep singroul");
		assertThat(s1.getRollNo()).isEqualTo(1001);
		assertThat(s1.getMarks()).isEqualTo(956);
		assertThat(s1.getAddress().getCity()).isEqualTo("Satna");
		assertThat(s1.getAddress().getPincode()).isEqualTo(485001);
	}
	
	/*@Test
	void testDeleteStudent() {
		{
		    "stuId" : 1,
		    "name" : "Pradeep singroul",
		    "rollNo" : 1001,
		    "marks" : 956,
		    "address" :{
		        "addressId" : 101,
		        "city" : "Satna",
		        "districk" : "Satna",
		        "pincode" : 485001
		    }

		}
		Student s1 = sService.deleteStudentById(1);
		assertThat(s1.getName()).isEqualTo("Pradeep singroul");
		assertThat(s1.getRollNo()).isEqualTo(1001);
		assertThat(s1.getMarks()).isEqualTo(956);
		assertThat(s1.getAddress().getCity()).isEqualTo("Satna");
		assertThat(s1.getAddress().getPincode()).isEqualTo(485001);
	}*/
	
	@Test
	void testRegisterStudent() {
		/*{
		    "stuId" : 1,
		    "name" : "Pradeep singroul",
		    "rollNo" : 1001,
		    "marks" : 956,
		    "address" :{
		        "addressId" : 101,
		        "city" : "Satna",
		        "districk" : "Satna",
		        "pincode" : 485001
		    }

		}*/
		Student stu = new Student(11, "Pradeep singroul", 1001, 956, new Adderess(101, "Satna", "Satna", (long) 485001));
		Student s1 = sService.registerStudent(stu);
		assertThat(s1.getName()).isEqualTo("Pradeep singroul");
		assertThat(s1.getRollNo()).isEqualTo(1001);
		assertThat(s1.getMarks()).isEqualTo(956);
		assertThat(s1.getAddress().getCity()).isEqualTo("Satna");
		assertThat(s1.getAddress().getPincode()).isEqualTo(485001);
	}
	

}
