package com.RedCarpetUp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RedCarpetUp.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
